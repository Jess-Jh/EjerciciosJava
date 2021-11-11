package preParcialListasEnlPilasColas;

public class Ej_01_InvertirListaSimple {
	
	public static void main(String[] args) {
			
			ListaSimple<Persona> lista = new ListaSimple<>();
			inicializar(lista);
	
			System.out.println("Lista antes de invertirla");
			lista.imprimirLista();
			
			System.out.println("\n");
			ListaSimple<Persona> listaInvertida = new ListaSimple<>();

			listaInvertida = invertirLista(lista);
			System.out.println("Lista despues de invertirla");
			listaInvertida.imprimirLista();
		}


	/**
	 * Metodo que invierte una lista simple
	 * @param listaSimple
	 * @return
	 */
	private static ListaSimple<Persona> invertirLista(ListaSimple<Persona> listaSimple) {
	
		ListaSimple<Persona> listaAux = new ListaSimple<>();
		Pila<Persona> pila = new Pila<>();
		Nodo<Persona> aux = listaSimple.getNodoPrimero();
		
		for (int i = 0; i < listaSimple.getTamanio(); i++) {
			Persona persona = aux.getValorNodo();
			pila.push(persona);
			aux = aux.getSiguienteNodo();
		}
	
		for (int i = 0; i < listaSimple.getTamanio(); i++) {
			Nodo<Persona> nodo = new Nodo<>();
			nodo.setValorNodo(pila.pop());
			listaAux.agregarfinal(nodo.getValorNodo());
		}
		return listaAux;
	}
	
	/**
	 * Metodo que inicializa los datos de la lista simple
	 * @param listaSimple El parametro lista simple que le ingresa se inicializa con
	 * los datos declarados
	 */
	private static void inicializar(ListaSimple<Persona> lista) {
	
		Persona persona1 = new Persona("Juan", 34, "M");
		Persona persona2 = new Persona("Manuela", 35, "F");
		Persona persona3 = new Persona("Melissa", 20, "F");
		Persona persona4 = new Persona("Guillermo", 55, "M");
		Persona persona5 = new Persona("Camilo", 49, "M");
		Persona persona6 = new Persona("Cristian", 50, "M");
		Persona persona7 = new Persona("Daniel", 31, "M");
		Persona persona8 = new Persona("Sebastian", 30, "M");
	
		lista.agregarfinal(persona1);
		lista.agregarfinal(persona2);
		lista.agregarfinal(persona3);
		lista.agregarfinal(persona4);
		lista.agregarfinal(persona5);
		lista.agregarfinal(persona6);
		lista.agregarfinal(persona7);
		lista.agregarfinal(persona8);
	}


}
