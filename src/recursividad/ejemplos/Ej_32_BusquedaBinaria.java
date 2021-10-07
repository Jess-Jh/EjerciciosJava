package recursividad.ejemplos;

import java.util.Arrays;

public class Ej_32_BusquedaBinaria {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int posicionElemento = busquedaBinaria(array, 4, 0, array.length-1);
		System.out.println("La posición en la que se encuentra el número es la " + posicionElemento);
		
		// Algoritmo existente
		System.out.println(Arrays.binarySearch(array, 4));
	}
	
	/**
	 * Método recursivo para realizar una búsqueda binaria
	 * @param array, numero, inicio, fin
	 * @return
	 */
	public static int busquedaBinaria(int[] array, int numero, int inicio, int fin) {
		
		int centro = (inicio + fin) / 2;
		
		if(fin < inicio) return -1;

		if(numero == array[centro]) return centro;
		
		if(numero < array[centro]) return busquedaBinaria(array, numero, inicio, centro - 1);
		
		if(numero > array[centro]) return busquedaBinaria(array, numero, centro + 1, fin);
		
		return -1;
	}
}
