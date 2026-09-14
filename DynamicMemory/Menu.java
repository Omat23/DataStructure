package DynamicMemory;

import javax.swing.*;

public class Menu {

    // Atributo de la clase Menu que instancia la clase OperationsList para acceder a sus métodos
    private final OperationsList operationsList;

    /**
     * Constructor de la clase Menu.
     * Inicializa la instancia de OperationsList.
     */
    public Menu() {
        this.operationsList = new OperationsList();
    }

    /**
     * Método encargado de mostrar el menú de opciones de la lista dinámica al usuario.
     * @return El número entero correspondiente a la opción seleccionada.
     * @throws NumberFormatException Si el usuario ingresa un valor que no es numérico o cancela.
     */
    public int menu() throws NumberFormatException{
        // Muestra un cuadro de diálogo con las opciones y lee el valor introducido por el usuario
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "************ - Menú - ************\n" +
                "* 1.- Crear lista.\n" +
                "* 2.- Agregar un elemento.\n" +
                "* 3.- Eliminar un elemento.\n" +
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
                       JOptionPane.showMessageDialog(null, operationsList.createList());
                       break;
                   case 2:
                       // Pide un número al usuario y lo agrega a la lista
                       item = operationsList.addElement( Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a agregar:")));
                       // Muestra un mensaje de éxito o fracaso según el valor retornado
                       JOptionPane.showMessageDialog(null, (item != 0) ? "Elemento " + item + " agregado correctamente."
                               : "No se pudo agregar el elemento.");
                       break;
                   case 3:
                       // Pide un número al usuario y lo elimina de la lista
                       item = operationsList.deleteElement(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar:")));
                       // Muestra un mensaje de éxito o fracaso según el valor retornado
                       JOptionPane.showMessageDialog(null, (item != 0) ? "Elemento " + item + " eliminado correctamente."
                               : "No se pudo eliminar el elemento.");
                       break;
                   case 4:
                       // Pide el elemento que se desea buscar en la lista
                       int element = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a buscar:"));
                       // Busca el elemento y devuelve su posición (o 0 si no se encuentra/falla)
                       item = operationsList.searchElement(element);
                       JOptionPane.showMessageDialog(null, (item != 0) ? "Elemento " + element + " encontrado correctamente en la posicion " + item + "."
                               : "Elemento no encontrado.");
                       break;
                   case 5:
                       if(operationsList.isCreateList()){
                           // Ordena la lista
                           item = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el orden deseado (1-Ascendente, 2-Descendente):"));
                           operationsList.sortList(item);
                       }else{
                           JOptionPane.showMessageDialog(null, "La lista no ha sido creada.");
                       }
                       break;
                   case 6:
                       // Muestra el contenido actual de la lista
                       JOptionPane.showMessageDialog(null, operationsList.showList());
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
