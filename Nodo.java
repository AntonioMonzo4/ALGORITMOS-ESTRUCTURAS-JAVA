public abstract class Nodo<E> {

    private E dato;

    public Nodo() {
    }

    public Nodo(E dato) {
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {

        this.dato = dato;
    }
}
