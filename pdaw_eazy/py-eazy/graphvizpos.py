import re
import sys
import argparse
import subprocess
import graphviz
from components import *

DOT_CMD = 'dot'

"""
class Renderer():

    def __init__(self):
        self.f = graphviz.Digraph(filename='graph_out')


    def dotfile(self, scope):
        for elem in scope:
            if type(elem)!=Node:
                source = str(elem[1]) #source_id
                sink = str(elem[3]) #sink_id
                self.f.edge(source, sink)
            else:
                self.f.node(str(elem.index))

        for l in self.f:
            print(l)
"""
                
            
class GraphPos():

    def __init__(self, scope):
        self._scope = scope
        dot = self.dotfile()
        p = subprocess.run(DOT_CMD, input=dot, capture_output=True, text=True)
        positions = self.retrieve_pos(p.stdout)
        self.apply_pos(positions)

    def dotfile(self):
        connections = []
        out=['digraph _ {']
        for elem in self.scope:
            if type(elem)!=Node:
                a = str(elem[1]) #source_id
                b = str(elem[3]) #sink_id
                connections.append((a, b))
                out.append(f'{b} -> {a};')
            else:
                out.append(f'{elem.index};')
        out.append('}')
        return '\n'.join(out)

    def retrieve_pos(self, dot):
        positions = {}
        dot = dot.replace(',\n', ', ')
        for line in dot.splitlines():
            m = re.match(r'\s*([0-9]+).*pos="([0-9.]+),([0-9.]+)"', line)
            if m:
                i = int(m.group(1))
                x = float(m.group(2))
                y = float(m.group(3))
                positions[i] = x, y
        return positions

    def apply_pos(self, positions):
        for elem in self.scope:
            if type(elem)==Node:
                x, y = positions[elem.index]
                elem.xpos = x
                elem.ypos = y

    @property
    def scope(self):
        return self._scope

    @scope.setter
    def scope(self, name):
        self._scope = name

    

        
