/*
 * Este programa fue realizado por los siguientes integrantes:
 *  * Flores Contreras Ariel Roberto
 *  * Gonzalez Mendez Omar Gabriel
 *  * Pegueros Trinidad Jorge Alexis
 *  * Ramirez Pineda Luis Ernesto
 *  * Rebolledo Hernandez Jesus Benjamin
 *
 * Instrucciones:
 * 6. Inversión de capital. Se ha depositado en una institución bancaria un monto
 * de capital m por el cual se recibe un x% de interés mensual. El problema
 * consiste en determinar el capital que se tendrá al cabo de n meses. Escriba
 * un subprograma recursivo que resuelva este problema. Recuerde que debe
 * establecer el estado básico recursivo del problema. 15 puntos.
 */
package Recursion.Ejercicio6;

public class Main {

    public static void main(String[] args) {
        double m = 1000.0; // Capital inicial
        double x = 5.0;    // Interés mensual (5%)
        int n = 3;         // Meses

        double capitalFinal = calcularCapital(m, x, n);
        System.out.printf("El capital final al cabo de %d meses será: %.2f\n", n, capitalFinal);
    }

    /**
     * Subprograma recursivo para determinar el capital acumulado.
     * @param m Capital inicial.
     * @param x Porcentaje de interés mensual (ej. 5.0 para 5%).
     * @param n Número de meses.
     * @return El capital acumulado al cabo de n meses.
     */
    public static double calcularCapital(double m, double x, int n) {
        // Caso base (estado básico recursivo): 
        // Si no ha transcurrido ningún mes (n == 0), el capital es simplemente el inicial.
        if (n == 0) {
            return m;
        }

        // Paso recursivo:
        // Calculamos el capital del mes anterior recursivamente,
        // y a este resultado le sumamos el interés generado en ese mes.
        // Capital actual = Capital mes anterior + (Capital mes anterior * (interés / 100))
        double capitalMesAnterior = calcularCapital(m, x, n - 1);
        double interesGenerado = capitalMesAnterior * (x / 100.0);
        
        return capitalMesAnterior + interesGenerado;
    }
}

