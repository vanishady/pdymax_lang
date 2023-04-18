
grammar Pdeasy;

/*
* parser rules
*/

prog: patchstmt importstmt* funcdefstmt* stmt* ';' ;
 
patchstmt: PATCH NAME ;  

importstmt: IMPORT NAME ; 

funcdefstmt: FUNC NAME typedparams '{' suite '}' ; 

returnstmt: RETURN expr? ;

stmt
 : blockstmt 
 | connectionstmt 
 | block_callstmt
 | func_callstmt
 | nodedecl 
 | simpledecl 
 | ifstmt 
 | forstmt 
 | returnstmt
 ; 

blockstmt: BLOCK NAME typedparams '{' suite '}' ;

func_callstmt: '@' NAME parameters ;

block_callstmt: '@' NAME parameters AS (varname | list_access) ;

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
 : SYMBOL | NUMBER | varname | NAME parameters | operation
 ;

list_access
 : varname '[' expr ']'
 ;

connectionstmt
 : connectionelem (CONNECT connectionelem)+
 ;

connectionelem
 : '[' singlenode (',' singlenode)* ']'	#multipleconn 
 |  singlenode 					#singleconn
 ;

singlenode
 : (inlet ':')? (varname | nodedecl | list_access) (':' outlet)?
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
 : expr
 | list
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
 | func_callstmt 								#TestCall
 | list_access 								#TestListAccess
 | '(' expr ')' 								#ParensExpr
 ;

forstmt
 : FOR varname 'in range' (NUMBER | func_callstmt | varname | list_access) ':' suite END
 ;

varname
 : NAME 
 ;

inlet
 : NUMBER 
 ;

outlet
 : NUMBER 
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


VARTYPE : 'intn' | 'floatn' | 'symbol' | 'list' ;
NAME 
 : ID_START ID_CONTINUE* 
 | LETTER+ '~'?
 ;

SYMBOL : '\'' SYMBOL_ADMITTED* '\'' ;
NUMBER : INTEGER | FLOAT ;
INTEGER : '-'? NON_ZERO_DIGIT DIGIT* | '0'+ ;
FLOAT : INTEGER? '.' INTEGER ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment NON_ZERO_DIGIT : [1-9] ;
fragment ID_START : '_' | LETTER ;
fragment ID_CONTINUE : LETTER | DIGIT | '_' ;
fragment SYMBOL_ADMITTED : LETTER | DIGIT | '_' | '.' | ',' | '\\' | '/' ; 

WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

