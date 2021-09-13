package recursividad.ejemplos;

public class Ej_09_ContarNumeroApariciones {

	public static void main(String[] args) {

		int vector[] = {3, 6, 3, 21, 5, 8, 6, 109, 3, 3, 3};
		int elem = 3;
		int numApariciones = contarNumeroApariciones(vector, 0, vector.length, elem);
		
		System.out.println("El número " + elem + " aparece " + numApariciones + " veces.");
	}

	/**
	 * Método recursivo para contar el número de veces que aparece un elemento en el arreglo
	 * @param vector, inicio, fin, elem
	 * @return
	 */
	public static int contarNumeroApariciones(int vector[], int inicio, int fin, int elem) {
		
		if(inicio < fin) {
			if(elem == vector[inicio])
				return contarNumeroApariciones(vector, ++inicio, fin, elem) + 1;
			else
				return contarNumeroApariciones(vector, ++inicio, fin, elem);
		}
		return 0;
	}
}
