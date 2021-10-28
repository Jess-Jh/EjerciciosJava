package pilasYColas;


public class Nodo<T> {
	private T elemento;
	private Nodo<T> siguiente;
	
	/**
	 * Constructor que crea un Nodo con su elemento y puntero.
	 * @param elemento: Elemento de tipo genérico.
	 * @param siguiente: Puntero.
	 */
	public Nodo(T elemento, Nodo<T> siguiente) {
		this.elemento=elemento;
		this.siguiente=siguiente;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	
}
