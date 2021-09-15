package recursividad.ejemplos;

public class Ej_21_CalcularNormaVector {

	public static void main(String[] args) {

		int[] vector = {3, 2, 8, 6, 5};
		double resultNorma = calcularNormaVector(vector, 0);
		
		System.out.println("La norma del vector es " + resultNorma);
	}
	
	/**
	 * Método recursivo para calcular la norma de un vector
	 * @param vector
	 * @param i
	 * @return
	 */
	public static double calcularNormaVector(int[] vector, int i) {
		
		if(i == vector.length-1)
			return vector[i] * vector[i];
		
		if(i == 0)
			return Math.sqrt(calcularNormaVector(vector, i + 1) + vector[i] * vector[i]);	
		else 
			return calcularNormaVector(vector, i + 1) + vector[i] * vector[i];	
	}
}
