
grammar Pdeasy;

/*
* parser rules
*/

prog: patchstmt importstmt* funcdefstmt* stmt* ';' ;
 
patchstmt: PATCH NAME ;  

importstmt: IMPORT NAME ; 

funcdefstmt: FUNC NAME typedparams '{' suite '}' ; 

returnstmt: RETURN arg ;

stmt
 : blockstmt 
 | connectionstmt 
 | callstmt
 | nodedecl 
 | simpledecl 
 | ifstmt 
 | forstmt 
 | returnstmt
 | flow_stmt
 ; 

flow_stmt
 : BREAK
 | CONTINUE
 | PASS
 ;

blockstmt: BLOCK NAME typedparams '{' suite? '}' ;

callstmt: '@' NAME parameters ;

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
 : (inlet ':')? (nodedecl | varname | callstmt | list_access | simpledecl) (':' outlet)?
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
 | NAME parameters
 | operation
 ;

typedarg
 : varname ':' VARTYPE
 ;

suite
 : stmt+
 ;

operation
 : op=('*'|'/'|'*~'|'/~'|'+'|'-'|'+~'|'-~'|'%') '(' expr? ')'
 ;

ifstmt
 : IF comparison ':' suite (ELIF comparison ':' suite)* (ELSE ':' suite)? END
 ;

expr
 : expr op=('*'|'/'|'%') expr						#MulDiv
 | expr op=('+'|'-') expr						#SubAdd
 | NUMBER									#TestNum
 | SYMBOL									#TestSym
 | varname 									#TestVar
 | callstmt 								#TestCall
 | list_access 								#TestListAccess
 | '(' expr ')' 								#ParensExpr
 ;

comparison
 : expr testop=('==' | '!=' | '>' | '>=' | '<' | '<=') expr	
 ;

forstmt
 : FOR varname 'in range' expr ':' suite END
 ;

varname
 : NAME 
 ;

inlet
 : NUMBER 
 | expr
 ;

outlet
 : NUMBER 
 | expr
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
BREAK : 'break' ;
CONTINUE : 'continue' ;
PASS : 'pass' ;


VARTYPE : 'intn' | 'floatn' | 'symbol' | 'list' | 'node' ;
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
fragment SYMBOL_ADMITTED : LETTER | DIGIT | '_' | '.' | ',' | '\\' | '/' | '#' | '!' | '&' | '<' | '$' ; 

WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;
