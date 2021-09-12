package recursividad.ejemplos;

public class Ej_03_EncontrarValorMayorArreglo {
	
	public static void main(String[] args) {
		int[] arreglo = {5, 2, 7, 9, 8, 1, 0};
		int posI = 0;
		int posF = arreglo.length-1;		
		
		int mayor = encontrarValorMayorArreglo(arreglo, posI, posF);
		
		System.out.println("El número mayor del arreglo es " + mayor);
	}

	/**
	 * Método recursivo para encontrar el número mayor en un arreglo
	 * @param arreglo, posI, posF
	 * @return
	 */
	private static int encontrarValorMayorArreglo(int[] arreglo, int posI, int posF) {
		
		if(posI == posF)
			return arreglo[posF];
		
		if(arreglo[posI] < arreglo[posF])
			return encontrarValorMayorArreglo(arreglo, posI + 1, posF);
		else return encontrarValorMayorArreglo(arreglo, posI, posF-1);	
	}
}
