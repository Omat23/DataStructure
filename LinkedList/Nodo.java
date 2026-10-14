package LinkedList;

/**
 * Representa un nodo en una lista enlazada simple para almacenar números enteros.
 * <p>
 * Cada nodo contiene un valor de tipo {@code int} y una referencia (enlace)
 * hacia el siguiente nodo de la estructura.
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
public class Nodo {

    /** Dato entero almacenado en el nodo. */
    private int dato;

    /** Referencia hacia el siguiente nodo en la lista enlazada. */
    private Nodo siguiente;

    /**
     * Constructor que crea un nodo con el valor indicado y sin enlace al siguiente nodo.
     *
     * @param dato El número entero que contendrá el nodo.
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Constructor que crea un nodo con el valor indicado y una referencia al siguiente nodo.
     *
     * @param dato El número entero que contendrá el nodo.
     * @param siguiente La referencia al siguiente {@link Nodo}.
     */
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el dato entero almacenado en el nodo.
     *
     * @return El valor entero del nodo.
     */
    public int getDato() {
        return dato;
    }

    /**
     * Modifica el dato entero almacenado en el nodo.
     *
     * @param dato El nuevo valor entero a almacenar.
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * Obtiene la referencia al siguiente nodo de la lista.
     *
     * @return El {@link Nodo} siguiente, o {@code null} si este es el último nodo.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Establece la referencia hacia el siguiente nodo de la lista.
     *
     * @param siguiente El nuevo {@link Nodo} que será el sucesor.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Devuelve una representación textual del nodo.
     *
     * @return Cadena que representa el nodo con su valor.
     */
    @Override
    public String toString() {
        return "[" + dato + "]";
    }
}
