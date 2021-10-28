package ejerciciosPilasColasListasEnlazadas;

public class Ej_02_ObtenerSecuenciaAleatoriaNumeros {

	public static void main(String[] args) {
		obtenerSecuenciaAleatoriaNumeros();
	}
	
	public static void obtenerSecuenciaAleatoriaNumeros() {
		ListaSimple<Integer> numeros = new ListaSimple<>();
		Pila<Integer> pila = new Pila<Integer>();

		for (int i = 0; i < 10; i++) {
			numeros.agregarfinal((int) Math.floor(Math.random() * 100));
			pila.push(numeros.obtenerValorNodo(i));
		}

		System.out.println("Numeros Lista");
		numeros.imprimirLista();
		System.out.println();
		System.out.println("Numeros Pila");
		pila.imprimir();
	}

}
