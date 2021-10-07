package recursividad.ejemplos;

public class Ej_27_CalcularNumeroFilaMayorMatriz {

	public static void main(String[] args) {
		int[][] matriz = {{5, 2, 2}, //9
				          {2, 8, 3, 5, 100}, //13                                                     
				          {2, 4, 3}, //13                                                     
				          {2, 33, 9, 6}}; //14
		
		int filaMayor = numeroFilaMayorMatriz(matriz, 0, 0, 0, 0, 0);
		
		System.out.println("La fila con el mayor valor sumando sus elementos es la fila " + filaMayor);
	}
	
	/**
	 * Método recursivo para retornar el número de la fia de la matriz cuya suma de todos
	 * sus elementos sea mayor
	 * @param matriz, i, j
	 * @return
	 */
	public static int numeroFilaMayorMatriz(int[][] matriz, int i, int j, int numMayor, int sumaFila, int fila) {
						
		if(i <= matriz.length-1 && j <= matriz[i].length-1) {
			
			//verifico si llegó al final de la fila
			if(j == matriz[i].length-1) {
				sumaFila += matriz[i][j];
				
				if(sumaFila > numMayor) {
					numMayor = sumaFila;
					fila = i;
				}
				i++;
				sumaFila = 0;
				j = 0;
			} else {
				sumaFila += matriz[i][j];
				j++;
			}
			return numeroFilaMayorMatriz(matriz, i, j, numMayor, sumaFila, fila);
		} else {
			return fila;
		}
	}
}
