
package listasdobles;

public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private String dato;

    public Nodo(String dato, Nodo anterior, Nodo siguiente) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public String getDato() {
        return dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
