package Stack;

import java.util.Scanner;

/**
 * Aplicación de consola para operar una pila estática de enteros.
 *
 * <p>Este programa fue realizado por los siguientes integrantes:</p>
 *
 * <ul>
 *   <li>Flores Contreras Ariel Roberto</li>
 *   <li>Gonzalez Mendez Omar Gabriel</li>
 *   <li>Pegueros Trinidad Jorge Alexis</li>
 *   <li>Ramirez Pineda Luis Ernesto</li>
 *   <li>Rebolledo Hernandez Jesus Benjamin.</li>
 * </ul>
 */
public class Main {

    /**
     * Evita crear instancias de la clase de aplicación.
     */
    private Main() {
    }

    /**
     * Inicia el menú y procesa las opciones hasta que el usuario elija salir.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        StaticStack stack = new StaticStack();

        try (Scanner scanner = new Scanner(System.in)) {
            int option = 0;
            while (option != 7) {
                printMenu();
                try {
                    option = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException exception) {
                    System.out.println("Por favor, ingrese una opción numérica válida.");
                    continue;
                }

                switch (option) {
                    case 1:
                        insertElement(scanner, stack);
                        break;
                    case 2:
                        retrieveElement(stack);
                        break;
                    case 3:
                        stack.clear();
                        System.out.println("La pila ha sido vaciada.");
                        break;
                    case 4:
                        stack.printStack();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }

    /**
     * Muestra las operaciones disponibles.
     */
    private static void printMenu() {
        System.out.println("\n***** Operaciones con pila ******");
        System.out.println("************ - Menú - ************");
        System.out.println("* 1.- Insertar elemento.");
        System.out.println("* 2.- Recuperar elemento.");
        System.out.println("* 3.- Vaciar pila.");
        System.out.println("* 4.- Mostrar pila en la pantalla.");
        System.out.println("* 7.- Salir del programa.");
        System.out.print("* ---- Seleccione una opción: ");
    }

    /**
     * Solicita un entero, lo apila y muestra el contenido actualizado.
     *
     * @param scanner lector de la entrada del usuario
     * @param stack pila que recibirá el elemento
     */
    private static void insertElement(Scanner scanner, StaticStack stack) {
        System.out.print("Ingrese el número entero a insertar: ");
        try {
            int value = Integer.parseInt(scanner.nextLine().trim());
            stack.push(value);
            System.out.println("Elemento insertado correctamente.");
            stack.printStack();
        } catch (NumberFormatException exception) {
            System.out.println("Entrada inválida. Debe ser un número entero.");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * Desapila y muestra la cima; informa el estado resultante de la pila.
     *
     * @param stack pila de la que se recuperará el elemento
     */
    private static void retrieveElement(StaticStack stack) {
        try {
            int value = stack.pop();
            System.out.println("\nElemento recuperado: " + value);
            stack.printStack();
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
