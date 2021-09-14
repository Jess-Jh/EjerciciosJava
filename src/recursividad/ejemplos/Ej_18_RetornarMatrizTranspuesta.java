package recursividad.ejemplos;

public class Ej_18_RetornarMatrizTranspuesta {

	public static void main(String[] args) {
		
		int m = 2, n = 4, i = 0, j = 0;
		
		int matrizA[][] = { {1, 3, 5, 7},
							{2, 4, 6, 8}};

		int matrizTranspuesta[][] = new int[n][m];
		retornarMatrizTranspuesta(matrizA, matrizTranspuesta, i, j);
				
		System.out.println("Matriz Transpuesta: \n");
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
	    	  System.out.print(matrizTranspuesta[i][j] + " ");
	      System.out.print("\n");
	    }
	}
	
	/**
	 * Retorna la transpuesta de una matriz
	 * @param matrizA, matrizTranspuesta, i, j
	 */
	public static void retornarMatrizTranspuesta(int[][] matrizA, int[][] matrizTranspuesta, int i, int j) {

		if(i <= matrizA.length-1 && j <= matrizA[i].length-1) {
					
			if(j == matrizA[i].length-1) {
				matrizTranspuesta[j][i] = matrizA[i][j];	
				i++;
				j = 0;
			} else {
				matrizTranspuesta[j][i] = matrizA[i][j];	
				j++;
			}
			retornarMatrizTranspuesta(matrizA, matrizTranspuesta, i, j);
		}
	}

}
