from exceptions import *
from components import *
from formatter import *
import random
import os
from tkinter import *

class Pdformatter():

    """formats data to pd patch"""

    def __init__(self, memory, conns, fn):
        self.memory = memory
        self.conns = conns
        self.lines = []
        self.fn = fn
        
        self.rebuildmemo()
        self.linebuilder()
        self.patchbuilder()

    def connprinter(self, line):
        return f'#X connect {line[1]} {line[2]} {line[3]} {line[4]};'

    def nodeprinter(self, line):
        if len(line['args'])==0:
            line['args']=''
        elif len(line['args'])>=1:
            result = ''
            for arg in line['args']:
                result += str(arg)+' '
            line['args']=result
        return f"{line['chunk']} {line['x_pos']} {line['y_pos']} {line['ntype']} {line['args']};"

    def rebuildmemo(self):
        """returns a memory made only by nodes and connections, and adjusts scope in case of local function"""
        newmemory = []
        #adjust scope if local function
        for st in self.memory:
            for var in st:
                if st.caller!=None: var.scope = st.caller
                if type(var)==Node: newmemory.append(var)

        #devide memory per scopes
        scopes = {} 
        for node in newmemory:
            if node.scope not in scopes:
                scopes[node.scope] = [node]
            else:
                scopes[node.scope].append(node)
        newmemory = scopes

        #order elements in each scope by index
        temp = {}
        for scope in newmemory:
            temp[scope] = []
            for i in range(len(newmemory[scope])):
                for var in newmemory[scope]:
                    if var.index==i:
                        temp[scope].append(var)
        newmemory = temp

        #add conns
        for conn in self.conns:
            temp[conn[0]].append(conn)

        #order in pd-like style
        temp = []
        for node in newmemory['general']:
            temp.append(node)
            if type(node)==Node and node.nodetype == 'subpatch':
                if node.name in newmemory:
                    for var in newmemory[node.name]:
                        temp.append(var)
                restore = Node()
                restore.name = node.name
                restore.nodetype = 'restore'
                restore.scope = node.name
                temp.append(restore)
        self.memory = temp
                

    def linebuilder(self):
        """build lines"""
        for var in self.memory:
            if type(var)!=Node: #connection
                line = var
            else:
                line = {'chunk':None, 'x_pos':random.randint(20,200), 'y_pos':random.randint(20,200), 'ntype':'', 'args':None}
                if var.nodetype == 'subpatch':          #block
                    line['chunk'] = '#N canvas'
                    line['args'] = [var.name, '0']
                elif var.nodetype == 'restore':         #block end
                    line['chunk'] = '#X restore'        
                    line['args'] = ['pd', var.name]
                elif var.nodetype == 'num':             #floatatom
                    line['chunk'] = '#X floatatom'
                    line['args'] = ['5 0 0 0 - - - 0']
                elif var.nodetype == 'msg':             #message
                    line['chunk'] = '#X msg'
                    line['args'] = var.args
                elif var.nodetype == 'obj':             #numeric objs (operation)
                    line['chunk'] = '#X obj'
                    line['args'] = var.args
                elif var.nodetype == 'bang':            #bang
                    line['chunk'] = '#X obj'
                    line['ntype'] = 'bng'
                    line['args'] = ['19 250 50 0 empty empty empty 0 -10 0 12 #fcfcfc #000000 #000000']
                elif var.nodetype == 'toggle':          #toggle
                    line['chunk'] = '#X obj'
                    line['ntype'] = 'tgl'
                else:                                   #other
                    line['chunk'] = '#X obj'            
                    line['ntype'] = var.nodetype
                    line['args'] = var.args
            self.lines.append(line)

        """
        for l in self.lines:
            if type(l)==dict:self.nodeprinter(l)
            else: self.connprinter(l)
        """

    def patchbuilder(self):
        if not os.path.exists('outputs'):
            os.makedirs('outputs')
        f = open('outputs/'+self.fn+'.pd', "w")
        f.write('#N canvas 688 19 681 716 12;')
        f.write('\n')
        for l in self.lines:
            if type(l)==dict: f.write(self.nodeprinter(l))
            else: f.write(self.connprinter(l))
            f.write('\n')
        f.close()
        print(f'file {self.fn}.pd successfully created.')

                

        
