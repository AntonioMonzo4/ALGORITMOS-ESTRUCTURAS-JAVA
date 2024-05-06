public abstract class Node<E> {

    private E dato;

    public Node() {
    }

    public Node(E dato) {
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {

        this.dato = dato;
    }
}
