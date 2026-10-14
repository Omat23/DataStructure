package LinkedList;

import java.util.Scanner;

/**
 * Aplicación de consola para gestionar y operar una Lista Enlazada Simple de enteros.
 * <p>
 * Al iniciar la ejecución, el programa crea una lista inicial de 5 nodos
 * y presenta un menú interactivo con todas las operaciones requeridas.
 * </p>
 *
 * <p>Este programa fue realizado por los siguientes integrantes:</p>
 * <ul>
 *   <li>Flores Contreras Ariel Roberto</li>
 *   <li>Gonzalez Mendez Omar Gabriel</li>
 *   <li>Pegueros Trinidad Jorge Alexis</li>
 *   <li>Ramirez Pineda Luis Ernesto</li>
 *   <li>Rebolledo Hernandez Jesus Benjamin</li>
 * </ul>
 *
 * @author Flores Contreras Ariel Roberto
 * @author Gonzalez Mendez Omar Gabriel
 * @author Pegueros Trinidad Jorge Alexis
 * @author Ramirez Pineda Luis Ernesto
 * @author Rebolledo Hernandez Jesus Benjamin
 * @version 1.0
 */
public class Main {

    /**
     * Constructor privado para prevenir la instanciación de la clase de aplicación.
     */
    private Main() {
    }

    /**
     * Punto de entrada principal del programa.
     * <p>
     * Inicializa la lista enlazada simple con 5 nodos y procesa las opciones del menú
     * hasta que el usuario decida salir.
     * </p>
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println("======================================================================");
        System.out.println("  ESTRUCTURA DE DATOS: LISTA ENLAZADA SIMPLE CON NODOS (ENTEROS)");
        System.out.println("======================================================================");

        // 1. Crear una lista inicial para almacenar datos de tipo int con 5 nodos
        System.out.println("\n[Paso 1] Creando lista enlazada simple inicial con 5 nodos...");
        ListaEnlazadaSimple lista = ListaEnlazadaSimple.crearListaCon5Nodos(10, 20, 30, 40, 50);
        System.out.println("¡Lista creada exitosamente con 5 nodos iniciales!");
        System.out.print("Estado inicial de la lista: ");
        lista.mostrarLista();

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            while (opcion != 8) {
                mostrarMenu();
                try {
                    System.out.print("Seleccione una opción: ");
                    opcion = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println(">> Error: Debe ingresar un número entero válido.");
                    continue;
                }

                switch (opcion) {
                    case 1:
                        ejecutarAgregarElemento(scanner, lista);
                        break;
                    case 2:
                        ejecutarEliminarElemento(scanner, lista);
                        break;
                    case 3:
                        ejecutarBuscarElemento(scanner, lista);
                        break;
                    case 4:
                        ejecutarLongitudLista(lista);
                        break;
                    case 5:
                        ejecutarListaVacia(lista);
                        break;
                    case 6:
                        System.out.print("\nContenido actual de la lista: ");
                        lista.mostrarLista();
                        break;
                    case 7:
                        ejecutarReinicializarCon5Nodos(scanner, lista);
                        break;
                    case 8:
                        System.out.println("\nSaliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println(">> Opción no válida. Por favor, seleccione una opción entre 1 y 8.");
                        break;
                }
            }
        }
    }

    /**
     * Despliega en pantalla el menú interactivo con las opciones disponibles.
     */
    private static void mostrarMenu() {
        System.out.println("\n**************************************************");
        System.out.println("        MENÚ - OPERACIONES DE LISTA ENLAZADA      ");
        System.out.println("**************************************************");
        System.out.println("1.- Agregar elemento en la posición n.");
        System.out.println("2.- Eliminar nodo en la posición n (devolver valor).");
        System.out.println("3.- Buscar elemento (obtener posición).");
        System.out.println("4.- Consultar longitud de la lista (longitudLista).");
        System.out.println("5.- Verificar si la lista está vacía (listaVacia).");
        System.out.println("6.- Mostrar lista en pantalla.");
        System.out.println("7.- Reinicializar lista con 5 nodos.");
        System.out.println("8.- Salir del programa.");
        System.out.println("**************************************************");
    }

