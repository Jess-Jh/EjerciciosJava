package recursividad.ejemplos;

public class Ej_12_RecorrerMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};
		
		recorrerMatriz(matriz, 0, 0);
	}

	/**
	 * Recorrer una matriz de forma recursiva
	 * @param matriz, i, j
	 */
	public static void recorrerMatriz(int[][] matriz, int i, int j) {
		
		System.out.print(matriz[i][j] + " ");
		
		if(i != matriz.length-1 || j != matriz[i].length-1) {
			
			//verifico si llegó al final de la fila
			if(j == matriz[i].length-1) {
				//Paso a la siguiente fila
				i++;
				//Reinicio j
				j = 0;
				System.out.println();
			} else {
				//Paso a la siguiente columna
				j++;
			}
			recorrerMatriz(matriz, i, j);
		}
	}
}
