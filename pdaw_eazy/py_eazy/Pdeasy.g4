grammar Pdeasy;

/*
* parser rules
*/

prog: patchstmt importstmt* (funcdefstmt)* stmt* ';' ;
 
patchstmt: PATCH NAME ;  

importstmt: IMPORT NAME ; 

funcdefstmt: FUNC NAME typedparams '{' suite '}' ; 

returnstmt: RETURN (varname | expr | node_expr)? ;

stmt
 : blockstmt 
 | connectionstmt 
 | callstmt 
 | nodedecl 
 | simpledecl 
 | node_expr
 | ifstmt 
 | forstmt 
 | returnstmt
 ; 

blockstmt: BLOCK NAME typedparams '{' suite '}' ;

callstmt: '@' NAME parameters (AS varname)? ;

nodedecl
 : varname '=' NAME parameters	#nodedecl1
 | NAME parameters 			#nodedecl2
 | operation 				#nodedecl3
 | varname '=' operation 		#nodedecl4
 ;

simpledecl
 : varname '=' expr
 | varname '=' list
 ;

list
 : '[' (listelem (',' listelem)*)* ']'
 ;

listelem
 : SYMBOL | NUMBER | varname
 ;

list_access
 : varname '[' varname ']'
 | varname '[' NUMBER ']'
 ;

connectionstmt
 : connectionelem (CONNECT connectionelem)+
 ;

connectionelem
 : '[' singlenode (',' singlenode)* ']'	#multipleconn 
 |  singlenode 					#singleconn
 ;

singlenode
 : (varname | nodedecl)('.'IOLET)?
 ;

parameters
 : '(' argslist? ')'
 ;

typedparams
 : '(' typedargslist? ')'
 ;

argslist
 : arg (',' arg)* 
 ;

typedargslist
 : typedarg (',' typedarg)*
 ;

arg
 : SYMBOL
 | NUMBER
 | varname
 | callstmt
 | list_access
 | list
 | expr
 ;

typedarg
 : varname ':' VARTYPE
 ;

suite
 : stmt+
 ;

operation
 : op=('*'|'/'|'*~'|'/~'|'+'|'-'|'+~'|'-~'|'%') '(' (NUMBER | varname | list_access)? ')'
 ;

ifstmt
 : IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
 ;

expr
 : expr op=('*'|'/'|'%') expr						#MulDiv
 | expr op=('+'|'-') expr						#SubAdd
 | expr testop=('==' | '!=' | '>' | '>=' | '<' | '<=') expr	#TestCompare
 | NUMBER									#TestNum
 | SYMBOL									#TestSym
 | varname 									#TestVar
 | callstmt 								#TestCall
 | list_access 								#TestListAccess
 | '(' expr ')' 								#ParensExpr
 ;

node_expr
 : (varname | nodedecl) op=('*~'|'/~'|'%~') (varname | nodedecl) '->' (varname | nodedecl)
 | (varname | nodedecl) op=('+~'|'-~') (varname | nodedecl) '->' (varname | nodedecl)
 ;

forstmt
 : FOR varname 'in range' (NUMBER | callstmt | varname) ':' suite END
 ;

varname
 : VARNAME 
 ;

/*
* lexer rules
*/

PATCH : 'patch' ;
IMPORT : 'import' ;
FUNC : 'func' ;
BLOCK : 'block' ;
RETURN : 'return' ;
CONNECT : '>' ;
END : 'end';
IF : 'if' ;
ELIF : 'elif' ;
ELSE : 'else' ;
FOR : 'for' ;
AS : 'as' ;


VARTYPE : 'intn' | 'floatn' | 'symbol' | 'list' | 'node' ;
IOLET : IOLET_START NON_ZERO_DIGIT+ ;
NAME 
 : ID_START ID_CONTINUE* 
 | LETTER+ '~'?
 ;
VARNAME : '$' ID_CONTINUE* ;

SYMBOL : '\'' SYMBOL_ADMITTED* '\'' ;
NUMBER : INTEGER | FLOAT ;
INTEGER : '-'? NON_ZERO_DIGIT DIGIT* | '0'+ ;
FLOAT : INTEGER? '.' INTEGER ;


fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment NON_ZERO_DIGIT : [1-9] ;
fragment ID_START : '_' | LETTER ;
fragment ID_CONTINUE : LETTER | DIGIT | '_' ;
fragment IOLET_START : 'in' | 'out' ;
fragment SYMBOL_ADMITTED : LETTER | DIGIT | '_' | '.' | ',' | '\\' | '/' ; 

WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

