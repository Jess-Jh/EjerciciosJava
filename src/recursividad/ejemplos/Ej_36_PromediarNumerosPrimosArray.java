package recursividad.ejemplos;

public class Ej_36_PromediarNumerosPrimosArray {

	public static void main(String[] args) {

		int[] arreglo = {3, 4, 11, 5, 8, 7, 13};
		double promedioArreglo = promediar(arreglo, 0, 0, 0);
		
		System.out.println("El promedio de los números primos del arreglo es de " + promedioArreglo);
	}
	
	/**
	 * Método recursivo para obtener el promedio de todos los números primos que hay en un arreglo
	 * @param arreglo, i, contPrimos, sumaPrimos
	 * @return
	 */
	public static double promediar(int[] arreglo, int i, int contPrimos, double sumaPrimos) {
		
		if(i == arreglo.length) {
			return sumaPrimos / contPrimos;
			
		} else {
			if(esNumeroPrimo(arreglo[i], 2)) {
				contPrimos++;
				sumaPrimos += arreglo[i];
				return promediar(arreglo, i + 1, contPrimos, sumaPrimos);
			} else {
				return promediar(arreglo, i + 1, contPrimos, sumaPrimos);
			}
		}
	}
	
	/**
	 * Método recursivo para determinar si un número es primo o no
	 * @param primo
	 * @param divisor
	 * @return
	 */
	public static boolean esNumeroPrimo(int n, int divisor) {
		
	   if(n/2 < divisor){
            return true;
        } else {
            if(n % divisor == 0){
                return false;
            } else {
                return esNumeroPrimo(n, divisor + 1);
            }
        }
	}

}
