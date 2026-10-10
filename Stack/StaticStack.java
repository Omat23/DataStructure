package Stack;

/**
 * Representa una pila estática de enteros implementada con un arreglo.
 *
 * <p>La pila tiene una capacidad fija de cinco elementos y sigue el principio
 * LIFO (Last In, First Out). No utiliza {@code java.util.Stack} ni otras
 * colecciones.</p>
 */
public class StaticStack {
    /** Capacidad máxima de la pila. */
    private static final int MAX_SIZE = 5;

    /** Arreglo que almacena los elementos apilados. */
    private final int[] elements;

    /** Índice del elemento que se encuentra en la cima; {@code -1} si está vacía. */
    private int top;

    /**
     * Crea una pila vacía con capacidad para cinco enteros.
     */
    public StaticStack() {
        elements = new int[MAX_SIZE];
        top = -1;
    }

    /**
     * Inserta un entero en la cima de la pila.
     *
     * @param value entero que se desea apilar
     * @throws IllegalStateException si la pila está llena (overflow)
     */
    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            throw new IllegalStateException(
                    "Error: Overflow (Desbordamiento de pila). No se pueden insertar más elementos.");
        }
        top++;
        elements[top] = value;
    }

    /**
     * Recupera y elimina el entero que se encuentra en la cima.
     *
     * @return elemento que estaba en la cima
     * @throws IllegalStateException si la pila está vacía (underflow)
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Error: Underflow (Subdesbordamiento de pila). No hay elementos para recuperar.");
        }
        return elements[top--];
    }

    /**
     * Elimina todos los elementos de la pila.
     */
    public void clear() {
        top = -1;
    }

    /**
     * Indica si la pila no contiene elementos.
     *
     * @return {@code true} si la pila está vacía; de lo contrario, {@code false}
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Imprime la pila horizontalmente, desde la base hasta la cima a la derecha.
     * Si no hay elementos, informa que la pila está vacía.
     */
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.print("Base -> ");
        for (int i = 0; i <= top; i++) {
            System.out.print("[" + elements[i] + "] ");
        }
        System.out.println("<- Cima");
    }
}
