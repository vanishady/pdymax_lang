from exceptions import *
from components import *
from formatter import *

class pdformatter():

    def __init__(self, memory, conns, callables):
        self.memory = self.formatmemory(memory, callables) #elenco di variabili node
        self.conns = conns #elenco di connessioni
        self.lines = [] #elenco di dict, un dict per ciascuna line della patch
        self.linebuilder()

    def samename(self, name1, name2):
        """check wether name1 and name2 have same prefix"""
        if name2 in name1:
            output = name1.replace(name2, '')
            if output.isnumeric(): return True
        return False

    def formatmemory(self, memory, callables):
        newmemory = []
        for st in memory:
            infunction = False
            for c in callables:
                if self.samename(st.name, c.name) and type(c)==Function:
                    infunction = True
            for var in st:
                if infunction: var.scope = st.caller
                if type(var)==Node: newmemory.append(var)
            if st.name!='general':
                n = Node()
                n.nodetype = 'restore'
                n.name = st.name
                newmemory.append(Node())

        return newmemory

    def linebuilder(self):
        line = {'chunk':None, 'x_pos':None, 'y_pos':None, 'ntype':'', 'args':None}
        for var in self.memory:
            if var.nodetype == 'subpatch':          #block
                line['chunk'] = '#N canvas'
                line['args'] = [var.name, '0']
            elif var.nodetype == 'restore':         #block end
                line['chunk'] = '#X restore'        
                line['args'] = ['pd', var.name]
            elif var.nodetype == 'num':             #floatatom
                line['chunk'] = '#X floatatom'
                line['args'] = '5 0 0 0 - - - 0;'
            elif var.nodetype == 'msg':             #message
                line['chunk'] = '#X msg'
                line['args'] = var.args
            elif var.nodetype == 'obj':             #numeric objs (operation)
                line['chunk'] = '#X obj'
                line['args'] = var.args
            elif var.nodetype == 'bang':            #bang
                line['chunk'] = '#X obj'
                line['ntype'] = 'bng'
                line['args'] = '19 250 50 0 empty empty empty 0 -10 0 12 #fcfcfc #000000 #000000;'
            elif var.nodetype == 'toggle':          #toggle
                line['chunk'] = '#X obj'
                line['ntype'] = 'tgl'
            else:                                   #other
                line['chunk'] = '#X obj'            
                line['ntype'] = var.nodetype
                line['args'] = var.args
            self.lines.append(line)
            print(line)
            
                

        
