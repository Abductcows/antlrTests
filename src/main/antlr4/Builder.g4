/**
    Define a java builder
*/
grammar Builder;

class_declaration:
    class_name (declaration_separator members)?
    ;

class_name:
    ID
    ;

members:
    member_line (declaration_separator member_line)+
    ;

member_line:
    type ((required_members | optional_members) member_separator)+
    ;

type:
    ID
    ;

required_members:
    required_member (member_separator required_member)*
    ;

required_member:
    ID
    ;

optional_members:
    '(' optional_member (member_separator optional_member)* ')'
    ;

optional_member:
    ID ('=' default_value)?
    ;

default_value:
        ID
    |   NUMBER
    |   QUOTED_VALUE
    ;

declaration_separator:
        ';'? NEWLINE+
    |   ';'
    ;

member_separator:
        ','
    |
    ;

fragment LETTER: [a-zA-Z];
fragment ID_SPECIAL_CHAR: [_$];

ID: (LETTER | ID_SPECIAL_CHAR) (LETTER | [0-9] | ID_SPECIAL_CHAR )*;
NUMBER: [-+]?[0-9]*[.]?[0-9]+([eE][-+]?[0-9]+)?;
NEWLINE: '\n' | '\r\n';
SPACES: (' ' | '\t')+ -> skip;

QUOTED_VALUE: '"'.*?'"';
