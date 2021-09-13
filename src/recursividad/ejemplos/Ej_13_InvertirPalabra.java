package recursividad.ejemplos;

public class Ej_13_InvertirPalabra {

	public static void main(String[] args) {

		String palabra = "Murciélago";
		String palabraInvertida = invertirPalabra(palabra, palabra.length()-1);
		
		System.out.println(palabraInvertida);
	}
	
	/**
	 * Método recursivo para invertir una palabra
	 * @param palabra, longitud
	 * @return
	 */
	public static String invertirPalabra(String palabra, int longitud) {
	
		if(longitud == 0) 
			return palabra.charAt(longitud) + "";
		else 
			return palabra.charAt(longitud) + invertirPalabra(palabra, --longitud);
	}
}
