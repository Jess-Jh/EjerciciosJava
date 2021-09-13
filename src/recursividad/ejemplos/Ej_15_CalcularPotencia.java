package recursividad.ejemplos;

public class Ej_15_CalcularPotencia {

	public static void main(String[] args) {
		
		int base = 3;
		int potencia = -5;
		
		System.out.println(calcularPotencia(base, potencia));
	}
	
	/**
	 * Método recursivo para calcular la potencia de un número
	 * @param base
	 * @param potencia
	 * @return
	 */
	public static double calcularPotencia(int base, int potencia) {
		if(potencia == 0) 
			return 1;
		else if (potencia == 1) 
			return base;
		else if(potencia < 0) 
			return calcularPotencia(base, potencia + 1) / base;
		else 
			return base * calcularPotencia(base, potencia - 1);
	}
}
