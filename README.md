# Implementación de Cola Estática (Fila) en Java

Este proyecto contiene un programa en Java que implementa las operaciones básicas de una estructura de datos de tipo **Cola (Queue)** de manera estática, utilizando un arreglo unidimensional de números enteros de tamaño fijo (5 elementos).

## Integrantes
Este programa fue realizado por los siguientes integrantes:
* Flores Contreras Ariel Roberto
* Gonzalez Mendez Omar Gabriel
* Pegueros Trinidad Jorge Alexis
* Ramirez Pineda Luis Ernesto
* Rebolledo Hernandez Jesus Benjamin

## Características del Programa

El programa gestiona una cola con operaciones básicas y cumple con las siguientes restricciones y funcionalidades:
- **No utiliza** la librería nativa `java.util.Queue`.
- Se implementa sobre un arreglo de tamaño estático máximo de 5 elementos.
- Control de excepciones de flujo de datos: `Overflow` (desbordamiento) cuando se intenta insertar y la cola está llena, y `Underflow` (subdesbordamiento) cuando se intenta recuperar de una cola vacía.
- Impresión horizontal del estado de la cola mostrando de manera intuitiva el flujo FIFO (First In, First Out) indicando la entrada (izquierda) y salida (derecha).

## Menú de Operaciones

Al ejecutar el programa, se despliega el siguiente menú interactivo:

```text
***** Operaciones con cola ******
************ - Menú - ************
* 1.- Insertar elemento.
* 2.- Recuperar elemento.
* 3.- Vaciar cola.
* 4.- Mostrar cola en la pantalla.
* 7.- Salir del programa.
* ---- Seleccione una opción:
```

### Opciones Detalladas

1. **Insertar elemento (push):** Solicita un número entero para agregarlo a la cola. Valida el estado de la cola (lanzando una advertencia de `Overflow` si la cola está llena). Después de insertar, muestra la cola de forma horizontal.
2. **Recuperar elemento (pop):** Extrae el primer elemento en espera de la cola. Valida si la cola está vacía (lanzando `Underflow` en caso afirmativo). Muestra el elemento recuperado e imprime el nuevo estado de la cola. Si se vacía, lo indica con un mensaje.
3. **Vaciar cola (clear):** Elimina todos los elementos reestableciendo la cola a su estado inicial.
4. **Mostrar cola en la pantalla:** Imprime el estado actual de la cola.
5. **Salir del programa:** Termina la ejecución.

## Ejecución

1. Ubícate en el directorio superior (`DataStructure`).
2. Compila el programa ejecutando: `javac Queue/*.java`
3. Ejecuta el programa con: `java Queue.Main`
