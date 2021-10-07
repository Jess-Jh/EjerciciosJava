package recursividad.ejemplos;

public class Ej_37_VerificarSiEsPerfecto {

	public static void main(String[] args) {
		esPerfecto(8128);
	}
	
	/**
	 * Método recursivo para indicar si un número es perfecto o no
	 * @param n, i, suma
	 */
	public static int numeroPerfecto(int n, int i) {
				
		if(i == 0) return 1 + numeroPerfecto(n, i + 1);
		
		else if(i < n && n % i == 0) return i + numeroPerfecto(n, i + 1);
		
		else if(i < n && n % i != 0) return 0 + numeroPerfecto(n, i + 1);
		
		else return 0;	
	}
	
	public static void esPerfecto(int n){
		
	    if(n == numeroPerfecto(n, 1)) System.out.println(n + " es Número Perfecto");
	    
	    else System.out.println(n + " no es Número Perfecto");
	}

}
