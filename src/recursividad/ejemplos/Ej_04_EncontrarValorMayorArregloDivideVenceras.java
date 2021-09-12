package recursividad.ejemplos;

public class Ej_04_EncontrarValorMayorArregloDivideVenceras {

	public static void main(String[] args) {

		int[] arreglo = {5, 13, 7, 9, 8, 1, 11};
		int posI = 0;
		int posF = arreglo.length-1;		
		
		int mayor = encontrarValorMayorArregloDivideVenceras(arreglo, posI, posF);
		
		System.out.println("El número mayor del arreglo es " + mayor);
	}

	/**
	 * Método recursivo para encontrar el número mayor en un arreglo por medio de divide y vencerás
	 * @param arreglo, posI, posF
	 * @return
	 */
	private static int encontrarValorMayorArregloDivideVenceras(int[] arreglo, int posI, int posF) {
		
		if(posI == posF) return arreglo[posI];
		
		else {
			int mitad = (posI + posF) / 2;
			
			int izquierda = encontrarValorMayorArregloDivideVenceras(arreglo, posI, mitad);
			int derecha = encontrarValorMayorArregloDivideVenceras(arreglo, ++mitad, posF);
			
			if(izquierda > derecha) return izquierda;
			
			else return derecha;
		}	
	}
}
