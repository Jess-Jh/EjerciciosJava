package listasEnlazadas.taller;

public class Nodo {
	Nodo siguienteNodo;
	int valorNodo;
	
	public Nodo(int valorNodo) {
		this.valorNodo = valorNodo;
		siguienteNodo = null;
	}

	public Nodo getSiguienteNodo() {
		return siguienteNodo;
	}
	public void setSiguienteNodo(Nodo siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}
	public int getValorNodo() {
		return valorNodo;
	}
	public void setValorNodo(int valorNodo) {
		this.valorNodo = valorNodo;
	}
}
