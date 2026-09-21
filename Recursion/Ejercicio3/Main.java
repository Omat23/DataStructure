package Recursion.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Imprimiendo arreglo de derecha a izquierda:");
        
        // Llamada al método pasándole el arreglo y el índice del último elemento
        imprimirReversa(arr, arr.length - 1);
    }

    /**
     * Subprograma recursivo que imprime los elementos de un arreglo de derecha a izquierda.
     * @param arr El arreglo que contiene los datos.
     * @param index El índice actual a imprimir (debe empezar en arr.length - 1).
     */
    public static void imprimirReversa(int[] arr, int index) {
        // Caso base: si el índice es menor a 0, ya imprimimos todos los elementos y terminamos.
        if (index < 0) {
            return;
        }

        // Paso recursivo:
        // 1. Imprimimos el elemento en la posición actual
        System.out.print(arr[index] + " ");
        
        // 2. Llamamos recursivamente al método restando 1 al índice 
        //    para movernos hacia la izquierda en el arreglo.
        imprimirReversa(arr, index - 1);
    }
}
