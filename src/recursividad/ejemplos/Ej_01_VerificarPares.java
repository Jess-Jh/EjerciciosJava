package recursividad.ejemplos;

public class Ej_01_VerificarPares {

	public static void main(String[] args) {
	
		int[] arreglo = {5,3,3,7};
		int pos = 0;
		boolean flag;
		
		flag = verificarExistenciaPares(arreglo, pos);
		
		if( flag ) System.out.println("Existen pares en el arreglo");
		
		else System.out.println("No existen pares en el arreglo");
	}
	
	/**
	 * Análisis
	 * Caso base 1 pos == tamaño del arrglo => No hay pares
	 * Caso base 2 si un número es par => si hay
	 * Caso recursivo  verificarExistenciaPares(arreglo, pos+1)
	 */
	

	/**
	 * Forma inicial donde se pregunta por cada caso base por separado
	 * y cada caso base tiene un valor de respuesta
	 * @param arreglo
	 * @param pos
	 */
	private static boolean verificarExistenciaPares(int[] arreglo, int pos) {

		// CB 1
		if( pos == arreglo.length ) return false;
		
		// CB 2
		if( arreglo[pos] % 2 == 0 ) return true;
		
		// Caso recursivo
		return verificarExistenciaPares(arreglo, ++pos);
	}
}
