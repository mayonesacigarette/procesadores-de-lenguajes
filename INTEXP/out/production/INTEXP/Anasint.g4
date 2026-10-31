parser grammar Anasint;
   options{
   tokenVocab=Analex;
   }

programa: variables instrucciones EOF;

variables: VARIABLES vars PYC;

vars: IDENT COMA vars | IDENT;

instrucciones: INSTRUCCIONES (instr)*;

instr: IDENT IGUAL expr PYC;

expr: expr (MAS|MENOS|POR|DIV) expr
|PA expr PC
|IDENT PA PC
|IDENT
|NUM;