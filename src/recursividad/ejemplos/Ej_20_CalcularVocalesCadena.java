package recursividad.ejemplos;

public class Ej_20_CalcularVocalesCadena {

	public static void main(String[] args) {

		String palabra = "Ingenieria";
		int numVocales = calcularNumeroVocales(palabra, 0);
		
		System.out.println("La cantidad de vocales de la palabra " + palabra + " son " + numVocales);
	}
	
	/**
	 * Método recursivo para calcular el número de vocales de una cadena
	 * @param cadena
	 * @param i
	 * @return
	 */
	public static int calcularNumeroVocales(String cadena, int i) {
		
		if(i == cadena.length())
			return 0;
		else {
			char c = cadena.charAt(i);
			return calcularNumeroVocales(cadena, ++i) + ("AEIOUaeiou".indexOf(c) >= 0 ? 1 : 0);
		}
	}
}
