package ejerciciosPilasColasListasEnlazadas;

public class Ej_07_ListasInvertirContenido {

	public static void main(String[] args) {
		
		ListaSimple<Integer> lista = new ListaSimple<>();
		
		for (int i = 0; i < 10; i++) {
			lista.agregarfinal((int) Math.floor(Math.random() * 100));
		}

		System.out.println("Lista antes de invertirla");
		lista.imprimirLista();
		
		System.out.println();
		InvertirLista(lista);
		System.out.println("Lista despues de invertirla");
		lista.imprimirLista();
	}
	
	public static ListaSimple<Integer> InvertirLista(ListaSimple<Integer> lista){
		Nodo<Integer> nodo;
		
		if (lista == null || lista.getTamanio() == 1) 
              System.out.println("La lista esta vacia o tiene un solo elemento");
              
		else {		
			nodo = invertirNodo(lista.getNodoPrimero().getSiguienteNodo(), lista.getNodoPrimero());
			lista.getNodoPrimero().setSiguienteNodo(null);
			lista.setNodoUltimo(lista.getNodoPrimero());  
			lista.setNodoPrimero(nodo);
		}
		return lista;
	}

	public static Nodo<Integer> invertirNodo(Nodo<Integer> actual, Nodo<Integer> anterior) {
	
		Nodo<Integer> nodo;
		
		if (actual == null) nodo = anterior;
		else {	
			nodo = invertirNodo(actual.getSiguienteNodo(), actual);
			actual.setSiguienteNodo(anterior);
		}
		return nodo;
	}
	

}
