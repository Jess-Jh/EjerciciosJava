package recursividad.ejemplos;

public class Ej_14_SumarElementosMatriz {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		int i = 0;
		int j = matriz[i].length-1;
		
		System.out.println("La suma de los elementos de la matriz es : " + sumarElementosMatriz(matriz, i, j));
	}
	
	/**
	 * Método recursivo para sumar todos los elementos de una matriz
	 * @param matriz, i, j
	 * @return
	 */
	public static int sumarElementosMatriz(int[][] matriz, int i, int j) {
		
		if (i != matriz.length-1 || j >= 0) {

			if (j >= 0) {
				return sumarElementosMatriz(matriz, i, j-1) + matriz[i][j];
			} else {
				i++;
				j = matriz[i].length-1;
				return sumarElementosMatriz(matriz, i, j);
			}
		} else 
			return 0;
	}
}
