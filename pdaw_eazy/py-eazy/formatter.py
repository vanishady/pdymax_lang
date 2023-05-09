from exceptions import *
from components import *
from formatter import *
import random
import os
from tkinter import *
import tojson
import random
import json
from graphvizpos import *

class Formatter():

    def __init__(self, memory, connections, fn):
        self.memory = memory
        self.connections = connections
        self.fn = fn

        self.lines = []

    def formatmemory(self, max_or_pd):
        """returns a memory made only by nodes and connections, and adjusts scope in case of local function"""
        newmemory = []
        #adjust scope if local function
        for st in self.memory:
            for var in st:
                if st.caller!=None: var.scope = st.caller
                if type(var)==Node: newmemory.append(var)

        self.uniform_nodetypes(newmemory, max_or_pd)

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
        for conn in self.connections:
            newmemory[conn[0]].append(conn)
        self.memory = newmemory

        #set positions
        for scope in self.memory:
            graphpos = GraphPos(self.memory[scope])
            self.memory[scope] = graphpos.segment

        return self.memory

    def uniform_nodetypes(self, memory, max_or_pd):
        """uniform node types which are different in max-pd"""
        """
        supportedtypes = open('utils/supportedtypes.txt', "r")
        for node in memory:
            if node.nodetype not in supportedtypes.read():
                raise InvalidNodeError('???', node.nodetype)
        supportedtypes.close()
        """
                
        if max_or_pd == 'pd':
            pass #tanto c'è cyclone, quindi qualsiasi nodo valido in max è valido in pd
        else: #max
            with open('utils/correspondances.json', 'r') as openfile:
                json_object = json.load(openfile)
            for node in memory:
                if node.nodetype in json_object:
                    node.nodetype = json_object[node.nodetype]

class PdFormatter(Formatter):

    """formats data to pd patch"""

    def __init__(self, memory, conns, fn):
        self.memory = memory
        self.conns = conns
        self.fn = fn
        super().__init__(self.memory, self.conns, self.fn)
        self.memory = super().formatmemory('pd')
        
        self.memory = self.getstyledmemo(self.memory['general'], [])
        self.linebuilder()
        self.patchbuilder()

    def getstyledmemo(self, nodes, styledmemo=[]):
        for node in nodes:
            styledmemo.append(node)
            if isinstance(node, Node) and node.nodetype == 'subpatch':
                if node.name in self.memory:
                    self.getstyledmemo(self.memory[node.name], styledmemo)
                restore = Node()
                restore.name = node.name
                restore.nodetype = 'restore'
                restore.scope = node.name
                restore.xpos = node.xpos
                restore.ypos = node.ypos
                styledmemo.append(restore)
        return styledmemo

    def connprinter(self, line):
        return f'#X connect {line[1]} {line[2]} {line[3]} {line[4]};'

    def nodeprinter(self, line):
        if len(line['args'])==0:
            line['args']=''
        elif len(line['args'])>=1:
            result = ''
            for arg in line['args']:
                if type(arg)==list:
                    for a in arg:
                        result+= str(a)+' '
                else:
                    result += str(arg)+' '
            line['args']=result
        return f"{line['chunk']} {line['x_pos']} {line['y_pos']} {line['ntype']} {line['args']};"

    def linebuilder(self):
        """build lines"""
        for var in self.memory:
            if type(var)!=Node: #connection
                line = var
            else:
                line = {'chunk':None, 'x_pos':var.xpos, 'y_pos':var.ypos, 'ntype':'', 'args':None}
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
                    line['args'] = ['19 0 empty empty empty 0 -10 0 12 #fcfcfc #000000 #000000 0 1']
                elif var.nodetype == "tbf":
                    line['chunk'] = '#X obj'
                    line['args'] = ['t', 'b', 'f']
                else:                                   #other
                    line['chunk'] = '#X obj'            
                    line['ntype'] = var.nodetype
                    line['args'] = var.args
            self.lines.append(line)

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


class MaxFormatter(Formatter):

    def __init__(self, memory, conns, fn):
        self.memory = memory
        self.conns = conns
        self.fn = fn
        super().__init__(self.memory, self.conns, self.fn)
        self.memory = super().formatmemory('max')

        #self.subpatch_list = []
        bl, ll = self.linebuilder(self.memory['general'])
        appversion = tojson.appversion()
        self.mainpatch= tojson.mainpatch(appversion, bl , ll)
        self.patchbuilder()

    
    def patchbuilder(self):
        outermainpatch = {'patcher':self.mainpatch}
        json_mainpatch = json.dumps(outermainpatch, indent=4)
        with open('outputs/'+self.fn+'.maxpat', 'w') as outfile:
            outfile.write(json_mainpatch)
        print(f'file {self.fn}.maxpat successfully created.')
        

    def linebuilder(self, scope):
        box_list=[]
        line_list=[]

        for var in scope:

            if isinstance(var, Node):

                if var.nodetype=='subpatch':
                    
                    box_l, line_l = self.linebuilder(self.memory[var.name])
                    appversion = tojson.appversion()
                    patcher= tojson.patcher(appversion, box_l, line_l)
                    savedattr= tojson.savedattr()
                    box= tojson.subpatchbox(var.index, patcher, [var.xpos, var.ypos, 40, 40],
                                            savedattr,
                                            var.name)
                        
                elif var.nodetype in ['button', 'toggle']:
                    box=tojson.bangbox(var.index, var.nodetype, [var.xpos, var.ypos,40, 40])
                    
                elif var.nodetype=='message':
                    if var.args[0]=='open':
                        if '/' in var.args[1]:
                            res = var.args[1].split('/')
                            var.args[1] = res[-1]
                        elif '\'' in var.args[1]:
                            res = var.args[1].split('\'')
                            var.args[1] = res[-1]
                        var.args[2] = ','
                    box=tojson.msgbox(var.index, [var.xpos, var.ypos,40, 40],var.args)

                elif var.nodetype=='flonum': #e number?
                    box=tojson.numbox(var.index, [var.xpos, var.ypos,40, 40])                

                elif var.nodetype in ['ezdac~', 'outlet', 'inlet']:
                    box=tojson.box(var.index, var.nodetype, [var.xpos, var.ypos,30, 30])

                else:
                    box=tojson.objbox(var.index, [var.xpos, var.ypos,40, 40],
                                      var.nodetype, var.args)

                box_list.append(box)

            else:
                
                patchline = tojson.patchline(var[3], var[4], var[1], var[2])
                line_list.append(patchline)

        return box_list, line_list  
            

        
        

        
