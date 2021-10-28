package pilasYColas;

public class Cola<T> {
	
	private Nodo<T> primero;
	private Nodo<T> ultimo;
	private int tamaño;
	/**
	 * Constructor con la Cola vacia
	 */
	public Cola() {
		primero = null;
		ultimo = null;
		tamaño = 0;
	}
	/**
	 * Método que comprueba si la Cola está vacía o no.
	 * @return: True si está vacía, false si no.
	 */
	public boolean isVacia() {
		
		if(primero == null) return true;
		else return false;
	}
	/**
	 * Método que devuelve el numero de elementos que hay en la pila.
	 * @return: int.
	 */
	public int longitud() {
		int cont=0;
		Nodo<T> aux = primero;
		while(aux != null) {
			aux = aux.getSiguiente();
			cont++;
		}
		return cont;
	}
	
	/**
	 * Método que retorna el primer elemento de la Cola.
	 * @return: Elemento de tipo genérico.
	 */
	public T primero() {
		return primero.getElemento();
	}
	/**
	 * Método que vacia la cola.
	 */
	public void vaciar() {
		primero = null;
	}
	/**
	 * Método que inserta un elemento de tipo genérico en la Cola.
	 * @param element: Elemento de tipo genérico.
	 */
	public void insertar(T element) {
		
		Nodo<T> aux= new Nodo<T>(element, null);
		
		if(isVacia()) {
			primero = aux;
			ultimo = aux;
		} else if(longitud() == 1) {
			primero.setSiguiente(aux);
			ultimo = aux;
		} else {
			ultimo.setSiguiente(aux);
			ultimo=aux;
		}
		tamaño++;
	}
	/**
	 * Método que extrae un elemento de la Cola.
	 * @throws Exception : la cola está vacía
	 */
	public void extraer() throws Exception {
		
		if(isVacia()) {
			throw new Exception("la cola está vacía");
		} else {
			Nodo<T> aux = primero.getSiguiente();
			primero = null;
			primero = aux;
			tamaño--;
		}
	}
	
	public String toString() {
		
		String texto = "";
		Nodo<T> aux = primero;
		while(aux != null) {
			texto += "\n" + aux.getElemento();
			aux = aux.getSiguiente();
		}
		return texto;
	}

}
