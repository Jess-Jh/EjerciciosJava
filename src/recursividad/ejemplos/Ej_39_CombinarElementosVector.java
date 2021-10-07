package recursividad.ejemplos;

public class Ej_39_CombinarElementosVector {

	public static void main(String[] args) {

		int[] vector = {2, 1, 8, 7};
		String[] vectorElementos = new String[12];
		
		combinacionElementosVector(vector, vectorElementos, 0, 0, 0);
		for (int i = 0; i < vectorElementos.length; i++) 
			System.out.print(vectorElementos[i] + " ");
	}
	
	/**
	 * Método recursivo para realizar cobinaciones numéricas de 2 elementos
	 * @param vector, vectorElementos, i, j
	 * @return
	 */
	public static String combinacionElementosVector(int[] vector, String[] vectorElementos, int i, int j, int k) {
		
		if(i <= vector.length-1 && j <= vector.length-1) {
	
			if(i == j) {
				j++;
				if(j > vector.length-1)
					return "";
			}
			String aux = vector[i] + "" + vector[j];
			vectorElementos[k] = aux;
			return combinacionElementosVector(vector, vectorElementos, i, j + 1, k + 1);
		} else
			return combinacionElementosVector(vector, vectorElementos, i + 1, 0, k);
	}
}
