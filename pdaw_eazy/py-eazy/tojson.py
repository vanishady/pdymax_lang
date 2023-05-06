import json
import random

#patchline
def patchline(sink, inlet, source, outlet):
    sink = 'obj-'+str(sink)
    source = 'obj-'+str(source)
    patchline = {'destination':[sink, inlet], 'source':[source, outlet]}
    return {'patchline':patchline}

#box
def msgbox(index, rect, text):
    index = 'obj-'+str(index)
    if len(text)==0:
        text=''
    elif len(text)>=1:
        result = ' '
        for arg in text:
            if type(arg)==list:
                for a in arg:
                    result+= str(a)+' '
            else:
                result += str(arg)+' '
        text=result
        
    box = {'id':index,'maxclass':'message', 
           'patching_rect':rect, 'text':text}
    return {'box':box}

def bangbox(index, maxclass, rect):
    index = 'obj-'+str(index)
    box = {'id':index, 'maxclass':maxclass, 'numinlets':1,
       'numoutlets':1, 'parameter_enable':0, 'patching_rect':rect}
    return {'box':box}

def objbox(index, rect, text, args):
    index = 'obj-'+str(index)
    if text=='obj': text=''
    for arg in args:
        if type(arg)==list:
            for a in arg:
                text+= ' '+str(a)
        else:
            text += ' '+str(arg)

    box = {'id':index, 'maxclass':'newobj',
           'patching_rect':rect, 'text':text}
    return {'box':box}
    
def numbox(index, rect):
    index = 'obj-'+str(index)
    box = {'id':index, 'maxclass':'flonum',
           'parameter_enable':0, 'patching_rect':rect}
    return {'box':box}

def box(index, maxclass, rect):
    index = 'obj-'+str(index)
    box = {'id':index, 'maxclass':maxclass, 'patching_rect':rect}
    return {'box':box}

#appversion
def appversion():
    appversion = {"major":8, "minor":3, "revision":3,
              "architecture" : "x64", "modernui" : 1}
    return appversion

#patcher
def patcher(appversion, box_list, line_list):
    patcher = {'fileversion':1,
           'appversion':appversion,
           "classnamespace" : "box",
           "rect" : [random.randint(20,200),
                     random.randint(20,200),
                     random.randint(20,200),
                     random.randint(20,200)],
           "bglocked" : 0,
           "openinpresentation" : 0,
           "default_fontsize" : 12.0,
           "default_fontface" : 0,
           "default_fontname" : "Arial",
           "gridonopen" : 1,
           "gridsize" : [ 15.0, 15.0 ],
           "gridsnaponopen" : 1,
           "objectsnaponopen" : 1,
           "statusbarvisible" : 2,
           "toolbarvisible" : 1,
           "lefttoolbarpinned" : 0,
           "toptoolbarpinned" : 0,
           "righttoolbarpinned" : 0,
           "bottomtoolbarpinned" : 0,
           "toolbars_unpinned_last_save" : 0,
           "tallnewobj" : 0,
           "boxanimatetime" : 200,
           "enablehscroll" : 1,
           "enablevscroll" : 1,
           "devicewidth" : 0.0,
           "description" : "",
           "digest" : "",
           "tags" : "",
           "style" : "",
           "subpatcher_template" : "",
           "assistshowspatchername" : 0,
           "visible" : 1,
           "boxes" : box_list,
           "lines" : line_list
           }
    return patcher

#savedattr
def savedattr():
    savedattr = {"description" : "",
             "digest" : "",
             "globalpatchername" : "",
             "tags" : ""}
    return savedattr

def subpatchbox(index, patcher, rect, savedattr, text):
    index = 'obj-'+str(index)
    text = 'p '+text
    subpatchbox = {"id" : index,
               "maxclass" : "newobj",
               "patcher" : patcher,
               "patching_rect" : rect,
               "saved_object_attributes" : savedattr,
               "text" : text
               }
    outersubpatch = {'box':subpatchbox}
    return outersubpatch
    
def mainpatch(appversion, boxes, lines):
    mainpatch = {"fileversion" : 1,
             'appversion':appversion,
             "classnamespace" : "box",
             "rect" : [ 789.0, 469.0, 542.0, 264.0 ],
             "bglocked" : 0,
             "openinpresentation" : 0,
             "default_fontsize" : 12.0,
             "default_fontface" : 0,
             "default_fontname" : "Arial",
             "gridonopen" : 1,
             "gridsize" : [ 15.0, 15.0 ],
             "gridsnaponopen" : 1,
             "objectsnaponopen" : 1,
             "statusbarvisible" : 2,
             "toolbarvisible" : 1,
             "lefttoolbarpinned" : 0,
             "toptoolbarpinned" : 0,
             "righttoolbarpinned" : 0,
             "bottomtoolbarpinned" : 0,
             "toolbars_unpinned_last_save" : 0,
             "tallnewobj" : 0,
             "boxanimatetime" : 200,
             "enablehscroll" : 1,
             "enablevscroll" : 1,
             "devicewidth" : 0.0,
             "description" : "",
             "digest" : "",
             "tags" : "",
             "style" : "",
             "subpatcher_template" : "",
             "assistshowspatchername" : 0,
             "boxes" : boxes,
             "lines" : lines,
             "dependency_cache" : [  ],
             "autosave" : 0}
    return mainpatch



