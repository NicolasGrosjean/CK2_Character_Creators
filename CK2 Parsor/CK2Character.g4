/**
 * Define a grammar for CK2 characters
 */
grammar CK2Character;
character : NUMBER '=' '{' (attribute | date_attribute)+ '}';

attribute : STRING '=' value;
date_attribute : DATE '=' '{' STRING '=' STRING '}';
value : NUMBER | STRING | ('\"' STRING '\"');

STRING : [A-Za-z_]+ ;
NUMBER : [0-9]+;
DATE : NUMBER '.' NUMBER '.' NUMBER;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' (STRING|NUMBER)+ -> skip;
