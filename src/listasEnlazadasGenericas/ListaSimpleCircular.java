package listasEnlazadasGenericas;

import java.util.Iterator;

/**
 * Definición de la clase lista Simple de tipo Generics
 * @param <T>
 * **/
public class ListaSimpleCircular<T> implements Iterable<T> {
	
	private Nodo<T> nodoPrimero;
	private Nodo<T> nodoUltimo;
	private int tamanio;
	
	public ListaSimpleCircular() {
		nodoPrimero = null;
		nodoUltimo = null;
		tamanio = 0;
	}
	
	//Metodos basicos
	
	//Agregar al inicio de la lista
	public void agregarInicio(T valorNodo) {
		
		Nodo<T> nuevoNodo = new Nodo<>(valorNodo);
		
		if(estaVacia()) {
			nodoPrimero = nuevoNodo;
		} else {
			Nodo<T> aux = nodoUltimo.getSiguienteNodo();
			nodoUltimo.setSiguienteNodo(nuevoNodo);
			nuevoNodo.setSiguienteNodo(aux);
			nodoUltimo = nuevoNodo;
		}
		tamanio++;
	}
	
	//Agregar al final de la lista
	public void agregarfinal(T valorNodo) {
		
		Nodo<T> nuevoNodo = new Nodo<>(valorNodo);
		
		if(estaVacia()) {
			nodoPrimero = nodoUltimo = nuevoNodo;
		} else {
			Nodo<T> aux = nodoUltimo.getSiguienteNodo();
			nodoUltimo.setSiguienteNodo(nuevoNodo);
			nuevoNodo.setSiguienteNodo(aux);
			nodoUltimo = nuevoNodo;
		}
		tamanio++;
	}
	
	//Obtener Nodo el valor de un Nodo
	public T obtenerValorNodo(int indice) {
		
		Nodo<T> nodoTemporal = null;
		int contador = 0;
		
		if(indiceValido(indice)) {
			nodoTemporal = nodoPrimero;
			
			while (contador < indice) {
				nodoTemporal = nodoTemporal.getSiguienteNodo();
				contador++;
			}
		}
		
		if(nodoTemporal != null)
			return nodoTemporal.getValorNodo();
		else
			return null;
	}
	
	//Verificar si indice es valido
	private boolean indiceValido(int indice) {		
		if( indice>=0 && indice<tamanio ) {
			return true;
		}			
		throw new RuntimeException("Índice no válido");
	}
	
	//Verificar si la lista esta vacia
	public boolean estaVacia() {
		return(nodoPrimero == null)?true:false;
	}

	/**
	 * Imprime en consola la lista enlazada
	 */
	public void imprimirLista() {
		
		Nodo<T> aux = nodoPrimero;
		
		while(aux!=null) {
			System.out.print( aux.getValorNodo()+"\t" );
			aux = aux.getSiguienteNodo();			
		}
		System.out.println();
	}
	
	//Eliminar dado el valor de un nodo
	public T eliminar(T dato){
		Nodo<T> nodo = nodoPrimero;
		Nodo<T> previo = null;
		Nodo<T> siguiente = null;
		boolean encontrado = false;
		
		//buscar el nodo previo
		while(nodo!=null) {			
			if( nodo.getValorNodo() == dato ) {
				encontrado = true;
				break;
			}
			previo = nodo;
			nodo = nodo.getSiguienteNodo();
		}
		
		if(encontrado) {
			siguiente = nodo.getSiguienteNodo();
			
			if( previo==null ) nodoPrimero = siguiente;
			else previo.setSiguienteNodo(siguiente);
			
			
			if(siguiente==null) nodoUltimo = previo;
			else nodo.setSiguienteNodo(null);
			
			nodo = null;
			tamanio--;
			return dato;			
		}
		throw new RuntimeException("El elemento no existe");
	}
	
	//Elimina el primer nodo de la lista
	public T eliminarPrimero() {
		
		if( !estaVacia() ) {
			Nodo<T> n = nodoPrimero;
		    T valor = n.getValorNodo();
			nodoPrimero = n.getSiguienteNodo();
			
			if(nodoPrimero==null) nodoUltimo = null;
			
			tamanio--;
			return valor;
		}
		throw new RuntimeException("Lista vacía");		
	}
	
	public T eliminarUltimo() {
		
		if( !estaVacia() ) {			
			T valor = nodoUltimo.getValorNodo();
			Nodo<T> prev = obtenerNodo(tamanio-2);
			nodoUltimo = prev;
			
			if(nodoUltimo==null) nodoPrimero=null;
			else prev.setSiguienteNodo(null);			
			
			tamanio--;
			return valor;
		}
		throw new RuntimeException("Lista vacía");
	}	
	
	private Nodo<T> obtenerNodo(int indice) {
		
		if(indice >= 0 && indice < tamanio) {
		
			Nodo<T> nodo = nodoPrimero;
			
			for (int i = 0; i < indice; i++) {
				nodo = nodo.getSiguienteNodo();
			}
			return nodo;			
		}
		return null;
	}
	
	/**
	 * Cambia el valor de un nodo dada su posición en la lista
	 * @param indice posición donde se va a cambiar el dato
	 * @param nuevo nuevo valor por el que se actualizará el nodo
	 */
	public void modificarNodo(int indice, T nuevo) {
		
		if( indiceValido(indice) ) {			
			Nodo<T> nodo = obtenerNodo(indice);
			nodo.setValorNodo(nuevo);			
		}
	}
	
	/**
	 * Retorna la primera posición donde está guardado el dato
	 * @param dato valor a buscar dentro de la lista
	 * @return primera posición del dato
	 */
	public int obtenerPosicionNodo(T dato) {

		int i = 0;
		
		for( Nodo<T> aux = nodoPrimero ; aux!=null ; aux = aux.getSiguienteNodo() ) {
			if( aux.getValorNodo().equals(dato) ) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	@Override
	public Iterator<T> iterator() {	
		return new IteradorListaSimple (nodoPrimero);
	}
	
	protected class IteradorListaSimple implements Iterator<T>{

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
	
	//Metodos get y set de la clase ListaSimple
	
	public Nodo<T> getNodoPrimero() {
		return nodoPrimero;
	}
	public void setNodoPrimero(Nodo<T> nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamaño) {
		this.tamanio = tamaño;
	}



	
	

}
