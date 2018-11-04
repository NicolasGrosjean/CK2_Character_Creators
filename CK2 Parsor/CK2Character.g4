/**
 * Define a grammar for CK2 characters
 * 
 * Tuto : https://willowtreeapps.com/ideas/an-introduction-to-language-lexing-and-parsing-with-antlr
 * Exemple : https://github.com/antlr/antlr4/blob/master/tool-testsuite/test/org/antlr/v4/test/tool/Java.g4
 */
grammar CK2Character;
characters : character+ EOF;
character : NUMBER '=' '{' (attribute | date_attribute)+ '}';

attribute : STRING '=' value;
date_attribute : DATE '=' '{' STRING '=' STRING '}';
value : NUMBER | STRING | ('\"' STRING '\"');

STRING : [A-Za-z_]+ ;
NUMBER : [0-9]+;
DATE : NUMBER '.' NUMBER '.' NUMBER;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip;
