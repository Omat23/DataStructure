package LinkedList;

/**
 * Representa una Lista Enlazada Simple de números enteros conformada por {@link Nodo}s.
 * <p>
 * Implementa las operaciones fundamentales de una estructura lineal de datos enlazada,
 * manejando índices basados en 1 (donde el primer nodo se encuentra en la posición 1).
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
public class ListaEnlazadaSimple {

    /** Puntero o referencia al primer nodo de la lista (cabeza). */
    private Nodo cabeza;

    /** Cantidad actual de elementos (nodos) en la lista. */
    private int longitud;

    /**
     * Constructor por defecto que inicializa una lista enlazada vacía.
     */
    public ListaEnlazadaSimple() {
        this.cabeza = null;
        this.longitud = 0;
    }

    /**
     * Constructor que inicializa una lista enlazada simple a partir de un arreglo de números enteros.
     * Los elementos se insertan en el mismo orden que aparecen en el arreglo.
     *
     * @param elementos Arreglo de enteros con los que se poblará la lista.
     */
    public ListaEnlazadaSimple(int[] elementos) {
        this();
        if (elementos != null) {
            for (int elemento : elementos) {
                agregarAlFinal(elemento);
            }
        }
    }

    /**
     * Crea e inicializa una lista enlazada simple con exactamente 5 nodos iniciales.
     *
     * @param v1 Valor entero para el primer nodo (posición 1).
     * @param v2 Valor entero para el segundo nodo (posición 2).
     * @param v3 Valor entero para el tercer nodo (posición 3).
     * @param v4 Valor entero para el cuarto nodo (posición 4).
     * @param v5 Valor entero para el quinto nodo (posición 5).
     * @return Una nueva instancia de {@link ListaEnlazadaSimple} con 5 nodos.
     */
    public static ListaEnlazadaSimple crearListaCon5Nodos(int v1, int v2, int v3, int v4, int v5) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.agregarAlFinal(v1);
        lista.agregarAlFinal(v2);
        lista.agregarAlFinal(v3);
        lista.agregarAlFinal(v4);
        lista.agregarAlFinal(v5);
        return lista;
    }

    /**
     * Inicializa o restablece la lista actual configurándola con exactamente 5 nodos.
     *
     * @param v1 Valor para el nodo 1.
     * @param v2 Valor para el nodo 2.
     * @param v3 Valor para el nodo 3.
     * @param v4 Valor para el nodo 4.
     * @param v5 Valor para el nodo 5.
     */
    public void inicializarCon5Nodos(int v1, int v2, int v3, int v4, int v5) {
        vaciarLista();
        agregarAlFinal(v1);
        agregarAlFinal(v2);
        agregarAlFinal(v3);
        agregarAlFinal(v4);
        agregarAlFinal(v5);
    }

    /**
     * Agrega un nuevo elemento en la posición especificada {@code n}.
     * <p>
     * La posición del primer elemento es la 1. Las posiciones válidas van desde 1
     * hasta {@code longitudLista() + 1}. Si la posición es 1, el nodo se inserta al
     * inicio de la lista. Si es {@code longitudLista() + 1}, se inserta al final.
     * </p>
     *
     * @param elemento El valor numérico entero que se desea agregar.
     * @param posicion La posición (1-indexada) donde se insertará el nuevo elemento.
     * @throws IndexOutOfBoundsException Si la posición es menor a 1 o mayor a {@code longitudLista() + 1}.
     */
    public void agregarElemento(int elemento, int posicion) {
        if (posicion < 1 || posicion > longitud + 1) {
            throw new IndexOutOfBoundsException(
                    "Error: Posición inválida (" + posicion + "). "
                    + "La posición debe estar entre 1 y " + (longitud + 1) + "."
            );
        }

        Nodo nuevoNodo = new Nodo(elemento);

        // Inserción en la primera posición (cabeza)
        if (posicion == 1) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {
            // Recorrer hasta el nodo anterior a la posición deseada (posición - 1)
            Nodo actual = cabeza;
            for (int i = 1; i < posicion - 1; i++) {
                actual = actual.getSiguiente();
            }
            // Enlazar el nuevo nodo con el sucesor del actual y luego conectar el actual al nuevo
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }

        longitud++;
    }

    /**
     * Método auxiliar para agregar un elemento al final de la lista.
     *
     * @param elemento El valor entero que se desea agregar al final.
     */
    public void agregarAlFinal(int elemento) {
        agregarElemento(elemento, longitud + 1);
    }

    /**
     * Elimina el nodo ubicado en la posición especificada {@code n} y devuelve su valor.
     * <p>
     * La posición del primer elemento es la 1. Antes de desvincular el nodo de la lista,
     * se extrae y guarda el dato contenido para ser retornado al usuario.
     * </p>
     *
     * @param posicion La posición (1-indexada) del nodo que se desea eliminar.
     * @return El elemento entero que contenía el nodo antes de ser eliminado.
     * @throws IllegalStateException Si la lista se encuentra vacía.
     * @throws IndexOutOfBoundsException Si la posición es menor a 1 o mayor a la longitud actual de la lista.
     */
    public int eliminarElemento(int posicion) {
        if (listaVacia()) {
            throw new IllegalStateException("Error: Underflow. No se puede eliminar ningún elemento de una lista vacía.");
        }

        if (posicion < 1 || posicion > longitud) {
            throw new IndexOutOfBoundsException(
                    "Error: Posición inválida (" + posicion + "). "
                    + "La posición debe estar entre 1 y " + longitud + "."
            );
        }

        int elementoEliminado;

        // Eliminación del primer nodo (cabeza)
        if (posicion == 1) {
            elementoEliminado = cabeza.getDato();
            Nodo aux = cabeza;
            cabeza = cabeza.getSiguiente();
            aux.setSiguiente(null); // Desconectar nodo eliminado
        } else {
            // Recorrer hasta el nodo inmediatamente anterior a la posición a eliminar
            Nodo anterior = cabeza;
            for (int i = 1; i < posicion - 1; i++) {
                anterior = anterior.getSiguiente();
            }
            Nodo nodoAEliminar = anterior.getSiguiente();
            elementoEliminado = nodoAEliminar.getDato();

            // Desvincular el nodo a eliminar
            anterior.setSiguiente(nodoAEliminar.getSiguiente());
            nodoAEliminar.setSiguiente(null);
        }

        longitud--;
        return elementoEliminado;
    }

    /**
     * Busca un elemento dentro de la lista y devuelve la posición donde se encuentra.
     * <p>
     * Realiza una búsqueda secuencial desde el inicio de la lista. Si el elemento se
     * encuentra repetido, devuelve la posición (1-indexada) de la primera aparición.
     * </p>
     *
     * @param elemento El valor entero a buscar en la lista.
     * @return La posición (1-indexada) del elemento si se encuentra, o {@code -1} si no existe en la lista.
     */
    public int buscarElemento(int elemento) {
        Nodo actual = cabeza;
        int posicionActual = 1;

        while (actual != null) {
            if (actual.getDato() == elemento) {
                return posicionActual;
            }
            actual = actual.getSiguiente();
            posicionActual++;
        }

        return -1; // No encontrado
    }

    /**
     * Regresa la cantidad de elementos (longitud) que contiene la lista.
     *
     * @return El número de nodos actualmente presentes en la lista.
     */
    public int longitudLista() {
        return longitud;
    }

    /**
     * Determina si la lista enlazada simple se encuentra vacía.
     *
     * @return {@code true} si la lista no contiene elementos; {@code false} en caso contrario.
     */
    public boolean listaVacia() {
        return cabeza == null;
    }

    /**
     * Obtiene el dato del nodo en una posición determinada sin eliminarlo.
     *
     * @param posicion La posición (1-indexada) del elemento a consultar.
     * @return El valor entero en la posición indicada.
     * @throws IndexOutOfBoundsException Si la posición está fuera del rango [1, longitudLista()].
     */
    public int obtenerElemento(int posicion) {
        if (posicion < 1 || posicion > longitud) {
            throw new IndexOutOfBoundsException(
                    "Error: Posición inválida (" + posicion + "). "
                    + "La posición debe estar entre 1 y " + longitud + "."
            );
        }

        Nodo actual = cabeza;
        for (int i = 1; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    /**
     * Elimina todos los nodos de la lista dejándola completamente vacía.
     */
    public void vaciarLista() {
        cabeza = null;
        longitud = 0;
    }

    /**
     * Muestra en consola la representación visual horizontal de la lista enlazada.
     * Ejemplo de salida: {@code [Inicio] -> [10] -> [20] -> [30] -> [40] -> [50] -> null}
     */
    public void mostrarLista() {
        if (listaVacia()) {
            System.out.println("Lista: [Vacía] (longitud: 0)");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[Inicio] -> ");
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append("[").append(actual.getDato()).append("] -> ");
            actual = actual.getSiguiente();
        }
        sb.append("null (longitud: ").append(longitud).append(")");
        System.out.println(sb.toString());
    }

    /**
     * Devuelve la referencia al primer nodo (cabeza) de la lista.
     *
     * @return El {@link Nodo} inicial o {@code null} si la lista está vacía.
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * Retorna una representación en cadena del contenido de la lista enlazada.
     *
     * @return Cadena con los elementos ordenados secuencialmente.
     */
    @Override
    public String toString() {
        if (listaVacia()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(", ");
            }
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }
}
