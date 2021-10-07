package recursividad.ejemplos;

public class Ej_35_CalcularSerie {

	public static void main(String[] args) {

		double resultadoSerie = calcularSerie(4, 1);
		System.out.println(resultadoSerie);
	}
	
	/**
	 * Método recursivo para calcular la serie 1-½+ 1/3 – 1/4+ 1/5 +….+1/n
	 * @param n, i
	 * @return
	 */
	public static double calcularSerie(int n, int i) {
		
		if(i <= n) {
			if(i % 2 == 0)
				return calcularSerie(n, i+1) - 1.0/i;
			else
				return calcularSerie(n, i+1) + 1.0/i;
		}
		return 0;
	}
}
