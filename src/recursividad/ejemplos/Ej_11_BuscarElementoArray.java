package recursividad.ejemplos;

public class Ej_11_BuscarElementoArray {

	public static void main(String[] args) {

		int[] array = {4, 78, 12, 3, 89, 0, 2};
		int elem = 12;
		
		int posElemEncontrado = buscarElementoArray(array, 0, elem);
		
		if(posElemEncontrado == -1)
			System.out.println("El número " + elem + " no se encuentra en el arreglo");
		else
			System.out.println("Se encontró el número " + elem + " en la posición " + posElemEncontrado + " del arreglo.");
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
}
