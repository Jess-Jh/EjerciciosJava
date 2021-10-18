package listasEnlazadas.taller;

import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
	private Nodo<T> nodoPrimero;
	private int tamano;
	
	public Lista() {
		nodoPrimero = null;
		tamano = 0;
	}

	public Nodo<T> getNodoPrimero() {
		return nodoPrimero;
	}
	public void setNodoPrimero(Nodo<T> nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	public void agregarAlFinal(T valor){
        Nodo<T> nuevo = new Nodo<>(valor);
        
        if (esVacia()) nodoPrimero = nuevo;
        
        else{
            Nodo<T> aux = nodoPrimero;
            while(aux.getSiguienteNodo() != null) aux = aux.getSiguienteNodo();
            
            aux.setSiguienteNodo(nuevo);
        }
        tamano++;
    }
	
	public void agregarAlInicio(T valor){
        Nodo<T> nuevo = new Nodo<>(valor);
        
        if (esVacia()) nodoPrimero = nuevo;
        
        else{
            nuevo.setSiguienteNodo(nodoPrimero);
            nodoPrimero = nuevo;
        }
        tamano++;
    }
	
	public void agregarNodo(T dato) {
		Nodo<T> nuevo = new Nodo<>(dato);
		nuevo.setSiguienteNodo(nodoPrimero);
		nodoPrimero = nuevo;
		tamano++;
	}
	
	public boolean esVacia(){
		
		if(nodoPrimero == null) return true;	
		else return false;
    }
	
	public void imprimirLista() {
		Nodo<T> actual = nodoPrimero;
		while(actual != null) {
			System.out.print("[" + actual.getValorNodo() + "]->");
			actual = actual.getSiguienteNodo();
			
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new IteradorListaSimple (nodoPrimero);
	}
	
	public class IteradorListaSimple implements Iterator<T>{

		private Nodo<T> nodo;
		private int posicion;
		
		/**
		 * Constructor de la clase Iterador
		 * @param aux Primer Nodo de la lista
		 */
		public IteradorListaSimple(Nodo<T> nodo) {
			this.nodo = nodo;
			this.posicion = 0;
		}
		
		@Override
		public boolean hasNext() {
			return nodo!=null;
		}

		@Override
		public T next() {
			T valor = nodo.getValorNodo();
			nodo = nodo.getSiguienteNodo();
			posicion++;
			return valor;
		}
		
		/**
		 * Posición actual de la lista
		 * @return posición
		 */
		public int getPosicion() {
			return posicion;
		}
	}
}
