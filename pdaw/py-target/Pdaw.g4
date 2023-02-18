grammar Pdaw;

/*
* parser rules
*/

prog: patchstmt NL* (funcdefstmt|NL)* stmt* ';' ;

patchstmt: PATCH NAME NL ;  

funcdefstmt: FUNC NAME typedparams '{' suite returnstmt NL* '}' NL ; 

returnstmt: RETURN varname? NL ;

stmt
 : blockstmt NL
 | connectionstmt NL
 | callstmt NL
 | nodedeclstmt NL
 | simpledeclstmt NL
 | ifstmt NL
 | forstmt NL
 | NL
 ; 

blockstmt: BLOCK NAME typedparams '{' suite NL* dotdotstmt* NL* '}' NL ;

dotdotstmt: '..' (connectionstmt | nodedeclstmt | callstmt) NL ;  

callstmt: '@' NAME parameters (AS SYMBOL)?; 

nodedeclstmt
 : varname '=' NAME parameters? #nodedecl1
 | NAME parameters? #nodedecl2
 | operation #nodedecl3
 | varname '=' operation #nodedecl4
 ;

simpledeclstmt
 : varname '=' SYMBOL
 | varname '=' NUMBER
 | varname '=' list
 | varname '=' slicedlist
 | varname '=' callstmt
 | varname '=' expr
 ;

list
 : '[' (listelem (',' listelem)*)* ']'
 ;

listelem
 : SYMBOL | NUMBER | varname
 ;

slicedlist
 : varname '[' varname ']'
 | varname '[' NUMBER ']'
 ;

connectionstmt
 : connectionelem (CONNECT connectionelem)+
 ;

connectionelem
 : '[' singlenode (',' singlenode)* ']' #multipleconn 
 |  singlenode #singleconn
 ;

singlenode
 : (varname | nodedeclstmt)('.'IOLET)?
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
 | slicedlist
 | list
 | expr
 ;

typedarg
 : varname ':' VARTYPE
 ;

suite
 : NL stmt+
 ;

operation
 : op=('*'|'/'|'*~'|'/~'|'+'|'-'|'+~'|'-~'|'%') NUMBER?
 ;

ifstmt
 : IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
 ;

expr
 : expr op=('*'|'/'|'+'|'-'|'%') expr	#MathExpr	
 | expr testop=('==' | '!=' | '>' | '>=' | '<' | '<=') expr	#TestExpr
 | NUMBER	#testnumber
 | varname #testvar
 | callstmt #testfunc
 | slicedlist #testsliced
 | '(' expr ')' #ParensExpr
 ;

forstmt
 : FOR varname 'in range' (NUMBER | callstmt | varname) ':' suite END
 ;

varname
 : VARNAME ('+' VARNAME)?
 | VARNAME ('+' SYMBOL)?
 ;



/*
* lexer rules
*/

PATCH : 'patch' ;
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

NL : '\r'? '\n';
WS : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

