parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: (orden PYC)* EOF;
orden: expresion | asignacion | decl_funcion;

expresion: expresion (MAS|MENOS|POR|DIV) expresion
| PA expresion PC
| funcion
|NUM| IDENT;

asignacion: IDENT IGUAL expresion;

funcion: IDENT PA expresion PC;

decl_funcion: IDENT PA IDENT PC IGUAL expresion;