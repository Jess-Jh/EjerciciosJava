package listasEnlazadas.taller;

import listasEnlazadas.ejercicio.Nodo;

public class Ej_01_ObtenerValoresImparesListaNumeros {
	
	public static Lista obtenerListaNumerosImpares(Lista numImpares) {
		Lista listaImpares = new Lista();
		Nodo aux = numImpares.getNodoPrimero();
		
		while(aux != null) {
			if(aux.getValorNodo() % 2 != 0) 
				listaImpares.agregarAlFinal(aux.getValorNodo());
			
			aux = aux.getSiguienteNodo();
		}
		return listaImpares;
	}
	
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		Lista listaImpares = new Lista();
		
		lista.agregarNodo(1);
		lista.agregarNodo(2);
		lista.agregarNodo(3);
		lista.agregarNodo(4);
		lista.agregarNodo(5);
		lista.imprimirLista();
		
		System.out.println("\n");
		System.out.println("Lista Impares");
		
		listaImpares = obtenerListaNumerosImpares(lista);
		listaImpares.imprimirLista();

	}

}
