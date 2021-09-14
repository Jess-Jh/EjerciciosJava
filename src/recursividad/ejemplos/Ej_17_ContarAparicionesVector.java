package recursividad.ejemplos;

public class Ej_17_ContarAparicionesVector {

	public static void main(String[] args) {
		
		int vector[] = {3, 6, 3, 21, 5, 8, 6, 109, 3, 3, 9};
		int inicio = 0;
		int fin = vector.length;	
		int elem = 3;
		
		int numApariciones = contarNumeroAparicionesVector(vector, inicio, fin, elem);
		System.out.println("El número de veces que aparece el número " + elem + " en el vector es de " + numApariciones );
	}
	
	/**
	 * Contar el número de veces que aparece un elemento en el arreglo
	 * @param vector, inicio, fin, elem
	 * @return
	 */
	public static int contarNumeroAparicionesVector(int vector[], int inicio, int fin, int elem) {
		
		if(inicio < fin) {
			if(elem == vector[inicio])
				return contarNumeroAparicionesVector(vector, inicio + 1, fin, elem) + 1;
			else
				return contarNumeroAparicionesVector(vector, inicio + 1, fin, elem);
		}
		return 0;
	}
}
