un programa INTEXP es una secuencia de asignaciones. cada asignación asocia una expresión
entera a una variable.\
las expresiones enteras pueden contener variables (z), variables preasignadas (z()), constantes, sumas, restas, productos,
divisiones y sub-expresiones entre paréntesis (p.e. (x+1)). \
toda variable pre-asignada
se considerada inicializada a cero.\
ejemplo de programa INTEXP:\
VARIABLES x,y,z;\
INSTRUCCIONES\
x=1;\
y=2*(x+7);\
z=z+1;\
x=z();\
la asignación tercera será ambigua por no haber predefinido z.\
queremos un diseño de gramática atribuida para un analizador semántico de INTEXP capaz de
detectar asignaciones ambiguas (no tiene asignado ningún entero)\
el objetivo es que la ejecución del analizador semántico sobre el programa anterior emita los
siguientes mensajes por pantalla:\
Asignación z = z + 1 es ambigua (Instrucción 3).
