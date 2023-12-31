import graphviz
from components import *
import json
import math

                
            
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
                if elem.nodetype=='subpatch':
                    w=len(elem.name)+3
                else:
                    if elem.nodetype in ['receive','send','receive~','send~']:
                        w=len(elem.nodetype)
                    elif elem.nodetype in ['vslider','vsl']:
                        self.dot.node(f'{elem.index}', height='4', width=f'{math.ceil(w/12)}')
                        continue
                    else:
                        w=1
                    for a in elem.args:
                        w+=len(str(a))+1
                self.dot.node(f'{elem.index}', width=f'{math.ceil(w/12)}')
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

    

        
