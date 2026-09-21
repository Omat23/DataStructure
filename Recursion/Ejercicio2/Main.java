package Recursion.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        String original = "ROMA";
        System.out.println("Cadena original: " + original);
        
        String invertida = invertirCadena(original);
        System.out.println("Cadena invertida: " + invertida);
    }

    /**
     * Subprograma recursivo que invierte una cadena de caracteres.
     * @param str La cadena a invertir.
     * @return La cadena invertida.
     */
    public static String invertirCadena(String str) {
        // Caso base: si la cadena es nula, está vacía o tiene un solo carácter, 
        // ya está invertida (o no se puede invertir más).
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Paso recursivo: tomamos el último carácter de la cadena
        // y lo concatenamos con la inversión del resto de la cadena.
        // str.substring(0, str.length() - 1) obtiene la cadena sin el último carácter.
        return str.charAt(str.length() - 1) + invertirCadena(str.substring(0, str.length() - 1));
    }
}
