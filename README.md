# Documentación del proyecto DynamicMemory

## Descripción general

La carpeta `DynamicMemory` contiene una pequeña aplicación en Java para practicar el manejo de una lista dinámica usando `ArrayList<Integer>`. Su objetivo es permitir al usuario crear, agregar, eliminar, buscar, ordenar y mostrar elementos enteros de forma interactiva.

Este proyecto se enfoca en una estructura de datos dinámica, donde el tamaño de la lista puede cambiar durante la ejecución del programa sin declarar un límite fijo.

## Estructura de la carpeta

```text
DynamicMemory/
├── Main.java
├── Menu.java
├── OperationsList.java
```

## Archivos principales

### 1. Main.java
Es la clase principal del programa. Su función es iniciar la aplicación y abrir el menú.

```java
package DynamicMemory;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuFunction();
    }
}
```

### 2. Menu.java
Esta clase se encarga de mostrar un menú interactivo mediante `JOptionPane` y delegar la lógica a la clase `OperationsList`.

#### Opciones disponibles

- Crear lista
- Agregar un elemento
- Eliminar un elemento
- Buscar un elemento
- Ordenar de menor a mayor
- Ordenar de mayor a menor
- Mostrar la lista
- Salir

#### Método principal

```java
public void menuFunction() {
    try {
        while (true) {
            int opc = menu();
            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, operationsList.createList());
                    break;
                case 2:
                    item = operationsList.addElement(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a agregar:")));
                    break;
                case 3:
                    item = operationsList.deleteElement(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar:")));
                    break;
                case 4:
                    int element = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a buscar:"));
                    item = operationsList.searchElement(element);
                    break;
                case 5:
                    operationsList.sortList();
                    break;
                case 6:
                    operationsList.sortListReverse();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, operationsList.showList());
                    break;
                case 8:
                    return;
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor de entrada no aceptado", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
```

### 3. OperationsList.java
Es la clase donde se implementa la lógica de la lista dinámica. Tiene un atributo principal:

```java
public ArrayList<Integer> listDynamic;
```

#### Métodos

##### createList()
Inicializa la lista si aún no existe.

```java
public String createList() {
    if (listDynamic != null) {
        return "La lista ya ha sido creada anteriormente";
    }
    listDynamic = new ArrayList<>();
    return "La lista ha sido creada correctamente";
}
```

##### addElement(int element)
Agrega un dato entero a la lista y retorna el valor insertado.

```java
public int addElement(int element) {
    if (listDynamic != null) {
        listDynamic.add(element);
        return element;
    }
    return 0;
}
```

##### deleteElement(int element)
Elimina el elemento por valor, no por índice. Aquí se usa:

```java
listDynamic.remove(Integer.valueOf(element));
```

Esto es importante, porque `remove(int)` se interpreta como índice, mientras que `remove(Integer)` o `remove(Integer.valueOf(x))` elimina el valor especificado.

```java
public int deleteElement(int element) {
    if (listDynamic != null) {
        if (listDynamic.contains(element)) {
            listDynamic.remove(Integer.valueOf(element));
            return element;
        }
    }
    return 0;
}
```

##### searchElement(int element)
Busca un número dentro de la lista y devuelve su posición (índice).

```java
public int searchElement(int element) {
    if (listDynamic != null) {
        if (listDynamic.contains(element)) {
            return listDynamic.indexOf(element);
        }
    }
    return 0;
}
```

##### sortList()
Ordena la lista de menor a mayor.

```java
public void sortList() {
    if (listDynamic != null) {
        Collections.sort(listDynamic);
    }
}
```

##### sortListReverse()
Ordena la lista de mayor a menor.

```java
public void sortListReverse() {
    if (listDynamic != null) {
        Collections.sort(listDynamic, Collections.reverseOrder());
    }
}
```

##### showList()
Muestra los elementos de la lista en texto.

```java
public String showList() {
    if (listDynamic != null) {
        StringBuilder items = new StringBuilder();
        for (int i : listDynamic) {
            items.append(i).append("\n");
        }
        return items.toString();
    }
    return "La lista esta vacia o no ha sido creada";
}
```

## Cómo funciona la lista dinámica

La lista dinámica usa `ArrayList`, una clase de Java que se encarga de manejar automáticamente el almacenamiento interno. Esto implica que:

- no es necesario definir un tamaño fijo al inicio
- los elementos se guardan en posiciones consecutivas
- se pueden insertar o eliminar elementos sin reescribir toda la estructura
- puede accederse por índice usando `get()` o `indexOf()`

## Flujo del programa

1. El usuario ejecuta `Main`.
2. Se crea una instancia de `Menu`.
3. El menú aparece con las opciones disponibles.
4. Cada opción invoca un método de `OperationsList`.
5. La lista cambia según la operación realizada.
6. El usuario puede repetir acciones hasta elegir salir.

## Requisitos

- Java Development Kit (JDK) instalado
- Sistema operativo compatible con Java
- IDE recomendada: IntelliJ IDEA, Eclipse o VS Code con soporte Java

## Cómo compilar y ejecutar

Desde la raíz del proyecto:

```bash
javac DynamicMemory/*.java
```

Luego ejecutar:

```bash
java -cp . DynamicMemory.Main
```

## Conclusión

La carpeta `DynamicMemory` representa una práctica básica para aprender listas dinámicas en Java. A través de esta aplicación, se puede comprender cómo se manejan estructuras de datos con crecimiento dinámico, cómo se realizan búsquedas, ordenamientos y eliminaciones, y cómo se integra la lógica con una interfaz gráfica simple usando `JOptionPane`.
