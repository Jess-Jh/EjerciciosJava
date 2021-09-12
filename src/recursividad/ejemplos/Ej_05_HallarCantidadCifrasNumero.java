package recursividad.ejemplos;

public class Ej_05_HallarCantidadCifrasNumero {

	public static void main(String[] args) {
		
		int n = 234589;
		int cantidadCifras = hallarCantidadCifrasNumero(n);
		
		System.out.println("La cantidad de cifras del número es " + cantidadCifras);
	}

	/**
	 * Hallar la cantidad de cifras de un número de forma recursiva
	 * @param n
	 * @return
	 */
	private static int hallarCantidadCifrasNumero(int n) {
		
		if(n < 10) return 1;
		else return 1 + hallarCantidadCifrasNumero(n/10);
	}
}
