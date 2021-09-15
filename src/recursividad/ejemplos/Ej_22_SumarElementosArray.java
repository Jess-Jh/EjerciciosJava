package recursividad.ejemplos;

public class Ej_22_SumarElementosArray {

	public static void main(String[] args) {

		int[] array = {4, 78, 12, 3, 89, 0, 2};
		System.out.println(sumarElementosArray(array, 0));
	}
	
	/**
	 * Método recursivo para sumar todos los elementos de un array
	 * @param array
	 * @param i
	 * @return
	 */
	public static int sumarElementosArray(int[] array, int i) {
		
		if(i != array.length)
			return sumarElementosArray(array, i + 1) + array[i];
		else 
			return 0;
	}
}
