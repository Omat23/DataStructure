package Queue;

/**
 * Clase que representa una Cola Estática (Fila) usando un arreglo unidimensional.
 * Implementa las operaciones básicas de una cola sin usar librerías externas de colecciones.
 */
public class StaticQueue {
    /** Arreglo que almacena los elementos de la cola. */
    private int[] elements;
    
    /** Índice que apunta al frente de la cola (salida). */
    private int front;
    
    /** Índice que apunta al final de la cola (entrada). */
    private int rear;
    
    /** Tamaño máximo de la cola. */
    private final int MAX_SIZE = 5;

    /**
     * Constructor que inicializa la cola vacía.
     */
    public StaticQueue() {
        elements = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    /**
     * Inserta un elemento en la cola.
     * 
     * @param value El número entero a insertar.
     * @throws Exception Si la cola está llena (Overflow).
     */
    public void push(int value) throws Exception {
        if (rear == MAX_SIZE - 1) {
            throw new Exception("Error: Overflow (Desbordamiento de cola). No se pueden insertar más elementos.");
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        elements[rear] = value;
    }

    /**
     * Recupera y elimina el elemento al frente de la cola.
     * 
     * @return El elemento recuperado.
     * @throws Exception Si la cola está vacía (Underflow).
     */
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Error: Underflow (Subdesbordamiento de cola). No hay elementos para recuperar.");
        }
        int value = elements[front];
        front++;
        
        // Si después de recuperar el elemento, la cola queda vacía, 
        // reiniciamos los punteros para poder reusar el espacio.
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        
        return value;
    }

    /**
     * Vacía la cola eliminando todos sus elementos.
     */
    public void clear() {
        front = -1;
        rear = -1;
    }

    /**
     * Verifica si la cola está vacía.
     * 
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    /**
     * Muestra el estado actual de la cola de forma horizontal.
     * La entrada de la cola está hacia la izquierda y la salida hacia la derecha.
     */
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        
        System.out.print("Entrada -> ");
        for (int i = rear; i >= front; i--) {
            System.out.print("[" + elements[i] + "] ");
        }
        System.out.println("-> Salida");
    }
}
