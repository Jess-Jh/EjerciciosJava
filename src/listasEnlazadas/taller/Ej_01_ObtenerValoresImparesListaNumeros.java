package listasEnlazadas.taller;

public class Ej_01_ObtenerValoresImparesListaNumeros {
	
	public static Lista<Integer> obtenerListaNumerosImpares(Lista<Integer> numeros) {
		Lista<Integer> listaImpares = new Lista<>();
		Nodo<Integer> aux = numeros.getNodoPrimero();
		
		while(aux != null) {
			if(aux.getValorNodo() % 2 != 0) 
				listaImpares.agregarAlFinal(aux.getValorNodo());
			
			aux = aux.getSiguienteNodo();
		}
		return listaImpares;
	}
	
	public static void main(String[] args) {
		
		Lista<Integer> lista = new Lista<>();
		Lista<Integer> listaImpares = new Lista<>();
		
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
