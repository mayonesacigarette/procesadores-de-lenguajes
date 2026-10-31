lexer grammar Analex;
BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;

PC : ')';
PA : '(';

PYC:';';
COMA: ',';

IGUAL: '=';
MAS:'+';
MENOS:'-';
POR:'*';
DIV:'/';

VARIABLES: 'VARIABLES';
INSTRUCCIONES: 'INSTRUCCIONES';

fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];
IDENT: LETRA (LETRA|DIGITO)*;
NUM: DIGITO+;