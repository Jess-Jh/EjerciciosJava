package recursividad.ejemplos;

public class Ej_06_ContarCerosArreglo {

	public static void main(String[] args) {
		
		int arreglo[] = { 0, 3, 2, 0, 7, 4, 0, 0 };
		int cantidadCeros = contarCerosArreglo(arreglo, 0);
		
		System.out.println("La cantidad de ceros en el arreglo es de " + cantidadCeros);
	}

	/**
	 * Método recursivo para contar la cantidad de ceros que hay en un arreglo
	 * @param arreglo
	 * @param n
	 * @return
	 */
	public static int contarCerosArreglo(int arreglo[], int n) {
				
		if(n < arreglo.length) {
			if(arreglo[n] == 0)
				return 1 + contarCerosArreglo(arreglo, ++n);
			else
				return contarCerosArreglo(arreglo, ++n);			
		}
		return 0;
	}
}
