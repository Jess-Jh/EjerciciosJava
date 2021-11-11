package preParcialListasEnlPilasColas;

public class Ej_05_ListasMaximaDistancia {

	public static void main(String[] args) {
		ListaSimple<Integer> lista = new ListaSimple<>();
		lista.agregarfinal(9);
		lista.agregarfinal(4);
		lista.agregarfinal(6);
		lista.agregarfinal(8);
		lista.agregarfinal(4);
		lista.agregarfinal(5);
		lista.agregarfinal(4);
		lista.agregarfinal(4);
		
		lista.imprimirLista();
		
		int distancia = buscarDistancia(lista, 4);
		System.out.println(" Distancia Máxima: " + distancia);

	}
	
	static int buscarDistancia(ListaSimple<Integer> lista, int n) {
		return maximaDistancia(lista.getNodoPrimero(), n, 0, 0);
	}
	
	public static int maximaDistancia(Nodo<Integer> nodo, int clave, int distancia, int maximaDistancia) {
		
		int resultado;
		
		if(nodo != null) {
			if(distancia == 0) {
				if(nodo.getValorNodo() == clave) distancia = 1;
				
			} else {
				if( nodo.getValorNodo() != clave) distancia++;
				
				else {
					if(distancia > maximaDistancia) 
							maximaDistancia = distancia;
						distancia = 1;
				}
			}
			resultado = maximaDistancia(nodo.getSiguienteNodo(), clave, distancia, maximaDistancia);
				
		} else {
			resultado = maximaDistancia;
		}
		return resultado;
	}
}
