/*
 * Este programa fue realizado por los siguientes integrantes:
 * Flores Contreras Ariel Roberto
 * Gonzalez Mendez Omar Gabriel
 * Pegueros Trinidad Jorge Alexis
 * Ramirez Pineda Luis Ernesto
 * Rebolledo Hernandez Jesus Benjamin
 *
 * INSTRUCCIONES:
 * En equipos de trabajo colaborativo realizar un programa en Java que implemente y manipule un vector (arreglo unidimensional de números enteros) y entregar el programa. (Para este programa SOLO USE arreglos normales y no use la clase ArrayList de Java). El programa deberá mostrar el siguiente menú de opciones:

    ************ - Menú - ************
    * 1.- Crear vector.
    * 2.- Eliminar un elemento.
    * 3.- Insertar un elemento.
    * 4.- Buscar un elemento.
    * 5.- Ordenar el vector.
    * 6. - Mostrar en la pantalla el vector.
    * 7.- Salir del programa.
    * ---- Seleccione una opción:
    La opción "* 1.- Crear vector" deberá crearlo en tiempo de ejecución con números pseudoaleatorios por lo que deberá preguntar al usuario el tamaño que tendrá el vector antes de crearlo, deberá llenarlo con números aleatorios del 10 al 99 luego deberá mostrar en pantalla el arreglo lleno.
    La opción "* 2.- Eliminar un elemento" deberá pedir la posición del elemento a eliminar el cual simplemente será sustituido por el valor cero.
    La opción "* 3.- Insertar un elemento" deberá pedir la posición dentro del arreglo donde será insertado, este nuevo elemento sustituirá al elemento que se encuentre en esa posición.
    La opción "* 4.- Buscar un elemento" deberá pedir el valor del elemento a buscar y el programa deberá indicar si el elemento fué encontrado o no dentro del vector, si lo encontró deberá mostrar la posición donde lo encontró.
    Las opciones de "* 4.- Buscar un elemento" y "* 5.- Ordenar el vector" deberán informar el tiempo que tardo el proceso.
    "* 5.- Ordenar el vector" permitirá al usuario elegir si se quiere hacer una ordenación ascendente o descendente.

    Puedes usar el algoritmo de la burbuja para ordenar el arreglo.
    Siempre que el vector sea modificado deberá mostrarse antes y después del cambio.
    El programa deberá estar validado y mandar al usuario del programa los mensajes correspondiente para evitar cualquier tipo de error, por ejemplo que se quiera eliminar un elemento que no existe u ordenar el vector sin aún haberlo creado (vector vacio).
 */

package StaticMemory;

/**
 * Clase principal que inicializa y ejecuta la aplicación de lista dinámica.
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Crea una instancia del menú y lo muestra al usuario.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.menuFunction();

    }
}
