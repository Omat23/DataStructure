package DynamicMemory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase encargada de manejar las operaciones sobre una lista dinámica (ArrayList).
 */
public class OperationsList {

    // Lista dinámica que almacenará números enteros
    public ArrayList<Integer> listDynamic;

    /**
     * Método encargado de crear e inicializar una lista dinámica.
     * @return Un mensaje indicando si la lista fue creada o si ya existía.
     */
    public String createList() {
        // Verifica si la lista ya ha sido inicializada previamente
        if(isCreateList()){
            return "La lista ya ha sido creada anteriormente";
        }
        // Inicializa la lista dinámica
        listDynamic = new ArrayList<>();
        return "La lista ha sido creada correctamente";
    }

    public boolean isCreateList(){
        return (listDynamic != null);
    }

    /**
     * Método encargado de agregar elementos a la lista.
     * @param element El número entero que se desea agregar.
     * @return El elemento agregado si la lista existe, de lo contrario retorna 0.
     */
    public int addElement(int element){
        // Verifica que la lista exista antes de intentar agregar un elemento
        if(listDynamic != null){
            listDynamic.add(element); // Agrega el elemento al final de la lista
            return element;
        }
        return 0; // Retorna 0 si la lista no ha sido creada
    }

    /**
     * Método encargado de eliminar elementos de la lista.
     * @param element El número entero que se desea eliminar.
     * @return El elemento eliminado si se encontró y borró con éxito, de lo contrario retorna 0.
     */
    public int deleteElement(int element){
        // Verifica que la lista exista
        if(listDynamic != null){
            // Comprueba si el elemento a eliminar realmente existe en la lista
            if (listDynamic.contains(element)){
                // Elimina el elemento de la lista usando su valor (Integer.valueOf)
                listDynamic.remove(Integer.valueOf(element));
                return element;
            }
        }
        return 0; // Retorna 0 si la lista no existe o no contiene el elemento
    }

    /**
     * Método encargado de buscar elementos en la lista.
     * @param element El número entero a buscar.
     * @return El índice (posición) del elemento si se encuentra, o 0 en caso contrario.
     */
    public int searchElement(int element){
        // Verifica que la lista exista
        if(listDynamic != null){
            // Comprueba si el elemento está en la lista
            if (listDynamic.contains(element)){
                // Devuelve el índice de la primera ocurrencia del elemento
                return listDynamic.indexOf(element);
            }
        }
        return 0; // Retorna 0 si no se encuentra el elemento o la lista no existe
    }

    public void sortList(int opc){
        if(opc == 1){
            sortListAsc();
        }else if(opc == 2){
            sortListDesc();
        }else{
            JOptionPane.showMessageDialog(null, "Opcion de ordenamiento no valida");
        }
    }

    /**
     * Método encargado de ordenar los elementos de la lista de menor a mayor.
     */
    public void sortListAsc(){
        JOptionPane.showMessageDialog(null, "Antes \n" + showList());
        // Verifica que la lista exista antes de intentar ordenarla
        if (listDynamic != null){
            // Utiliza Collections.sort para ordenar de forma ascendente
            Collections.sort(listDynamic);
        }
        JOptionPane.showMessageDialog(null, "Despues \n" + showList());
    }

    /**
     * Método encargado de ordenar los elementos de la lista de mayor a menor.
     */
    public void sortListDesc(){
        JOptionPane.showMessageDialog(null, "Antes \n" + showList());
        // Verifica que la lista exista antes de intentar ordenarla
        if(listDynamic != null){
            // Utiliza Collections.sort con un comparador en reverso para ordenar de forma descendente
            Collections.sort(listDynamic, Collections.reverseOrder());
        }
        JOptionPane.showMessageDialog(null, "Despues \n" + showList());
    }

    /**
     * Método encargado de preparar un texto con los elementos de la lista para mostrarlos.
     * @return Una cadena de texto con los elementos de la lista o un mensaje si está vacía o no creada.
     */
    public String showList() {
        // Verifica que la lista exista
        if (listDynamic != null) {
            StringBuilder items = new StringBuilder();
            // Itera sobre cada elemento de la lista y lo agrega al texto final
            for (int i = 0; i < listDynamic.size(); i++) {
                if (i == 0){
                    items.append("[").append(listDynamic.get(i)).append(", ");
                }else if(i == listDynamic.size() - 1){
                    items.append("[").append(listDynamic.get(i)).append("]");
                }else{
                    items.append(listDynamic.get(i)).append(", ");
                }
            }
            // Retorna la representación en texto de todos los elementos
            return (items.isEmpty()) ? "La lista esta vacia" : items.toString();
        }
        // Mensaje por defecto si la lista es nula
        return "La lista no ha sido creada";
    }

}
