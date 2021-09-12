package recursividad.ejemplos;

public class Ej_08_SumarCifrasNumero {

	public static void main(String[] args) {
		int n = 34219;
		
		int cantSuma = sumarCifrasNumero(n);
		System.out.println("El total de la suma de las cifras del número es " + cantSuma);
	}
	
	/**
	 * Método recursivo para sumar las cifras de un número
	 * @param n
	 * @return
	 */
	public static int sumarCifrasNumero(int n) {
		
		if(n == 0) return 0;
		else return sumarCifrasNumero(n / 10) + n % 10;
	}
}
