package recursividad.ejemplos;

public class Ej_16_SumarDiagonalPrincipalMatriz {

	public static void main(String[] args) {

		int[][] matriz = {{2, 2, 3},
						  {4, 6, 6},                           
						  {7, 8, 9}};
		int sumaDiagonal = sumarDiagonalMatriz(matriz, 0, 0);
		
		int sumaDiagonal2 = sumarDiagonalMatriz2(matriz, matriz.length-1);
		
		System.out.println("El resultado de la suma de la diagonal es " + sumaDiagonal);
	}
	
	/**
	 * Método recursivo para sumar la diagonal principal de una matriz
	 * @param matriz, i, j
	 * @return
	 */
	public static int sumarDiagonalMatriz(int[][] matriz, int i, int j) {
		
		int sumaDiagonalPrincipal = 0;
		
		if(i == j) sumaDiagonalPrincipal += matriz[i][j];
		
		if(i != matriz.length-1 || j != matriz[i].length-1) {
			
			if(j == matriz[i].length-1) {
				i++;
				j = 0;
			} else {
				j++;
			}
			return sumarDiagonalMatriz(matriz, i, j) + sumaDiagonalPrincipal;
		}
		return sumaDiagonalPrincipal;
	}
	
	/**
	 * Segundo Método recursivo para sumar la diagonal principal de una matriz
	 * @param matriz, i
	 * @return
	 */
	public static int sumarDiagonalMatriz2(int[][] matriz, int i) {
		
		if(i == 0) 
			return matriz[i][i];
		else 
			return matriz[i][i] + sumarDiagonalMatriz2(matriz, --i);	
	}
}
