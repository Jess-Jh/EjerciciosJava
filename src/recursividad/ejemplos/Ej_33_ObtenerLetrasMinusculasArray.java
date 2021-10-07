package recursividad.ejemplos;

public class Ej_33_ObtenerLetrasMinusculasArray {

	public static void main(String[] args) {
		char[] array = {'a', 'B', 'c', 'D', 'd', 'e', 'f', 'g', 'H'};
		char[] letrasMinusculas = new char[9];
		
		obtenerCaracteresLetrasMinusculas(array, letrasMinusculas, 0, 0);
				
		for (int i = 0; i < letrasMinusculas.length; i++) 
			System.out.print(letrasMinusculas[i] + " ");
		
	}
		
	/**
	 * Método recursivo para obtener todas las letras minúsculas de un arreglo
	 * @param array, letrasMinusculas, i
	 * @return
	 */
	public static void obtenerCaracteresLetrasMinusculas(char[] array, char[] letrasMinusculas,  int i, int j) {
		
		if(i < array.length) {
			
			if(array[i] >= 97 && array[i] <= 122) {
				letrasMinusculas[j] = array[i];
			    obtenerCaracteresLetrasMinusculas(array, letrasMinusculas, i+1, j+1);
			} else {				
				obtenerCaracteresLetrasMinusculas(array, letrasMinusculas, i + 1, j);
			}
		}
	}
}
