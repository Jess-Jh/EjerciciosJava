package pilasYColas;

public class Pila<T> {
	
	private Nodo<T> ultimo;//siempre 
	private int tamaño;
	
	/**
	 * Constructor con la pila vacia.
	 */
	public Pila() {
		ultimo = null;
		tamaño = 0;
	}
	/**
	 * Método que comprueba si la pila está vacía o no.
	 * @return: True si está vacía, false si no.
	 */
	public boolean Vacia() {
		
		if(ultimo == null) return true;
		else return false;
		
		/* Es lo mismo
	if(tamaño==0) {
		return true;
	}else {
		return false;
	}
	*/
	}
	/**
	 * Método que retorna la longitud de la lista.
	 * @return: int.
	 */
	public int longitud() {
		return tamaño;
	}
	
	/**
	 * Método que retorna el último Elemento de tipo genérico.
	 * @return: Elemento de tipo genérico.
	 */
	public T ultimo() {
		return ultimo.getValorNodo();
	}
	/**
	 * Método que inserta un elemento de tipo genérico en la Pila.
	 * @param element: Elemento de tipo genérico.
	 */
	public void insertar(T element) {
		Nodo<T> aux = new Nodo<T>(element,ultimo);
		ultimo = aux;
		tamaño++;
	}
	/**
	 * Método que extrae el último elemento de la Pila.
	 * @return: Último elemento de la Pila de tipo genérico.
	 * @throws Exception :La pila está vacía.
	 */
	public T extraer() throws Exception {
		if(Vacia()) {
			throw new Exception("La pila está vacía");
		} else {
			T element = ultimo.getValorNodo();
			ultimo = ultimo.getSiguienteNodo();
			tamaño--;
			return element;
		}
	}
	/**
	 * Método que vacía la Pila.
	 */
	public void vaciar() {
		tamaño = 0;	
	}
	
	 /**
	  * Método para imprimir los elementos de la Pila.
	  * @return: String(los elementos).
	  */
	public String toString() {
		
		String texto = "";
		Nodo<T> aux = ultimo;
		while(aux != null) {
			texto += "\n" + aux.getValorNodo();
			aux = aux.getSiguienteNodo();
		}
		return texto;	
	}

}
