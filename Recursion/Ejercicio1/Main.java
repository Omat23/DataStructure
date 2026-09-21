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
