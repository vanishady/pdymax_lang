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
 : ID '=' (NODETYPE parameters) #FullDeclStmt
 | NODETYPE parameters #FastDeclStmt
 | ID '=' operation #OpDeclStmt	
 ;


parameters
 : '(' (typedargslist)? ')'
 ;

typedargslist
 : arg (',' arg)* (',' ioletdeclasarg )* 
 ;

arg
 : SYMBOL
 | operation
 ;

operation
 : NUMBER
 | op=('*'|'/'|'*~'|'/~'|'+'|'-'|'+~'|'-~') NUMBER?
 ;

ioletdeclasarg
 : INOUTID '=' (NODETYPE parameters | operation | ID)	
 ;

ioletdeclstmt
 : ID '.' ioletdeclasarg
 | NODETYPE parameters '.' ioletdeclasarg
 ;


connectionstmt
 : connectionelem (CONNECT connectionelem)+
 |
 ;

declinside
 : ID '=' (NODETYPE parameters) #FullDeclStmtInside
 | NODETYPE parameters #FastDeclStmtInside
 | ID '=' operation #OpDeclStmtInside
 ;

connectionelem
 : '<' (ID | declinside) (',' (ID | declinside))* '>' | (ID | declinside)
 ;

disconnectionstmt
 : disconnectionelem (DISCONNECT disconnectionelem)+
 ;

disconnectionelem
 : '<' ID (',' ID)* '>' | ID
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

NODETYPE: GENERALTYPE | OBJTYPE;

GENERALTYPE
 : 'array'
 | 'coords'
 | 'floatatom'
 | 'symbolatom'
 | 'text'
 | 'msg'
 | 'obj'
 ;

OBJTYPE
 : '\\' LETTER+ '~'?
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