    /**
     * Solicita datos al usuario y ejecuta la operación de agregar un elemento en la posición {@code n}.
     *
     * @param scanner Objeto {@link Scanner} para lectura de datos por consola.
     * @param lista   Instancia de {@link ListaEnlazadaSimple} en la que se insertará el elemento.
     */
    private static void ejecutarAgregarElemento(Scanner scanner, ListaEnlazadaSimple lista) {
        try {
            System.out.print("Ingrese el valor entero a agregar: ");
            int elemento = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Ingrese la posición deseada (1 a " + (lista.longitudLista() + 1) + "): ");
            int posicion = Integer.parseInt(scanner.nextLine().trim());

            lista.agregarElemento(elemento, posicion);
            System.out.println(">> ¡Elemento " + elemento + " agregado correctamente en la posición " + posicion + "!");
            System.out.print("Lista actualizada: ");
            lista.mostrarLista();
        } catch (NumberFormatException e) {
            System.out.println(">> Error: Entrada numérica inválida. Debe ingresar valores enteros.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(">> " + e.getMessage());
        }
    }

    /**
     * Solicita la posición al usuario y ejecuta la eliminación del nodo en dicha posición,
     * mostrando el elemento devuelto antes de su eliminación.
     *
     * @param scanner Objeto {@link Scanner} para lectura de datos por consola.
     * @param lista   Instancia de {@link ListaEnlazadaSimple} de la que se eliminará el nodo.
     */
    private static void ejecutarEliminarElemento(Scanner scanner, ListaEnlazadaSimple lista) {
        if (lista.listaVacia()) {
            System.out.println(">> La lista está vacía. No hay elementos para eliminar.");
            return;
        }

        try {
            System.out.print("Ingrese la posición del nodo a eliminar (1 a " + lista.longitudLista() + "): ");
            int posicion = Integer.parseInt(scanner.nextLine().trim());

            int elementoEliminado = lista.eliminarElemento(posicion);
            System.out.println(">> Elemento devuelto antes de eliminar: " + elementoEliminado);
            System.out.println(">> El nodo en la posición " + posicion + " ha sido eliminado exitosamente.");
            System.out.print("Lista actualizada: ");
            lista.mostrarLista();
        } catch (NumberFormatException e) {
            System.out.println(">> Error: Entrada numérica inválida. Debe ingresar un valor entero.");
        } catch (IndexOutOfBoundsException | IllegalStateException e) {
            System.out.println(">> " + e.getMessage());
        }
    }

    /**
     * Solicita un elemento al usuario y realiza la búsqueda en la lista,
     * informando la posición devuelta.
     *
     * @param scanner Objeto {@link Scanner} para lectura de datos por consola.
     * @param lista   Instancia de {@link ListaEnlazadaSimple} donde se buscará el elemento.
     */
    private static void ejecutarBuscarElemento(Scanner scanner, ListaEnlazadaSimple lista) {
        if (lista.listaVacia()) {
            System.out.println(">> La lista está vacía. No contiene elementos para buscar.");
            return;
        }

        try {
            System.out.print("Ingrese el elemento entero a buscar: ");
            int elemento = Integer.parseInt(scanner.nextLine().trim());

            int posicion = lista.buscarElemento(elemento);
            if (posicion != -1) {
                System.out.println(">> ¡Elemento " + elemento + " encontrado en la posición: " + posicion + "!");
            } else {
                System.out.println(">> El elemento " + elemento + " no se encuentra en la lista (resultado: -1).");
            }
        } catch (NumberFormatException e) {
            System.out.println(">> Error: Entrada numérica inválida. Debe ingresar un valor entero.");
        }
    }

    /**
     * Consulta y muestra la cantidad de elementos contenidos en la lista.
     *
     * @param lista Instancia de {@link ListaEnlazadaSimple} a evaluar.
     */
    private static void ejecutarLongitudLista(ListaEnlazadaSimple lista) {
        int longitud = lista.longitudLista();
        System.out.println(">> Cantidad de elementos en la lista (longitudLista): " + longitud);
    }

    /**
     * Verifica y muestra en pantalla si la lista está vacía o contiene elementos.
     *
     * @param lista Instancia de {@link ListaEnlazadaSimple} a evaluar.
     */
    private static void ejecutarListaVacia(ListaEnlazadaSimple lista) {
        boolean estaVacia = lista.listaVacia();
        if (estaVacia) {
            System.out.println(">> listaVacia() = true. La lista se encuentra actualmente VACÍA.");
        } else {
            System.out.println(">> listaVacia() = false. La lista NO está vacía (contiene " + lista.longitudLista() + " elemento(s)).");
        }
    }

    /**
     * Permite al usuario restablecer la lista ingresando 5 valores o asignando valores por defecto.
     *
     * @param scanner Objeto {@link Scanner} para lectura de datos por consola.
     * @param lista   Instancia de {@link ListaEnlazadaSimple} a reiniciar.
     */
    private static void ejecutarReinicializarCon5Nodos(Scanner scanner, ListaEnlazadaSimple lista) {
        System.out.println("\nSeleccione cómo desea inicializar los 5 nodos:");
        System.out.println("1.- Con valores predeterminados (10, 20, 30, 40, 50).");
        System.out.println("2.- Ingresar 5 valores personalizados.");
        System.out.print("Opción: ");

        try {
            int opc = Integer.parseInt(scanner.nextLine().trim());
            if (opc == 1) {
                lista.inicializarCon5Nodos(10, 20, 30, 40, 50);
                System.out.println(">> Lista reinicializada con 5 nodos predeterminados.");
            } else if (opc == 2) {
                int[] valores = new int[5];
                for (int i = 0; i < 5; i++) {
                    System.out.print("Ingrese valor para el nodo " + (i + 1) + ": ");
                    valores[i] = Integer.parseInt(scanner.nextLine().trim());
                }
                lista.inicializarCon5Nodos(valores[0], valores[1], valores[2], valores[3], valores[4]);
                System.out.println(">> Lista reinicializada con los 5 nodos personalizados.");
            } else {
                System.out.println(">> Opción inválida. Operación cancelada.");
                return;
            }
            System.out.print("Nueva lista: ");
            lista.mostrarLista();
        } catch (NumberFormatException e) {
            System.out.println(">> Error: Entrada numérica inválida.");
        }
    }
}
