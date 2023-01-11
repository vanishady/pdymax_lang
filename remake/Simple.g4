grammar Simple;

/*
* parser rules
*/

prog: PATCH ID NL (blockstmt|stmt)+ ';';

blockstmt
 : BLOCK ID '{' NL stmt* endofblock NL
 ;

endofblock: '}';

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
 : arg (',' arg)* (',' ioletbase )* 
 | ioletbase (',' ioletbase )* 
 ;

arg
 : SYMBOL
 | operation
 ;

operation
 : NUMBER
 | op=('*'|'/'|'*~'|'/~'|'+'|'-'|'+~'|'-~') NUMBER?
 ;



ioletbase
 : INOUTID '=' (NODETYPE parameters | operation | ID)	
 ;

ioletdeclstmt
 : ID '.' ioletbase
 | NODETYPE parameters '.' ioletbase
 ;



connectionstmt
 : connectionelem (CONNECT connectionelem)+
 ;

declinside
 : ID '=' (NODETYPE parameters) #FullDeclStmtInside
 | NODETYPE parameters #FastDeclStmtInside
 | ID '=' operation #OpDeclStmtInside
 ;

connectionelem
 : '<' (ID | declinside) (',' (ID | declinside))* '>' | (ID | declinside)
 ;



recallstmt
 : RECALL ID TO ID '{' NL stmt* '}' 
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
 : expr op=('*'|'/'|'+'|'-') expr	#MathExpr	
 | expr (EQ | NOT_EQ | '>' | '>=' | '<' | '<=' | '%' ) expr	#TestExpr
 | expr (AND | OR) expr	#LogicalExpr
 | NUMBER	#number
 | L_PAREN expr R_PAREN #ParensExpr
 ;

/*
* lexer rules
*/

//keywords

PATCH : 'patch' ;
BLOCK : 'block' ;
CONNECT : '::' ;
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