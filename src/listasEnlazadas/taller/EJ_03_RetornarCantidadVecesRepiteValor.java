package listasEnlazadas.taller;

public class EJ_03_RetornarCantidadVecesRepiteValor {

	public static int retornarCantidadValor(Lista<Integer> lista, int valor) {
		Nodo<Integer> aux = lista.getNodoPrimero();
		int cantValor = 0;
		
		while(aux != null) {
			if(aux.getValorNodo() == valor)
				cantValor++;
			
			aux = aux.getSiguienteNodo();
		}
		return cantValor;
	}
	
	public static void main(String[] args) {
		
		Lista<Integer> lista = new Lista<>();
		int cantidad = 0;
		
		lista.agregarNodo(3);
		lista.agregarNodo(2);
		lista.agregarNodo(3);
		lista.agregarNodo(4);
		lista.agregarNodo(3);
		lista.imprimirLista();
		
		System.out.println("\n");
		
		cantidad = retornarCantidadValor(lista, 3);
		
		System.out.println("Cantidad de veces que se repite el valor " + cantidad);
	}

}
