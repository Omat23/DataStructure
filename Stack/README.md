# Pila estática de enteros en Java

Este programa implementa las operaciones básicas de una pila (LIFO: último en
entrar, primero en salir) mediante un arreglo unidimensional de enteros con
capacidad fija de cinco elementos. No utiliza la biblioteca `java.util.Stack`.

## Operaciones

El menú permite insertar un entero (`push`), recuperar y eliminar el elemento
de la cima (`pop`), vaciar la pila y mostrar su contenido. La pila se imprime
horizontalmente desde la base hacia la cima, que aparece a la derecha. Al
intentar insertar en una pila llena se informa `Overflow`; al recuperar de una
pila vacía se informa `Underflow`.

## Archivos

- `Main.java`: menú de consola y validación de las opciones y entradas.
- `StaticStack.java`: arreglo y operaciones de la pila.

## Compilar y ejecutar

Desde la carpeta raíz del repositorio:

```text
javac Stack\Main.java Stack\StaticStack.java
java Stack.Main
```

El programa fue realizado por los siguientes integrantes:

- Flores Contreras Ariel Roberto
- Gonzalez Mendez Omar Gabriel
- Pegueros Trinidad Jorge Alexis
- Ramirez Pineda Luis Ernesto
- Rebolledo Hernandez Jesus Benjamin
