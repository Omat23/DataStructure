# Lista Enlazada Simple en Java

Este programa implementa las operaciones fundamentales de una estructura de datos de tipo **Lista Enlazada Simple (Singly Linked List)** utilizando nodos dinámicos para almacenar números enteros (`int`). No utiliza colecciones predefinidas de Java como `java.util.LinkedList`.

## Características del Programa

1. **Inicialización con 5 nodos:** Al iniciar la ejecución, se construye automáticamente una lista con 5 nodos iniciales predeterminados (`[10] -> [20] -> [30] -> [40] -> [50] -> null`).
2. **Indexación basada en 1:** La posición del primer elemento es la 1 (índice 1-based), facilitando la interacción amigable para el usuario.
3. **Operaciones requeridas:**
   - `agregarElemento(int elemento, int posicion)`: Inserta un nodo con el valor indicado en la posición `n` (entre 1 y `longitud + 1`).
   - `eliminarElemento(int posicion)`: Elimina el nodo en la posición `n` y retorna el elemento contenido antes de eliminarlo.
   - `buscarElemento(int elemento)`: Realiza una búsqueda secuencial y retorna la posición (1-indexada) del elemento si existe, o `-1` si no se encuentra.
   - `longitudLista()`: Retorna la cantidad total de elementos almacenados en la lista.
   - `listaVacia()`: Retorna `true` si la lista está vacía y `false` en caso contrario.
4. **Manejo de excepciones:** Validación de rangos mediante `IndexOutOfBoundsException` y control de subdesbordamiento con `IllegalStateException` en caso de intentar eliminar en una lista vacía.
5. **Documentación Javadoc:** Todo el código fuente está rigurosamente documentado con etiquetas Javadoc completas (`@param`, `@return`, `@throws`, `@author`, `@version`).

## Menú de Operaciones

```text
**************************************************
        MENÚ - OPERACIONES DE LISTA ENLAZADA      
**************************************************
1.- Agregar elemento en la posición n.
2.- Eliminar nodo en la posición n (devolver valor).
3.- Buscar elemento (obtener posición).
4.- Consultar longitud de la lista (longitudLista).
5.- Verificar si la lista está vacía (listaVacia).
6.- Mostrar lista en pantalla.
7.- Reinicializar lista con 5 nodos.
8.- Salir del programa.
**************************************************
```

## Estructura de Archivos

- `Nodo.java`: Representa la unidad básica de almacenamiento (dato entero y puntero al siguiente nodo).
- `ListaEnlazadaSimple.java`: Contiene la lógica, referencias (`cabeza`, `longitud`) y los métodos de manipulación de la lista.
- `Main.java`: Interfaz de consola con menú interactivo para el usuario y manejo de excepciones de entrada.

## Compilar y Ejecutar

Desde la carpeta raíz del repositorio (`DataStructure`):

```bash
javac LinkedList/*.java
java LinkedList.Main
```

## Integrantes

Este programa fue realizado por los siguientes integrantes:

- Flores Contreras Ariel Roberto
- Gonzalez Mendez Omar Gabriel
- Pegueros Trinidad Jorge Alexis
- Ramirez Pineda Luis Ernesto
- Rebolledo Hernandez Jesus Benjamin
