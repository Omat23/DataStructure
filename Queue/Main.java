package Queue;

import java.util.Scanner;

/**
 * Clase principal que contiene el menú y ejecuta las operaciones de la cola.
 * 
 * Este programa fue realizado por los siguientes integrantes:
 *  * Flores Contreras Ariel Roberto
 *  * Gonzalez Mendez Omar Gabriel
 *  * Pegueros Trinidad Jorge Alexis
 *  * Ramirez Pineda Luis Ernesto
 *  * Rebolledo Hernandez Jesus Benjamin.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        StaticQueue queue = new StaticQueue();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n***** Operaciones con cola ******");
            System.out.println("************ - Menú - ************");
            System.out.println("* 1.- Insertar elemento.");
            System.out.println("* 2.- Recuperar elemento.");
            System.out.println("* 3.- Vaciar cola.");
            System.out.println("* 4.- Mostrar cola en la pantalla.");
            System.out.println("* 7.- Salir del programa.");
            System.out.print("* ---- Seleccione una opción: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Ingrese el número entero a insertar: ");
                    try {
                        int value = Integer.parseInt(scanner.nextLine());
                        queue.push(value);
                        System.out.println("Elemento insertado correctamente.");
                        queue.printQueue();
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Debe ser un número entero.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        int recoveredValue = queue.pop();
                        System.out.println("\nElemento recuperado: " + recoveredValue);
                        queue.printQueue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    queue.clear();
                    System.out.println("La cola ha sido vaciada.");
                    break;
                case 4:
                    queue.printQueue();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 7);
        
        scanner.close();
    }
}
