grammar Simple;

/*
* parser rules
*/

prog: (INCLUDE ID NL)* PATCH ID NL (blockstmt|stmt)+ ';';

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
 | recallstmt NL
 | ifstmt NL
 | forstmt NL
 | BREAK NL
 | CONTINUE NL
 | PASS NL
 | NL
 ;

declarationstmt
 : ID '=' (NODETYPE parameters) 
 | SCHEME '=' expr 
 | NODETYPE parameters		
 ;


parameters
 : '(' (typedargslist)? ')'
 ;

typedargslist
 : arg (',' arg)* (',' INOUTID '=' (NODETYPE parameters | ID) )* 
 ;

arg
 : SYMBOL
 | NUMBER
 ;

ioletdeclstmt
 : ID '.' INOUTID '=' (NODETYPE parameters | ID)
 | NODETYPE parameters '.' INOUTID '=' (NODETYPE parameters | ID)
 ;


connectionstmt
 : ('<' (ID | declarationstmt) (',' (ID | declarationstmt))* '>' | (ID | declarationstmt)) (CONNECT ('<' (ID | declarationstmt) (',' (ID | declarationstmt))* '>' | (ID | declarationstmt)))+
 | ('<' ID (',' ID)* '>' | ID) (DISCONNECT ('<' ID (',' ID)* '>' | ID))+
 ;

recallstmt
 : RECALL ID TO ID '{' NL (stmt | subblockstmt)* '}' 
 ;


ifstmt
 : IF expr ':' suite (ELIF expr ':' suite)* (ELSE ':' suite)? END
 ;

forstmt
 : FOR INTEGER 'rounds do' ':' suite END
 ;


suite
 : NL stmt+ 
 ;


expr
 : expr op=('*'|'/'|'*~'|'/~') expr	#MulDiv	
 | expr op=('+'|'-'|'+~'|'-~') expr	#AddSub
 | expr (EQ | NOT_EQ | '>' | '>=' | '<' | '<=' | '%' ) expr	#Test
 | expr (AND | OR) expr	#Logical
 | NUMBER	#number
 | ID		#id
 | NODETYPE parameters	#DynamicAssign
 | L_PAREN expr R_PAREN #Parens
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
RECALL : 'recall' ;
TO : 'to' ;
SCHEME : 'scheme' ;

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
POW : '**' ;
MOD : '%' ;
OR : '||' ;
AND : '&&' ;
SIGMINUS : '-~' ; 
SIGPLUS : '+~' ;
SIGDIV : '/~' ; 
SIGSTAR : '*~' ;
PLUS : '+' ;
MINUS : '-' ;
STAR: '*' ;
DIV : '/' ;

OPERATOR
 : SIGMINUS
 | SIGPLUS
 | SIGDIV
 | SIGSTAR
 | PLUS
 | MINUS
 | STAR
 | DIV
 ;

NODETYPE
 : 'array'
 | 'coords'
 | 'floatatom'
 | 'symbolatom'
 | 'text'
 | 'message'
 | 'object'
 | NUMBER 
 | OPERATOR
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