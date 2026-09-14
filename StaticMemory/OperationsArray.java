package StaticMemory;

import javax.swing.*;
import java.util.Random;

/**
 * Clase que gestiona las operaciones principales sobre un arreglo (vector) de tamaño estático.
 * Permite crear, eliminar, buscar, ordenar y mostrar los elementos del arreglo.
 */
public class OperationsArray {

    private int[] array;
    private final Random random;

    /**
     * Constructor de la clase. Inicializa el objeto Random utilizado para
     * llenar el arreglo con números aleatorios.
     */
    public OperationsArray(){
        this.random = new Random();
    }

    /**
     * Crea un arreglo solicitando la longitud al usuario mediante un cuadro de diálogo.
     * Llena el arreglo con números aleatorios entre 10 y 99.
     * 
     * @return Un mensaje indicando si el arreglo fue creado correctamente o si ya existía.
     */
    public String createArray(){
        if(array != null){
            return "El vector ya ha sido creado anteriormente";
        }
        int length = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector"));
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt((99 - 10) + 1) + 10;
        }
        return "El vector ha sido creado correctamente";
    }

    /**
     * Busca la primera ocurrencia de un elemento en el arreglo y la reemplaza por 0.
     * Esta acción simula la eliminación lógica del elemento.
     * 
     * @param element El valor del elemento a "eliminar".
     * @return El elemento eliminado, o 0 si no se encontró en el arreglo.
     */
    public int deleteElement(int element){
        JOptionPane.showMessageDialog(null, "Antes \n" + showArray());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                array[i] = 0;
                return element;
            }
        }
        JOptionPane.showMessageDialog(null, "Despues \n" + showArray());
        return 0;
    }

    public int addElement(int element, int index){
        JOptionPane.showMessageDialog(null, "Antes \n" + showArray());
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                array[i] = element;
                return index;
            }
        }
        JOptionPane.showMessageDialog(null, "Despues \n" + showArray());
        return -1;
    }

    /**
     * Busca un elemento dentro del arreglo.
     * 
     * @param element El elemento a buscar.
     * @return El índice de la primera aparición del elemento, o -1 si no se encuentra.
     */
    public int searchElement(int element){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Permite elegir mediante un parametro entero, la forma de ordenamiento de la lista
     * @param opcSort: Opcion de ordenamiento
     */
    public void sortArray(int opcSort){
        if(opcSort == 1){
            sortArrayAsc();
        }else{
            sortArrayDesc();
        }
    }

    /**
     * Ordena el arreglo de menor a mayor utilizando el algoritmo de ordenamiento de burbuja.
     */
    public void sortArrayAsc(){
        JOptionPane.showMessageDialog(null, "Antes \n" + showArray());
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    int item = array[j];
                    array[j] = array[j+1];
                    array[j+1] = item;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Despues \n" + showArray());
    }

    /**
     * Ordena el arreglo de mayor a menor utilizando el algoritmo de ordenamiento de burbuja.
     */
    public void sortArrayDesc(){
        JOptionPane.showMessageDialog(null, "Antes \n" + showArray());
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] < array[j+1]){
                    int item = array[j];
                    array[j] = array[j+1];
                    array[j+1] = item;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Despues \n" + showArray());
    }

    /**
     * Devuelve una representación en forma de cadena (String) de los elementos del arreglo.
     * 
     * @return El contenido del arreglo formateado, por ejemplo "[10, 25, 30]".
     */
    public String showArray(){
        StringBuilder items = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(i == 0){
                items.append("[").append(array[i]).append(", ");
            } else if (i == array.length - 1){
                items.append(array[i]).append("]");
            } else {
                items.append(array[i]).append(", ");
            }
        }
        return items.toString();
    }
}
