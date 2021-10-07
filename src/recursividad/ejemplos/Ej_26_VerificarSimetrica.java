package recursividad.ejemplos;

public class Ej_26_VerificarSimetrica {

	public static void main(String[] args) {
		int[][] matriz = {{5, 2, 2},
				          {2, 8, 3},                                                      
				          {2, 3, 9}};
		System.out.println(esSimetrica(matriz, 1, 0));
	}
	
	/**
	 * Método recursivo para determinar si una matriz es o no simétrica 
	 * @param matriz
	 * @return
	 */
	public static boolean esSimetrica(int[][] matriz, int i, int j) {
		
		 if (i < matriz.length && j < i) {
	        if (matriz[i][j] == matriz[j][i]) {
	        	
	            if (j == i - 1) return esSimetrica(matriz, i + 1, 0);
	            
	            else return esSimetrica(matriz, i, j + 1);
	            
	        } else {
	            // encuentra la primer desigualdad, no es simétrica
	            return false;
	        }
	    } else {
	        // Si llega hasta aquí, es simétrica
	        return true;
	    }
	}
}