"""
import json

#box
box = {'comment':None, 'id':None, 'index':None,
       'maxclass':None, 'numinlets':None,
       'numoutlets':None, 'patching_rect':[], 'text':None}
outerbox = {'box':box}
json_box = json.dumps(outerbox, indent=4)

#patchline
patchline = {'destination':None, 'order':None, 'source':None}
outerpatchline = {'patchline':patchline}
json_patchline = json.dumps(outerpatchline, indent=4)

#appversion
appversion = {"major":8, "minor":3, "revision":3,
              "architecture" : "x64", "modernui" : 1}
outerappversion = {'appversion':appversion}
json_appversion = json.dumps(outerappversion, indent=4)

#patcher
patcher = {'fileversion':1,
           'appversion':appversion,
           "classnamespace" : "box",
           "rect" : [ 59.0, 107.0, 640.0, 480.0 ],
           "bglocked" : 0,
           "openinpresentation" : 0,
           "default_fontsize" : 12.0,
           "default_fontface" : 0,
           "default_fontname" : "Arial",
           "gridonopen" : 1,
           "gridsize" : [ 15.0, 15.0 ],
           "gridsnaponopen" : 1,
           "objectsnaponopen" : 1,
           "statusbarvisible" : 2,
           "toolbarvisible" : 1,
           "lefttoolbarpinned" : 0,
           "toptoolbarpinned" : 0,
           "righttoolbarpinned" : 0,
           "bottomtoolbarpinned" : 0,
           "toolbars_unpinned_last_save" : 0,
           "tallnewobj" : 0,
           "boxanimatetime" : 200,
           "enablehscroll" : 1,
           "enablevscroll" : 1,
           "devicewidth" : 0.0,
           "description" : "",
           "digest" : "",
           "tags" : "",
           "style" : "",
           "subpatcher_template" : "",
           "assistshowspatchername" : 0,
           "visible" : 1,
           "boxes" : [ box ],
           "lines" : [ patchline ]
           }
outerpatcher = {'patcher':patcher}
json_patcher = json.dumps(outerpatcher, indent=4)

#savedattributes
savedattr = {"description" : "",
             "digest" : "",
             "globalpatchername" : "",
             "tags" : ""}
outersavedattr = {'saved_object_attributes':savedattr}
json_savedattr = json.dumps(outersavedattr, indent=4)

#subpatchbox
subpatchbox = {"id" : "obj-3",
               "maxclass" : "newobj",
               "numinlets" : 2,
               "numoutlets" : 1,
               "outlettype" : [ "signal" ],
               "patcher" : patcher,
               "patching_rect" : [ 429.0, 172.0, 42.0, 22.0 ],
               "saved_object_attributes" : savedattr,
               "text" : "p adsr"
               }
outersubpatchbox = {'box':subpatchbox}
json_subpatchbox = json.dumps(outersubpatchbox, indent=4)

#mainpatch
mainpatch = {"fileversion" : 1,
             'appversion':appversion,
             "classnamespace" : "box",
             "rect" : [ 789.0, 469.0, 542.0, 264.0 ],
             "bglocked" : 0,
             "openinpresentation" : 0,
             "default_fontsize" : 12.0,
             "default_fontface" : 0,
             "default_fontname" : "Arial",
             "gridonopen" : 1,
             "gridsize" : [ 15.0, 15.0 ],
             "gridsnaponopen" : 1,
             "objectsnaponopen" : 1,
             "statusbarvisible" : 2,
             "toolbarvisible" : 1,
             "lefttoolbarpinned" : 0,
             "toptoolbarpinned" : 0,
             "righttoolbarpinned" : 0,
             "bottomtoolbarpinned" : 0,
             "toolbars_unpinned_last_save" : 0,
             "tallnewobj" : 0,
             "boxanimatetime" : 200,
             "enablehscroll" : 1,
             "enablevscroll" : 1,
             "devicewidth" : 0.0,
             "description" : "",
             "digest" : "",
             "tags" : "",
             "style" : "",
             "subpatcher_template" : "",
             "assistshowspatchername" : 0,
             "boxes" : [ subpatchbox ],
             "lines" : [ patchline ],
             "dependency_cache" : [  ],
             "autosave" : 0}
outermainpatch = {'patcher':mainpatch}
json_mainpatch = json.dumps(outermainpatch, indent=4)


with open('sample.json', 'w') as outfile:
    outfile.write(json_mainpatch)

"""

    
    
