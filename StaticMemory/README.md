# Documentación de StaticMemory

## Descripción

La carpeta `StaticMemory` contiene una práctica en Java para trabajar con arreglos estáticos (`int[]`). El objetivo es permitir al usuario crear un arreglo de tamaño fijo (cuyos valores se llenan inicialmente con números aleatorios entre 10 y 99), y luego poder modificar posiciones, "eliminar" elementos (reemplazándolos con ceros), buscar valores, ordenar el arreglo usando el método de la burbuja y mostrar sus elementos. Todo mediante una interfaz sencilla con `JOptionPane`.

## Estructura

```text
StaticMemory/
├── Main.java
├── Menu.java
├── OperationsArray.java
├── README.md
```

## Main.java
Es la clase principal. Ejecuta el programa instanciando el menú.

```java
package StaticMemory;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuFunction();
    }
}
```

## Menu.java
Muestra las opciones del menú interactivo al usuario y dirige cada elección hacia la clase `OperationsArray`.

Opciones disponibles:
- Crear vector (arreglo estático)
- Agregar un elemento (modificar valor en un índice)
- Eliminar un elemento (búsqueda por valor y reemplazo por 0)
- Buscar un elemento (devuelve el índice)
- Ordenar elementos (menor a mayor o mayor a menor)
- Mostrar los elementos
- Salir

## OperationsArray.java
Aquí se concentra toda la lógica.

Atributo principal:

```java
private int[] array;
```

Métodos principales:
- `createArray()` → Pide la longitud y llena el arreglo con números aleatorios entre 10 y 99.
- `addElement(int element, int index)` → Modifica o añade un valor en el índice especificado.
- `deleteElement(int element)` → Busca la primera coincidencia del valor y la simula como "eliminado" reemplazándola con `0`.
- `searchElement(int element)` → Busca un número y devuelve su posición (índice) actual, devolviendo `-1` si no existe.
- `sortArrayAsc()` / `sortArrayDesc()` → Ordena los elementos aplicando el algoritmo de *burbuja*.
- `showArray()` → Muestra los elementos en formato de lista `[x, y, z]`.

## Cómo compilar y ejecutar

```bash
javac StaticMemory/*.java
java -cp . StaticMemory.Main
```

## Conclusión

Este pequeño proyecto demuestra cómo administrar memoria estática en Java usando arreglos convencionales, su diferencia fundamental con las colecciones dinámicas (como ArrayList) y cómo aplicar lógicas básicas de búsqueda y ordenamiento clásico (burbuja).
