package StaticMemory;

import javax.swing.*;

/**
 * Clase que representa la interfaz de usuario basada en menús interactivos.
 * Se encarga de mostrar las opciones al usuario y coordinar las acciones
 * sobre el arreglo mediante la clase OperationsArray.
 */
public class Menu {

    // Atributo de la clase Menu que instancia la clase OperationsArray para acceder a sus métodos
    private final OperationsArray operationsArray;

    /**
     * Constructor de la clase Menu.
     * Inicializa la instancia de OperationsArray.
     */
    public Menu() {
        this.operationsArray = new OperationsArray();
    }

    /**
     * Método encargado de mostrar el menú de opciones de la lista dinámica al usuario.
     * @return El número entero correspondiente a la opción seleccionada.
     * @throws NumberFormatException Si el usuario ingresa un valor que no es numérico o cancela.
     */
    private int menu() throws NumberFormatException{
        // Muestra un cuadro de diálogo con las opciones y lee el valor introducido por el usuario
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "************ - Menú - ************\n" +
                        "* 1.- Crear lista.\n" +
                        "* 2.- Eliminar un elemento.\n" +
                        "* 3.- Agregar un elemento. \n" +
                        "* 4.- Buscar un elemento.\n" +
                        "* 5.- Ordenar lista.\n" +
                        "* 6.- Mostrar en la pantalla la lista.\n" +
                        "* 7.- Salir del programa.\n" +
                        "* ---- Seleccione una opción:"));
    }

    /**
     * Método encargado de ejecutar el ciclo principal del menú y llamar a las funciones correspondientes.
     */
    public void menuFunction(){
        try{
            // Bucle infinito para mantener el menú mostrándose hasta que el usuario decida salir
            while(true){
                int item;
                // Se invoca el método menu() para obtener la opción deseada
                int opc = menu();
                // Estructura de control que evalúa la opción elegida
                switch (opc){
                    case 1:
                        // Llama al método para crear la lista y muestra el resultado
                        JOptionPane.showMessageDialog(null, operationsArray.createArray());
                        break;
                    case 2:
                        // Pide un número al usuario y lo elimina de la lista
                        item = operationsArray.deleteElement(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar:")));
                        // Muestra un mensaje de éxito o fracaso según el valor retornado
                        JOptionPane.showMessageDialog(null, (item != 0) ? "Elemento " + item + " eliminado correctamente."
                                : "No se pudo eliminar el elemento.");
                        break;
                    case 3:
                        //Pide el elemento que se desea agregar
                        item = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a agregar:"));
                        int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posición donde desea agregar el elemento:"));
                        //Agrega el elemento reemplazando el valor de la posicion donde quiere modificar el elemento por el nuevo valor.
                        index = operationsArray.addElement(item, index);
                        JOptionPane.showMessageDialog(null, (index != -1) ? "Elemento " + item + " agregado correctamente en la posicion " + index
                                : "No se pudo agregar el elemento.");
                        break;
                    case 4:
                        // Pide el elemento que se desea buscar en la lista
                        item = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a buscar:"));
                        // Busca el elemento y devuelve su posición (o 0 si no se encuentra/falla)
                        item = operationsArray.searchElement(item);
                        JOptionPane.showMessageDialog(null, (item != -1) ? "Elemento " + item + " encontrado correctamente en la posicion " + item + "."
                                : "Elemento no encontrado.");
                        break;
                    case 5:
                        // Ordena la lista
                        item = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el orden deseado (1-Ascendente, 2-Descendente):"));
                        operationsArray.sortArray(item);
                        break;
                    case 6:
                        // Muestra el contenido actual de la lista
                        JOptionPane.showMessageDialog(null, operationsArray.showArray());
                        break;
                    case 7:
                        // Termina la ejecución del método, cerrando el programa
                        return;
                }
            }
        }catch (NumberFormatException numberFormatException){
            // Captura la excepción cuando se introduce texto en lugar de números o se cancela el diálogo
            JOptionPane.showMessageDialog(null, "Valor de entrada no aceptado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
