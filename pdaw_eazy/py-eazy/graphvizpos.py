import graphviz
from components import *
import json

                
            
class GraphPos():

    def __init__(self, segment):
        self._segment = segment
        self._dot = graphviz.Graph(format='json')

        self.segment2dot()
        self.retrievepos()

    def segment2dot(self):
        """add nodes and connections from the segment to dot file in json format"""
        for elem in self.segment:
            if type(elem)==Node:
                #sistema width passando stringa nodo
                if elem.nodetype in ['subpatch', 'send', 's', 'receive', 'r']:
                    self.dot.node(f'{elem.index}', width='2.5')
                else:
                    self.dot.node(f'{elem.index}')
            else:
                self.dot.edge(f'{elem[3]}', f'{elem[1]}')
        self.pipe = self.dot.pipe(encoding='utf-8')

    def retrievepos(self):
        """retrieve positions from json file"""
        json_object = json.loads(self.pipe)
        res = json_object['objects']
        for elem in res:
            name = elem['name']
            pos = elem['pos'].split(',')
            for node in self.segment:
                if type(node)!=Node: continue
                if node.index == int(name):
                    node.xpos = pos[0]
                    node.ypos = pos[1]
                    break

    @property
    def segment(self):
        return self._segment

    @segment.setter
    def segment(self, name):
        self._segment = name

    @property
    def dot(self):
        return self._dot

    @dot.setter
    def dot(self, dotname):
        self._dot = dotname

    

        
