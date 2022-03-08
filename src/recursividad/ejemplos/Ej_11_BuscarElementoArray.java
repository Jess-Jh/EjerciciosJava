package recursividad.ejemplos;

public class Ej_11_BuscarElementoArray {

	public static void main(String[] args) {

//		int[] array = {4, 78, 12, 3, 89, 0, 2};
//		int elem = 12;
//		
//		int posElemEncontrado = buscarElementoArray(array, 0, elem);
		
		
//		if(posElemEncontrado == -1)
//			System.out.println("El número " + elem + " no se encuentra en el arreglo");
//		else
//			System.out.println("Se encontró el número " + elem + " en la posición " + posElemEncontrado + " del arreglo.");
		
		String[] cadenas = {"ASFFGH", "DFIGJH", "JFIREU", "AASDSS"};
		
		System.out.println( buscarCaracteresArray(cadenas, 0, 'A', 0) );
	}
	
	/**
	 * Buscar un elemento dentro de un arreglo de forma recursiva
	 * @param array, indice, elem
	 * @return
	 */
	public static int buscarElementoArray(int[] array, int i, int elem) {
		
		if(i == array.length || array[i] == elem) {
			
			if(i == array.length) return -1;
			else return i;
			
		} else {
			return buscarElementoArray(array, ++i, elem);
		}
	}
	
	
	public static int buscarCaracteresArray(String[] array, int i, char elem, int contChar) {

		if(i != array.length) {
						
			int cont = buscarElementoString(array[i], 0, elem);
			
			if( cont == 1 ) return buscarCaracteresArray(array, ++i, elem, ++contChar);	
			else return buscarCaracteresArray(array, ++i, elem, contChar);	
		}
		return contChar;
	}

	private static int buscarElementoString(String cadena, int i, char elem) {
		
		if(i != cadena.length()) {
			
			if( cadena.charAt(i) == elem ) {
				return 1;
			} else {
				return buscarElementoString(cadena, ++i, elem);
			}
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
