package recursividad.ejemplos;

import java.util.Arrays;

public class Ej_30_OrdenarArrayAscendenteDescendente {

	public static void main(String[] args) {
		int array[] = {64, 34, 25, 12, 22, 11, 90};

		ordenarArrayAscendente(array, array.length);
		System.out.println("Arreglo ordenado de forma Ascendente: ");
		System.out.println(Arrays.toString(array));
		
		System.out.println();

		ordenarArrayDescendente(array, array.length);
		System.out.println("Arreglo ordenado de forma Descendente: ");
		System.out.println(Arrays.toString(array));
	}

	/**
	 * Método recursivo para ordenar un array de forma descendente
	 * @param array
	 * @param n
	 */
	public static void ordenarArrayDescendente(int[] array, int n) {
		//Ordenamiento burbuja	
        if (n == 1) return;

        for (int i = 0; i < n-1; i++)
            if (array[i] < array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        ordenarArrayDescendente(array, n-1);	
	}
	
	/**
	 * Método recursivo para ordenar un array de forma ascendente
	 * @param array
	 * @param n
	 */
	public static void ordenarArrayAscendente(int[] array, int n) {
		
		//Ordenamiento burbuja
		if (n == 1) return;
		
		for (int i = 0; i < n-1; i++)
			if (array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		ordenarArrayAscendente(array, n - 1);
	}
}
