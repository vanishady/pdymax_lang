{
    "patcher": {
        "fileversion": 1,
        "appversion": {
            "major": 8,
            "minor": 3,
            "revision": 3,
            "architecture": "x64",
            "modernui": 1
        },
        "classnamespace": "box",
        "rect": [
            789.0,
            469.0,
            542.0,
            264.0
        ],
        "bglocked": 0,
        "openinpresentation": 0,
        "default_fontsize": 12.0,
        "default_fontface": 0,
        "default_fontname": "Arial",
        "gridonopen": 1,
        "gridsize": [
            15.0,
            15.0
        ],
        "gridsnaponopen": 1,
        "objectsnaponopen": 1,
        "statusbarvisible": 2,
        "toolbarvisible": 1,
        "lefttoolbarpinned": 0,
        "toptoolbarpinned": 0,
        "righttoolbarpinned": 0,
        "bottomtoolbarpinned": 0,
        "toolbars_unpinned_last_save": 0,
        "tallnewobj": 0,
        "boxanimatetime": 200,
        "enablehscroll": 1,
        "enablevscroll": 1,
        "devicewidth": 0.0,
        "description": "",
        "digest": "",
        "tags": "",
        "style": "",
        "subpatcher_template": "",
        "assistshowspatchername": 0,
        "boxes": [
            {
                "box": {
                    "id": "obj-0",
                    "maxclass": "newobj",
                    "patcher": {
                        "fileversion": 1,
                        "appversion": {
                            "major": 8,
                            "minor": 3,
                            "revision": 3,
                            "architecture": "x64",
                            "modernui": 1
                        },
                        "classnamespace": "box",
                        "rect": [
                            146,
                            59,
                            121,
                            120
                        ],
                        "bglocked": 0,
                        "openinpresentation": 0,
                        "default_fontsize": 12.0,
                        "default_fontface": 0,
                        "default_fontname": "Arial",
                        "gridonopen": 1,
                        "gridsize": [
                            15.0,
                            15.0
                        ],
                        "gridsnaponopen": 1,
                        "objectsnaponopen": 1,
                        "statusbarvisible": 2,
                        "toolbarvisible": 1,
                        "lefttoolbarpinned": 0,
                        "toptoolbarpinned": 0,
                        "righttoolbarpinned": 0,
                        "bottomtoolbarpinned": 0,
                        "toolbars_unpinned_last_save": 0,
                        "tallnewobj": 0,
                        "boxanimatetime": 200,
                        "enablehscroll": 1,
                        "enablevscroll": 1,
                        "devicewidth": 0.0,
                        "description": "",
                        "digest": "",
                        "tags": "",
                        "style": "",
                        "subpatcher_template": "",
                        "assistshowspatchername": 0,
                        "visible": 1,
                        "boxes": [
                            {
                                "box": {
                                    "id": "obj-0",
                                    "maxclass": "inlet",
                                    "patching_rect": [
                                        "171",
                                        "18",
                                        30,
                                        30
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-1",
                                    "maxclass": "message",
                                    "patching_rect": [
                                        "171",
                                        "90",
                                        40,
                                        40
                                    ],
                                    "text": " 432 "
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-2",
                                    "maxclass": "flonum",
                                    "parameter_enable": 0,
                                    "patching_rect": [
                                        "171",
                                        "162",
                                        40,
                                        40
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-3",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "27",
                                        "378",
                                        40,
                                        40
                                    ],
                                    "text": "cycle~"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-4",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "171",
                                        "522",
                                        40,
                                        40
                                    ],
                                    "text": " *~ 0.25"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-5",
                                    "maxclass": "outlet",
                                    "patching_rect": [
                                        "171",
                                        "594",
                                        30,
                                        30
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-6",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "99",
                                        "234",
                                        40,
                                        40
                                    ],
                                    "text": " * 3"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-7",
                                    "maxclass": "flonum",
                                    "parameter_enable": 0,
                                    "patching_rect": [
                                        "99",
                                        "306",
                                        40,
                                        40
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-8",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "99",
                                        "378",
                                        40,
                                        40
                                    ],
                                    "text": "cycle~"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-9",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "99",
                                        "450",
                                        40,
                                        40
                                    ],
                                    "text": " *~ 0.85"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-10",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "171",
                                        "234",
                                        40,
                                        40
                                    ],
                                    "text": " * 5"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-11",
                                    "maxclass": "flonum",
                                    "parameter_enable": 0,
                                    "patching_rect": [
                                        "171",
                                        "306",
                                        40,
                                        40
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-12",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "171",
                                        "378",
                                        40,
                                        40
                                    ],
                                    "text": "cycle~"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-13",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "171",
                                        "450",
                                        40,
                                        40
                                    ],
                                    "text": " *~ 0.5"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-14",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "243",
                                        "234",
                                        40,
                                        40
                                    ],
                                    "text": " * 7"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-15",
                                    "maxclass": "flonum",
                                    "parameter_enable": 0,
                                    "patching_rect": [
                                        "243",
                                        "306",
                                        40,
                                        40
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-16",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "243",
                                        "378",
                                        40,
                                        40
                                    ],
                                    "text": "cycle~"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-17",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "243",
                                        "450",
                                        40,
                                        40
                                    ],
                                    "text": " *~ 0.35"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-18",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "315",
                                        "234",
                                        40,
                                        40
                                    ],
                                    "text": " * 9"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-19",
                                    "maxclass": "flonum",
                                    "parameter_enable": 0,
                                    "patching_rect": [
                                        "315",
                                        "306",
                                        40,
                                        40
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-20",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "315",
                                        "378",
                                        40,
                                        40
                                    ],
                                    "text": "cycle~"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-21",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "315",
                                        "450",
                                        40,
                                        40
                                    ],
                                    "text": " *~ 0.25"
                                }
                            }
                        ],
                        "lines": [
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-1",
                                        0
                                    ],
                                    "source": [
                                        "obj-0",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-2",
                                        0
                                    ],
                                    "source": [
                                        "obj-1",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-3",
                                        0
                                    ],
                                    "source": [
                                        "obj-2",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-4",
                                        0
                                    ],
                                    "source": [
                                        "obj-3",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-5",
                                        0
                                    ],
                                    "source": [
                                        "obj-4",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-6",
                                        0
                                    ],
                                    "source": [
                                        "obj-2",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-7",
                                        0
                                    ],
                                    "source": [
                                        "obj-6",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-8",
                                        0
                                    ],
                                    "source": [
                                        "obj-7",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-9",
                                        0
                                    ],
                                    "source": [
                                        "obj-8",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-4",
                                        0
                                    ],
                                    "source": [
                                        "obj-9",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-10",
                                        0
                                    ],
                                    "source": [
                                        "obj-2",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-11",
                                        0
                                    ],
                                    "source": [
                                        "obj-10",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-12",
                                        0
                                    ],
                                    "source": [
                                        "obj-11",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-13",
                                        0
                                    ],
                                    "source": [
                                        "obj-12",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-4",
                                        0
                                    ],
                                    "source": [
                                        "obj-13",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-14",
                                        0
                                    ],
                                    "source": [
                                        "obj-2",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-15",
                                        0
                                    ],
                                    "source": [
                                        "obj-14",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-16",
                                        0
                                    ],
                                    "source": [
                                        "obj-15",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-17",
                                        0
                                    ],
                                    "source": [
                                        "obj-16",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-4",
                                        0
                                    ],
                                    "source": [
                                        "obj-17",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-18",
                                        0
                                    ],
                                    "source": [
                                        "obj-2",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-19",
                                        0
                                    ],
                                    "source": [
                                        "obj-18",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-20",
                                        0
                                    ],
                                    "source": [
                                        "obj-19",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-21",
                                        0
                                    ],
                                    "source": [
                                        "obj-20",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-4",
                                        0
                                    ],
                                    "source": [
                                        "obj-21",
                                        0
                                    ]
                                }
                            }
                        ]
                    },
                    "patching_rect": [
                        "90",
                        "90",
                        40,
                        40
                    ],
                    "saved_object_attributes": {
                        "description": "",
                        "digest": "",
                        "globalpatchername": "",
                        "tags": ""
                    },
                    "text": "p additivesynth0"
                }
            },
            {
                "box": {
                    "id": "obj-1",
                    "maxclass": "newobj",
                    "patcher": {
                        "fileversion": 1,
                        "appversion": {
                            "major": 8,
                            "minor": 3,
                            "revision": 3,
                            "architecture": "x64",
                            "modernui": 1
                        },
                        "classnamespace": "box",
                        "rect": [
                            198,
                            183,
                            173,
                            28
                        ],
                        "bglocked": 0,
                        "openinpresentation": 0,
                        "default_fontsize": 12.0,
                        "default_fontface": 0,
                        "default_fontname": "Arial",
                        "gridonopen": 1,
                        "gridsize": [
                            15.0,
                            15.0
                        ],
                        "gridsnaponopen": 1,
                        "objectsnaponopen": 1,
                        "statusbarvisible": 2,
                        "toolbarvisible": 1,
                        "lefttoolbarpinned": 0,
                        "toptoolbarpinned": 0,
                        "righttoolbarpinned": 0,
                        "bottomtoolbarpinned": 0,
                        "toolbars_unpinned_last_save": 0,
                        "tallnewobj": 0,
                        "boxanimatetime": 200,
                        "enablehscroll": 1,
                        "enablevscroll": 1,
                        "devicewidth": 0.0,
                        "description": "",
                        "digest": "",
                        "tags": "",
                        "style": "",
                        "subpatcher_template": "",
                        "assistshowspatchername": 0,
                        "visible": 1,
                        "boxes": [
                            {
                                "box": {
                                    "id": "obj-0",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "99",
                                        "378",
                                        40,
                                        40
                                    ],
                                    "text": "line~"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-1",
                                    "maxclass": "inlet",
                                    "patching_rect": [
                                        "27",
                                        "234",
                                        30,
                                        30
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-2",
                                    "maxclass": "message",
                                    "patching_rect": [
                                        "36",
                                        "306",
                                        40,
                                        40
                                    ],
                                    "text": " 1 1000 "
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-3",
                                    "maxclass": "inlet",
                                    "patching_rect": [
                                        "135",
                                        "18",
                                        30,
                                        30
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-4",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "135",
                                        "90",
                                        40,
                                        40
                                    ],
                                    "text": "delay 1000"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-5",
                                    "maxclass": "button",
                                    "numinlets": 1,
                                    "numoutlets": 1,
                                    "parameter_enable": 0,
                                    "patching_rect": [
                                        "135",
                                        "162",
                                        40,
                                        40
                                    ]
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-6",
                                    "maxclass": "message",
                                    "patching_rect": [
                                        "99",
                                        "234",
                                        40,
                                        40
                                    ],
                                    "text": " 0.5 1500 "
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-7",
                                    "maxclass": "newobj",
                                    "patching_rect": [
                                        "171",
                                        "234",
                                        40,
                                        40
                                    ],
                                    "text": "delay 3000"
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-8",
                                    "maxclass": "message",
                                    "patching_rect": [
                                        "162",
                                        "306",
                                        40,
                                        40
                                    ],
                                    "text": " 0 1000 "
                                }
                            },
                            {
                                "box": {
                                    "id": "obj-9",
                                    "maxclass": "outlet",
                                    "patching_rect": [
                                        "99",
                                        "450",
                                        30,
                                        30
                                    ]
                                }
                            }
                        ],
                        "lines": [
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-2",
                                        0
                                    ],
                                    "source": [
                                        "obj-1",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-0",
                                        0
                                    ],
                                    "source": [
                                        "obj-2",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-4",
                                        0
                                    ],
                                    "source": [
                                        "obj-3",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-5",
                                        0
                                    ],
                                    "source": [
                                        "obj-4",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-6",
                                        0
                                    ],
                                    "source": [
                                        "obj-5",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-7",
                                        0
                                    ],
                                    "source": [
                                        "obj-5",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-8",
                                        0
                                    ],
                                    "source": [
                                        "obj-7",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-0",
                                        0
                                    ],
                                    "source": [
                                        "obj-8",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-0",
                                        0
                                    ],
                                    "source": [
                                        "obj-6",
                                        0
                                    ]
                                }
                            },
                            {
                                "patchline": {
                                    "destination": [
                                        "obj-9",
                                        0
                                    ],
                                    "source": [
                                        "obj-0",
                                        0
                                    ]
                                }
                            }
                        ]
                    },
                    "patching_rect": [
                        "288",
                        "90",
                        40,
                        40
                    ],
                    "saved_object_attributes": {
                        "description": "",
                        "digest": "",
                        "globalpatchername": "",
                        "tags": ""
                    },
                    "text": "p adsr0"
                }
            },
            {
                "box": {
                    "id": "obj-2",
                    "maxclass": "button",
                    "numinlets": 1,
                    "numoutlets": 1,
                    "parameter_enable": 0,
                    "patching_rect": [
                        "288",
                        "18",
                        40,
                        40
                    ]
                }
            },
            {
                "box": {
                    "id": "obj-3",
                    "maxclass": "newobj",
                    "patching_rect": [
                        "189",
                        "162",
                        40,
                        40
                    ],
                    "text": " *~"
                }
            },
            {
                "box": {
                    "id": "obj-4",
                    "maxclass": "ezdac~",
                    "patching_rect": [
                        "189",
                        "234",
                        30,
                        30
                    ]
                }
            }
        ],
        "lines": [
            {
                "patchline": {
                    "destination": [
                        "obj-0",
                        0
                    ],
                    "source": [
                        "obj-2",
                        0
                    ]
                }
            },
            {
                "patchline": {
                    "destination": [
                        "obj-1",
                        0
                    ],
                    "source": [
                        "obj-2",
                        0
                    ]
                }
            },
            {
                "patchline": {
                    "destination": [
                        "obj-1",
                        1
                    ],
                    "source": [
                        "obj-2",
                        0
                    ]
                }
            },
            {
                "patchline": {
                    "destination": [
                        "obj-3",
                        0
                    ],
                    "source": [
                        "obj-0",
                        0
                    ]
                }
            },
            {
                "patchline": {
                    "destination": [
                        "obj-4",
                        0
                    ],
                    "source": [
                        "obj-3",
                        0
                    ]
                }
            },
            {
                "patchline": {
                    "destination": [
                        "obj-3",
                        1
                    ],
                    "source": [
                        "obj-1",
                        0
                    ]
                }
            },
            {
                "patchline": {
                    "destination": [
                        "obj-4",
                        1
                    ],
                    "source": [
                        "obj-3",
                        0
                    ]
                }
            }
        ],
        "dependency_cache": [],
        "autosave": 0
    }
}