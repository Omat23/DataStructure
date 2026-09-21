/*
 * Este programa fue realizado por los siguientes integrantes:
 *  * Flores Contreras Ariel Roberto
 *  * Gonzalez Mendez Omar Gabriel
 *  * Pegueros Trinidad Jorge Alexis
 *  * Ramirez Pineda Luis Ernesto
 *  * Rebolledo Hernandez Jesus Benjamin
 *
 * Instrucciones:
 * 4. Crea un subprograma recursivo que obtenga la cantidad de dígitos de un
 * número N. Se debe pasar como parámetro el número N. 15 puntos.
 */
package Recursion.Ejercicio4;

public class Main {

    public static void main(String[] args) {
        int numero = 12345;
        
        int cantidad = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidad + " dígitos.");
    }

    /**
     * Subprograma recursivo para obtener la cantidad de dígitos de un número N.
     * @param n El número a evaluar.
     * @return La cantidad de dígitos del número.
     */
    public static int contarDigitos(int n) {
        // Trabajamos con el valor absoluto en caso de que n sea negativo.
        n = Math.abs(n);
        
        // Caso base: si el número es menor a 10 (es decir, entre 0 y 9),
        // sabemos que tiene exactamente 1 dígito.
        if (n < 10) {
            return 1;
        }

        // Paso recursivo:
        // Contamos 1 (por el último dígito) y llamamos recursivamente
        // a la función pasándole el número dividido por 10 (le quitamos el último dígito).
        return 1 + contarDigitos(n / 10);
    }
}

