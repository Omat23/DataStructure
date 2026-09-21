package Recursion.Ejercicio5;

public class Main {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        
        long resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }

    /**
     * Subprograma recursivo para elevar un número base a un exponente.
     * @param base El número base.
     * @param exponente La potencia a la cual elevar el número base (se asume entero >= 0).
     * @return El resultado de base^exponente.
     */
    public static long potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a la 0 es 1.
        if (exponente == 0) {
            return 1;
        }

        // Paso recursivo:
        // base^exponente es lo mismo que decir: base * base^(exponente - 1)
        return base * potencia(base, exponente - 1);
    }
}
