package listasEnlazadas.taller;

public class Nodo<T> {
	private Nodo<T> siguienteNodo;
	private T valorNodo;
	
	public Nodo(T valorNodo) {
		this.valorNodo = valorNodo;
		siguienteNodo = null;
	}

	public Nodo<T> getSiguienteNodo() {
		return siguienteNodo;
	}
	public void setSiguienteNodo(Nodo<T> siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}
	public T getValorNodo() {
		return valorNodo;
	}
	public void setValorNodo(T valorNodo) {
		this.valorNodo = valorNodo;
	}
	
}
