package listasEnlazadas.ejemplo;

/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 */
public class Nodo {
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + ", siguiente=" + siguiente + "]";
	}
    
    
    
    
}