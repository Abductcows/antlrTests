grammar Declaration;

file:
    declaration (NEWLINE+ declaration)* EOF;

declaration: TYPE variableName (',' variableName)* ';';

variableName: ID;

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];

TYPE: 'char' | 'byte' | 'int' | 'long' | 'float' | 'double';
ID: (LETTER | '_') (LETTER | DIGIT | '_' )*;
NEWLINE: '\n' | '\r\n';
WHITESPACE: [ \t] -> skip;