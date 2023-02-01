grammar Pdaw;

/*
* parser rules
*/

prog: (importstmt|NL)* patchstmt NL* (funcdefstmt|NL)* stmt* ';' ;

importstmt: IMPORT NAME NL ;

patchstmt: PATCH NAME NL ;  

funcdefstmt: FUNC NAME typedparams '{' suite returnstmt? NL* '}' NL ; 

returnstmt: RETURN VARNAME (',' VARNAME)* NL ;

stmt
 : blockstmt NL
 | connectionstmt NL
 | callstmt NL
 | nodedeclstmt NL?
 | simpledeclstmt NL?
 | NL
 ; 

blockstmt: BLOCK NAME typedparams '{' suite '}' NL ; 

callstmt: '@' NAME parameters ; 

nodedeclstmt
 : VARNAME '=' NAME parameters?
 | NAME parameters? 
 | operation
 | VARNAME '=' operation
 ;

simpledeclstmt
 : VARNAME '=' SYMBOL
 | VARNAME '=' NUMBER
 ;

connectionstmt
 : connectionelem (CONNECT connectionelem)+
 ;

connectionelem
 : '[' (VARNAME | nodedeclstmt) (',' (VARNAME | nodedeclstmt))* ']' 
 | (VARNAME | nodedeclstmt)
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
 | VARNAME
 ;

typedarg
 : VARNAME ':' VARTYPE
 ;

suite
 : NL stmt+
 ;

operation
 : op=('*'|'/'|'*~'|'/~'|'+'|'-'|'+~'|'-~'|'%') NUMBER?
 ;



/*
* lexer rules
*/

IMPORT : 'import' ;
PATCH : 'patch' ;
FUNC : 'func' ;
BLOCK : 'block' ;
RETURN : 'return' ;
CONNECT : '>' ;

VARTYPE : 'intn' | 'floatn' | 'symbol' | 'node' ;
NAME 
 : ID_START ID_CONTINUE* 
 | LETTER+ '~'?
 ;
VARNAME : '$' ID_CONTINUE* ;

SYMBOL : '\'' ID_CONTINUE* '\'' ;
NUMBER : INTEGER | FLOAT ;
INTEGER : NON_ZERO_DIGIT DIGIT* | '0'+ ;
FLOAT : INTEGER? '.' INTEGER ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment NON_ZERO_DIGIT : [1-9] ;
fragment ID_START : '_' | LETTER ;
fragment ID_CONTINUE : LETTER | DIGIT | '_' ;

NL : '\r'? '\n';
WS : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

