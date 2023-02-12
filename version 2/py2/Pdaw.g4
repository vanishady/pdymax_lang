grammar Pdaw;

/*
* parser rules
*/

prog: (importstmt|NL)* patchstmt NL* (funcdefstmt|NL)* stmt* ';' ;

importstmt: IMPORT NAME NL ;

patchstmt: PATCH NAME NL ;  

funcdefstmt: FUNC NAME typedparams '{' suite returnstmt? NL* eos NL ; 

returnstmt: RETURN VARNAME (',' VARNAME)* NL ;

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

blockstmt: BLOCK NAME typedparams '{' suite dotdotstmt* NL* eos NL ;

dotdotstmt: '..' (connectionstmt | nodedeclstmt | callstmt) NL ;  

callstmt: '@' NAME parameters ; 

nodedeclstmt
 : VARNAME '=' NAME parameters? #nodedecl1
 | NAME parameters? #nodedecl2
 | operation #nodedecl3
 | VARNAME '=' operation #nodedecl4
 ;

simpledeclstmt
 : VARNAME '=' SYMBOL
 | VARNAME '=' NUMBER
 | VARNAME '=' list
 | VARNAME '=' slicedlist
 | VARNAME '=' callstmt
 | VARNAME '=' expr
 ;

list
 : '[' (listelem (',' listelem)*)* ']'
 ;

listelem
 : SYMBOL | NUMBER | VARNAME
 ;

slicedlist
 : VARNAME '[' VARNAME ']'
 | VARNAME '[' NUMBER ']'
 ;

connectionstmt
 : connectionelem (CONNECT connectionelem)+
 ;

connectionelem
 : '[' (VARNAME | nodedeclstmt) ('.'IOLET)? (',' (VARNAME | nodedeclstmt) ('.'IOLET)?)* ']' #multipleconn 
 | (VARNAME | nodedeclstmt)('.'IOLET)? #singleconn
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
 | callstmt
 | slicedlist
 | list
 | expr
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

ifstmt
 : IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
 ;

expr
 : expr op=('*'|'/'|'+'|'-'|'%') expr	#MathExpr	
 | expr testop=('==' | '!=' | '>' | '>=' | '<' | '<=') expr	#TestExpr
 | NUMBER	#testnumber
 | VARNAME #testvar
 | callstmt #testfunc
 | '(' expr ')' #ParensExpr
 ;

forstmt
 : FOR VARNAME 'in range' (NUMBER | callstmt | VARNAME) ':' suite END
 ;

eos
 : '}'
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
END : 'end';
IF : 'if' ;
ELIF : 'elif' ;
ELSE : 'else' ;
FOR : 'for' ;


VARTYPE : 'intn' | 'floatn' | 'symbol' | 'node' ;
IOLET : IOLET_START NON_ZERO_DIGIT+ ;
NAME 
 : ID_START ID_CONTINUE* 
 | LETTER+ '~'?
 ;
VARNAME : '$' ID_CONTINUE* ;

SYMBOL : '\'' ID_CONTINUE* '\'' ;
NUMBER : INTEGER | FLOAT ;
INTEGER : '-'? NON_ZERO_DIGIT DIGIT* | '0'+ ;
FLOAT : INTEGER? '.' INTEGER ;


fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment NON_ZERO_DIGIT : [1-9] ;
fragment ID_START : '_' | LETTER ;
fragment ID_CONTINUE : LETTER | DIGIT | '_' ;
fragment IOLET_START : 'in' | 'out' ;

NL : '\r'? '\n';
WS : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

