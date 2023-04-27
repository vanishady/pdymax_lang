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
                    "maxclass": "ezdac~",
                    "patching_rect": [
                        27.0,
                        162.0,
                        30,
                        30
                    ]
                }
            },
            {
                "box": {
                    "id": "obj-1",
                    "maxclass": "flonum",
                    "parameter_enable": 0,
                    "patching_rect": [
                        27.0,
                        18.0,
                        40,
                        40
                    ]
                }
            },
            {
                "box": {
                    "id": "obj-2",
                    "maxclass": "newobj",
                    "patching_rect": [
                        27.0,
                        90.0,
                        40,
                        40
                    ],
                    "text": "cycle~"
                }
            },
            {
                "box": {
                    "id": "obj-3",
                    "maxclass": "newobj",
                    "patching_rect": [
                        99.0,
                        162.0,
                        40,
                        40
                    ],
                    "text": "t b f"
                }
            },
            {
                "box": {
                    "id": "obj-4",
                    "maxclass": "newobj",
                    "patching_rect": [
                        171.0,
                        162.0,
                        40,
                        40
                    ],
                    "text": "mtof"
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
                        "obj-0",
                        1
                    ],
                    "source": [
                        "obj-2",
                        0
                    ]
                }
            }
        ],
        "dependency_cache": [],
        "autosave": 0
    }
}