package recursividad.ejemplos;

public class Ej_40_CrearCadenaVocalesConsonantes {

	public static void main(String[] args) {
		System.out.println(cadenaVocalesConsonantes("elefante", 0, 0));
	}
	
	/**
	 * Método recursivo para tomar una cadena y crear una nueva que contenga primero las vocales
	 * y luego las consonantes
	 * @param cadena, v, c
	 * @return
	 */
	public static String cadenaVocalesConsonantes(String cadena, int v, int c) {
		
		if(v <= cadena.length()-1) {
			char vocal = cadena.charAt(v);
			
			if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ||
				vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U')
				
				return cadena.charAt(v) + cadenaVocalesConsonantes(cadena, v + 1, c);	
			else 
				return cadenaVocalesConsonantes(cadena, v + 1, c);			
			
		} else if (c <= cadena.length()-1) {
			char caracter = cadena.charAt(c);
			
			if(!(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
					caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'))
				
				return cadena.charAt(c) + cadenaVocalesConsonantes(cadena, v, c + 1);			
			else
				return cadenaVocalesConsonantes(cadena, v, c + 1);	
		}
		return "";
	}

}
