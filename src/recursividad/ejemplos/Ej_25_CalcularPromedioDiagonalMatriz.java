package recursividad.ejemplos;

public class Ej_25_CalcularPromedioDiagonalMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = {{2, 2, 3, 4},
						  {4, 8, 6, 6},                           
						  {4, 8, 6, 6},                           
						  {7, 8, 9, 6}};
		System.out.println(promedioDiagonalMatrizCuadrada(matriz, 0, matriz.length-1));
	}
	
	/**
	 * Método recursivo para hallar el promedio de la diagonal de una matriz cuadrada
	 * @param matriz, i, c
	 * @return
	 */
	public static double promedioDiagonalMatrizCuadrada(int[][] matriz, int i, int f) {
		
		if(i == f) return matriz[i][i];
		
		if(i == 0) return (matriz[i][i] + promedioDiagonalMatrizCuadrada(matriz, i + 1, f)) / matriz[i].length;	
		
		else return (matriz[i][i] + promedioDiagonalMatrizCuadrada(matriz, i + 1, f));	
	}
}
