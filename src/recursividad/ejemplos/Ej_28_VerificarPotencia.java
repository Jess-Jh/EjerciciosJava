package recursividad.ejemplos;

public class Ej_28_VerificarPotencia {

	public static void main(String[] args) {
		
		System.out.println(esPotencia(4096, 8, 1));
	}
	
	/**
	 * Método recursivo para verificar que un número sea potencia de otro
	 * @param a, b
	 * @return
	 */
	public static boolean esPotencia(int a, int b, int aux) {
		
		if(a < aux) return false;
		
		if(a == aux) return true;
		
		else return esPotencia(a, b, aux * b);	
	}
}
