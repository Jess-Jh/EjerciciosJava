package listasEnlazadas.taller;

public class Nodo {
	Nodo siguienteNodo;
	int valorNodo;
	String cadenaNodo;
	
	public Nodo(int valorNodo) {
		this.valorNodo = valorNodo;
		siguienteNodo = null;
	}
	
	public Nodo(String cadenaNodo) {
		this.cadenaNodo = cadenaNodo;
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
	public String getCadenaNodo() {
		return cadenaNodo;
	}
	public void setCadenaNodo(String cadenaNodo) {
		this.cadenaNodo = cadenaNodo;
	}
	
}
