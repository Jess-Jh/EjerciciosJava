package recursividad.ejemplos;

public class Ej_07_EncontrarNumeroMenorArreglo {
	
	public static void main(String[] args) {
		
		int arreglo[] = {3, 6, 18, 21, -5, 2, 9, -109};
		int inicio = 0;
		int fin = arreglo.length-1;
		
		int numeroMenor = encontrarNumeroMenorArreglo(arreglo, inicio, fin);
		System.out.println("El número menor del arreglo es " + numeroMenor);
	}

	/**
	 * Método recursivo para encontrar el número menor de un arreglo
	 * @param arreglo, inicio, fin
	 * @return
	 */
	public static int encontrarNumeroMenorArreglo(int[] arreglo, int inicio, int fin) {
		
		if(inicio == fin)
			return arreglo[fin];
		
		if(arreglo[inicio] > arreglo[fin])
			return encontrarNumeroMenorArreglo(arreglo, ++inicio, fin);
		else 
			return encontrarNumeroMenorArreglo(arreglo, inicio, --fin);	
	}

}
