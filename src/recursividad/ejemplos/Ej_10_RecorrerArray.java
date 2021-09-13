package recursividad.ejemplos;

public class Ej_10_RecorrerArray {

	public static void main(String[] args) {
		
		int[] array = {4, 78, 12, 3, 89, 0, 2};
		recorrerArray(array, 0);
	}
	
	/**
	 * Método para recorrer un arreglo de forma recursiva
	 * @param array
	 * @return
	 */
	public static void recorrerArray(int[] array, int indice) {
		
		if(indice != array.length) {
			System.out.println(array[indice]);
			recorrerArray(array, ++indice);
		}
		
	}

}
