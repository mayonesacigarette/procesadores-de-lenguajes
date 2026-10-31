un lenguaje llamado calcprog para programar secuencias de órdenes.\
la
orden puede ser: expresión entera, asignación o declaración de función. las declaraciones de
funciones están restringidas a un parámetro. el siguiente ejemplo muestra un programa típico
calcprog.\
3 + (4 + 1); // expresión\
a = 1 + 1; // asignación\
f(a) = 10 * a; // declaración de función\
f(a); // expresión\
g(x) = 10*f(x) + a; // declaración de función\
g(3); // expresión\
f(f(2)); // expresión\
f(a+1); // "expresión
