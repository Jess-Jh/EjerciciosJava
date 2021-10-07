package recursividad.ejemplos;

public class Ej_31_RetornarConsonantes {

	public static void main(String[] args) {
		
		String cadena = "ingeniería de sistemas";
		System.out.println(devolverConsonantes(cadena, "", cadena.length()-1 ));
	}
	
	/**
	 * Método recursivo que retorna las consonantes de una cadena
	 * @param cadena, consonantes, n
	 * @return
	 */
	public static String devolverConsonantes(String cadena, String consonantes, int n) {
				
		char caracter = cadena.charAt(n);
		
		if(n == 0) return consonantes;
		
		if(caracter != 'a' && caracter != 'e' && caracter != 'é' && caracter != 'i' && caracter != 'í' && caracter != 'o' && caracter != 'ó' && caracter != 'u' && caracter != 'ú' 
			&& caracter != 'A' && caracter != 'Á' && caracter != 'E' && caracter != 'É' && caracter != 'I' && caracter != 'Í' && caracter != 'O' && caracter != 'Ó' && caracter != 'U' && caracter != 'Ú')
			
			return devolverConsonantes(cadena, consonantes, n - 1) + cadena.charAt(n);
		else 
			return devolverConsonantes(cadena, consonantes, n - 1);
	}
}
