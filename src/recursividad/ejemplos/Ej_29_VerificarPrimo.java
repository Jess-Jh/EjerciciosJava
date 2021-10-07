package recursividad.ejemplos;

public class Ej_29_VerificarPrimo {

	public static void main(String[] args) {

		System.out.println(esNumeroPrimo(71, 2));
	}
	
	/**
	 * Método recursivo para determinar si un número es primo o no
	 * @param primo
	 * @param divisor
	 * @return
	 */
	public static boolean esNumeroPrimo(int n, int divisor) {
		
	   if(n/2 < divisor) return true;
	   
       else {
            if(n % divisor == 0) return false;
            
            else return esNumeroPrimo(n, divisor + 1);
        }
	}
}
