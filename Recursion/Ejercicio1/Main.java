/*
 * Este programa fue realizado por los siguientes integrantes:
 *  * Flores Contreras Ariel Roberto
 *  * Gonzalez Mendez Omar Gabriel
 *  * Pegueros Trinidad Jorge Alexis
 *  * Ramirez Pineda Luis Ernesto
 *  * Rebolledo Hernandez Jesus Benjamin
 *
 * Instrucciones:
 * 1. Escriba un subprograma recursivo que invierta el orden de los elementos de un
 * arreglo de N números enteros. Es decir, que el elemento que está en la posición 1 se
 * intercambie con el que está en la posición N, el de la posición 2, con el de la N - 1
 * y así sucesivamente. 15 puntos.
 */
package Recursion.Ejercicio1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        // Llamamos al método recursivo
        invertirArreglo(arr, 0, arr.length - 1);
        
        System.out.println("Arreglo invertido: " + Arrays.toString(arr));
    }

    /**
     * Subprograma recursivo que invierte el orden de los elementos de un arreglo.
     * @param arr El arreglo a invertir.
     * @param inicio Índice de inicio (empieza en 0).
     * @param fin Índice de fin (empieza en arr.length - 1).
     */
    public static void invertirArreglo(int[] arr, int inicio, int fin) {
        // Caso base: si el índice de inicio es mayor o igual al de fin, 
        // significa que ya cruzamos la mitad del arreglo y hemos terminado de invertir.
        if (inicio >= fin) {
            return;
        }

        // Paso recursivo: intercambiamos el elemento en 'inicio' con el de 'fin'
        int temp = arr[inicio];
        arr[inicio] = arr[fin];
        arr[fin] = temp;

        // Llamada recursiva acercando los índices hacia el centro del arreglo
        invertirArreglo(arr, inicio + 1, fin - 1);
    }
}

