/**
    Define a java builder
*/
grammar Builder;

class_declaration:
    class_name declaration_separator members
    ;

class_name:
    (CLASS_DECLARATION_PREFIX)? ID
    ;

/**
    String a, b; <-- one declaration
    int c d      <-- another declaration
*/
members:
    (member_line declaration_separator)+
    ;

member_line:
    type ((required_members | optional_members) member_separator)+
    ;

type: ID
    ;

required_members: (ID member_separator)+
    ;

optional_members: '(' (ID member_separator)+ ')'
    ;

declaration_separator:
        NEWLINE+
    |   ';' NEWLINE*
    |
    ;

member_separator:
        ','
    |
    ;

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ID_SPECIAL_CHAR: [_$];

fragment A:[aA]; fragment B:[bB]; fragment C:[cC]; fragment D:[dD];
fragment E:[eE]; fragment F:[fF]; fragment G:[gG]; fragment H:[hH];
fragment I:[iI]; fragment J:[jJ]; fragment K:[kK]; fragment L:[lL];
fragment M:[mM]; fragment N:[nN]; fragment O:[oO]; fragment P:[pP];
fragment Q:[qQ]; fragment R:[rR]; fragment S:[sS]; fragment T:[tT];
fragment U:[uU]; fragment V:[vV]; fragment W:[wW]; fragment X:[xX];
fragment Y:[yY]; fragment Z:[zZ];

CLASS_DECLARATION_PREFIX: B U I L D E R ' ' O F;

ID: (LETTER | ID_SPECIAL_CHAR) (LETTER | DIGIT | ID_SPECIAL_CHAR )*;
NEWLINE: '\n' | '\r\n';
WHITESPACE: [ \t] -> skip;