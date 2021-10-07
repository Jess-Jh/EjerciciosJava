package recursividad.ejemplos;

public class Ej_38_CalcularSumaSerie {

	public static void main(String[] args) {
		
		double sumaSerie = calcularSumaSerie(7, 1);
		System.out.println("El resultado de la suma de la serie es " + sumaSerie);
	}
	
	/**
	 * Método recursivo para calcular la suma de la serie 1 + 4 + 9 + 16 + 25 + ··· + n2
	 * @param n
	 * @return
	 */
	public static int calcularSumaSerie(int n, int i) {
		
		return (i <= n) ? (int) (calcularSumaSerie(n, i+1) + Math.pow(i, 2)) : 0;
	}

}
