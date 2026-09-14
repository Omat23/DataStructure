# Documentación de DynamicMemory

## Descripción

La carpeta `DynamicMemory` contiene una práctica en Java para trabajar con una lista dinámica usando `ArrayList<Integer>`. El objetivo es permitir al usuario crear, agregar, eliminar, buscar, ordenar y mostrar elementos enteros desde una interfaz sencilla con `JOptionPane`.

## Estructura

```text
DynamicMemory/
├── Main.java
├── Menu.java
├── OperationsList.java
├── README.md
```

## Main.java
Es la clase principal. Ejecuta el programa y abre el menú.

```java
package DynamicMemory;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuFunction();
    }
}
```

## Menu.java
Muestra las opciones del menú al usuario y dirige cada elección hacia la clase `OperationsList`.

Opciones:
- Crear lista
- Agregar un elemento
- Eliminar un elemento
- Buscar un elemento
- Ordenar ascendente
- Ordenar descendente
- Mostrar la lista
- Salir

## OperationsList.java
Aquí está la lógica principal.

Atributo:

```java
public ArrayList<Integer> listDynamic;
```

Métodos principales:
- `createList()` → crea la lista
- `addElement(int element)` → agrega un valor
- `deleteElement(int element)` → elimina por valor
- `searchElement(int element)` → devuelve la posición
- `sortList()` → ordena de menor a mayor
- `sortListReverse()` → ordena de mayor a menor
- `showList()` → devuelve la lista en texto

Ejemplo de eliminación:

```java
listDynamic.remove(Integer.valueOf(element));
```

Esto elimina el valor que coincida, no la posición.

## Cómo funciona la lista dinámica

`ArrayList` permite guardar elementos sin definir un tamaño fijo. Esto hace que la lista pueda crecer o reducirse durante la ejecución del programa.

## Cómo compilar y ejecutar

```bash
javac DynamicMemory/*.java
java -cp . DynamicMemory.Main
```

## Conclusión

Este proyecto es una introducción práctica a las listas dinámicas en Java, útil para entender cómo se agregan, eliminan, buscan y ordenan elementos dentro de una estructura flexible.
