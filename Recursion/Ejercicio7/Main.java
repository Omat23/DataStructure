package Recursion.Ejercicio7;

public class Main {

    public static void main(String[] args) {
        int numero1 = 101010;
        int numero2 = 102010;

        System.out.println("¿El número " + numero1 + " es binario? " + esBinario(numero1));
        System.out.println("¿El número " + numero2 + " es binario? " + esBinario(numero2));
    }

    /**
     * Subprograma recursivo que comprueba si un número entero está formado solo por 0s y 1s.
     * @param n El número a comprobar.
     * @return true si es binario (solo contiene 0s y 1s), false en caso contrario.
     */
    public static boolean esBinario(int n) {
        // Trabajamos con el valor absoluto en caso de que sea negativo
        n = Math.abs(n);

        // Caso base: Si el número es 0 o 1, al ser de un solo dígito sabemos que es binario.
        if (n == 0 || n == 1) {
            return true;
        }

        // Extraemos el último dígito
        int ultimoDigito = n % 10;

        // Si el último dígito no es ni 0 ni 1, entonces no es binario (Caso base de fallo).
        if (ultimoDigito != 0 && ultimoDigito != 1) {
            return false;
        }

        // Paso recursivo:
        // Si el último dígito es válido (0 o 1), verificamos el resto del número
        // eliminando el último dígito (n / 10).
        return esBinario(n / 10);
    }
}
