/**
 * Este programa fue realizado por los siguientes integrantes:
 * Flores Contreras Ariel Roberto
 * Gonzalez Mendez Omar Gabriel
 * Pegueros Trinidad Jorge Alexis
 * Ramirez Pineda Luis Ernesto
 * Rebolledo Hernandez Jesus Benjamin
 *
 * INSTRUCCIONES:
 * En equipos de trabajo colaborativo realizar un programa en Java que implemente y manipule una lista con números enteros (clase ArrayList) y entregar el programa. El programa deberá mostrar el siguiente menú de opciones:
 *
 * ************ - Menú - ************
 * * 1.- Crear lista.
 * * 2.- Agregar un elemento.
 * * 3.- Eliminar un elemento.
 * * 4.- Buscar un elemento.
 * * 5.- Ordenar lista.
 * * 6.- Mostrar en la pantalla la lista.
 * * 7.- Salir del programa.
 * * ---- Seleccione una opción:
 *
 * La opción "* 1.- Crear lista" deberá crear la lista con 10 elementos (numeros enteros pseudoaleatorios), luego deberá mostrar en pantalla la lista.
 * La opción "* 2.- Eliminar un elemento" deberá permitir al usuario elegir si desea eliminar el elemento por su valor o por su posición.
 * La opción "* 3.- Agregar un elemento" deberá permitir al usuario elegir si desea insertar el nuevo elemento al inicio o al final de la lista.
 * Las opciones de "* 4.- Buscar un elemento" y "* 5.- Ordenar la lista" deberán informar el tiempo que tardo el proceso.
 * La opción "* 5.- Ordenar la lista" permitirá al usuario elegir si se quiere hacer una ordenación ascendente o descendente. Puedes usar el algoritmo de la burbuja para ordenar la lista.
 * Siempre que la lista sea modificada deberá mostrarse antes y después del cambio.
 * El programa deberá estar validado y mandar al usuario del programa los mensajes correspondiente para evitar cualquier tipo de error, por ejemplo que se quiera eliminar un elemento que no existe u ordenar la lista sin aún haberlo creado (lista vacia).
 */

package DynamicMemory;

/**
 * Clase principal que inicializa y ejecuta el programa.
 */
public class Main {

    /**
     * Método principal que arranca la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Se crea una instancia de la clase Menu
        Menu menu = new Menu();
        // Se ejecuta la función principal del menú que controla el flujo del programa
        menu.menuFunction();

    }

}
