package recursividad.ejemplos;

public class Ej_19_SumarDosMatrices {

	public static void main(String[] args) {
		
		int[][] matrizA = {{5, 2, 2},{2, 8, 3},{2, 3, 9}};
		int[][] matrizB = {{4, 2, 6},{9, 8, 3},{4, 3, 9}};
		
		int resulSuma = sumarDosMatrices(matrizA, matrizB, matrizA.length-1, matrizA.length-1);
		System.out.println("El total de la suma de las dos matrices es " + resulSuma);
	}
	
	/**
	 * Método recursivo para sumar dos matrices cuadradas
	 * @param matrizA
	 * @param matrizB
	 * @return
	 */
	public static int sumarDosMatrices(int[][] matrizA, int[][] matrizB, int i, int j) {
						
		if(i == 0 && j == 0)
			return matrizA[i][j] + matrizB[i][j];
		
		else {
			if(i >= -1) {
				j--;
				if(j >= -1)
					return sumarDosMatrices(matrizA, matrizB, i, j) + matrizA[i][j+1] + matrizB[i][j+1];
				else
					return sumarDosMatrices(matrizA, matrizB, i-1, matrizA[i].length-1);
			}
			else return 0;
		}
	}
}
