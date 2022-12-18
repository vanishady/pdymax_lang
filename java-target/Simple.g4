grammar Simple;

/*
* parser rules
*/

prog: (INCLUDE ID NL)* PATCH ID NL (blockstmt|stmt)+ ;

blockstmt
 : BLOCK ID '{' NL (stmt | subblockstmt)* '}' NL
 ;

subblockstmt
 : SUBBLOCK ID '{' NL stmt* '}' NL
 ;

stmt
 : declarationstmt NL
 | ioletdeclstmt NL
 | connectionstmt NL
 | ifstmt NL
 | forstmt NL
 | BREAK NL
 | CONTINUE NL
 | PASS NL
 | NL
 ;

declarationstmt
 : ID '=' (NODETYPE parameters) 
 | ID '=' expr
 | NODETYPE parameters		
 ;


parameters
 : '(' (typedargslist)? ')'
 ;

typedargslist
 : arg (',' arg)* (',' INOUTID '=' (NODETYPE parameters | expr) )*
 ;

arg
 : INOUTID
 | SYMBOL
 | NUMBER
 ;

ioletdeclstmt
 : ID '.' INOUTID '=' (NODETYPE parameters | expr)
 | NODETYPE parameters '.' INOUTID '=' (NODETYPE parameters | expr)
 ;


connectionstmt
 : ('<' (ID | declarationstmt) (',' (ID | declarationstmt))* '>' | (ID | declarationstmt)) (CONNECT ('<' (ID | declarationstmt) (',' (ID | declarationstmt))* '>' | (ID | declarationstmt)))+
 | ('<' ID (',' ID)* '>' | ID) (DISCONNECT ('<' ID (',' ID)* '>' | ID))+
 ;


ifstmt
 : IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
 ;

forstmt
 : FOR INTEGER 'rounds do' ':' NL stmt+ END
 ;


suite
 : NL stmt+ 
 ;


expr
 : expr ('*'|'/') expr
 | expr ('+'|'-') expr
 | expr ('**') expr
 | expr ('%') expr
 | expr (EQ | NOT_EQ | '>' | '>=' | '<' | '<=' ) expr
 | expr (AND | OR) expr
 | NUMBER
 | SYMBOL
 | ID
 | L_PAREN expr R_PAREN
 ;

/*
* lexer rules
*/

//keywords

PATCH : 'patch' ;
INCLUDE : 'include' ;
BLOCK : 'block' ;
SUBBLOCK : 'subblock' ;
CONNECT : '::' ;
DISCONNECT : 'disconnect' | ':x' ;
IF : 'if' ;
ELIF : 'elif' ;
ELSE : 'else' ;
FOR : 'for' ;
THISROUND : 'thisround' ;
BREAK : 'break' ;
CONTINUE : 'continue' ;
PASS : 'pass' ;
END : 'end' ;

//punctuation

L_PAREN : '(' ;
R_PAREN : ')' ;
L_CURLY : '{' ;
R_CURLY : '}' ;
L_BRACKET : '[' ;
R_BRACKET : ']' ;
L_ANGLE : '<' ;
R_ANGLE : '>';
EQ : '==' ;
NOT_EQ : '!=' ;
PLUS : '+' ;
MINUS : '-' ;
POW : '**' ;
STAR: '*' ;
DIV : '/' ;
MOD : '%' ;
OR : '||' ;
AND : '&&' ;
SIGMINUS : '-~' ;
SIGPLUS : '+~' ;
SIGDIV : '/~' ;
SIGSTAR : '*~' ;

NODETYPE
 : 'array'
 | 'coords'
 | 'floatatom'
 | 'symbolatom'
 | 'text'
 | 'message'
 | 'object'
 ;


INOUTID : '$' '-'? DIGIT ;
ID : ID_START ID_CONTINUE* ;
SYMBOL : '\'' LETTER* '\'' ;
NUMBER : INTEGER | FLOAT ;
INTEGER : NON_ZERO_DIGIT DIGIT* | '0'+ ;
FLOAT : INTEGER? '.' INTEGER ;


fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment NON_ZERO_DIGIT : [1-9] ;
fragment ID_START : '_' | LETTER ;
fragment ID_CONTINUE : LETTER | DIGIT ;

NL : '\r'? '\n';
WS : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;