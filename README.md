# A DSL for creating patches in Max and PureData

This project is meant to provide a *Domain Specific Language* which transpiles through Python to Max and PureData simultaneously. It already comes with a standard library, providing functional blocks to create multifacted nodes and structures in both Max and Pd.

## Requirements

To run the transpilation, the following tools are necessary:
- *[antlr4]([url](https://www.antlr.org/))* parser generator
- *python*

## How to run

To execute the transpilation, just open the prompt in the downloaded folder **py-eazy** and enter the command line:
```
python3 main.py
```
File manager will open. Then, select the DSL-based source code to run transpilation and get the relative patch in **outputs** folder.


## Project structure

The folder **py-eazy** is devided into:

- /*java-eazy*/: antlr4 to java (useful for visualizing AST)

- /*py-eazy*/: antlr4 to python (main project folder)

### py-eazy structure 

- /*doc*/ basic language documentation;
- /*inputs*/ includes examples of source-code written in DSL;
- /*lib*/ in this folder, all external DSL libraries should be included. Already comes with standard library *pdawlib*;
- /*outputs*/ by default, DSL stores transpilation outputs in this folder;
- /*samples*/ stores samples used in some example patches;
- /*utils*/ stores support files to execute transpilation;
- /*wrapped*/ stores Pd objects converted to Max. Add this folder to Max path to reach compatibility.
