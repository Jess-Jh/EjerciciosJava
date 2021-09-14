package recursividad.ejemplos;

public class Ej_02_VerificarParesDivideVenceras {
	
	public static void main(String[] args) {
		
		int[] arreglo = { 9, 3, 7, 3, 4 };
		int posI = 0;
		int posF = arreglo.length-1;

		int flag = verificarParDivideVenceras(arreglo, posI, posF);
		
		if( flag == -1 ) System.out.println("No hay número par");
		
		else System.out.println("Hay número par");
		
		//-------------------------------------------------------------------------------->
		
		System.out.println();
		System.out.println("Método dos");
		
		boolean flag2 = verificarParDivideVenceras2(arreglo, posI, posF);
		
		if( flag2 == false ) System.out.println("No hay número par");
		
		else System.out.println("Hay número par");
	}

	/**
	 * Verificar si en un arreglo existen números pares por medio de recursividad, divide y vencerás
	 * @param arreglo, posI, posF
	 * @return
	 */
	private static int verificarParDivideVenceras(int[] arreglo, int posI, int posF) {
		
		if( posI == posF ) return arreglo[posI];
		
		else {
			int mitad = (posI + posF) / 2; 
			
			int izquierda = verificarParDivideVenceras(arreglo, posI, mitad);
			int derecha = verificarParDivideVenceras(arreglo, mitad+1, posF);
			
			if( izquierda % 2 == 0 ) return izquierda;
			
			if( derecha % 2 == 0 ) return derecha;
		}
		return -1;
	}
	
	/**
	 * Método 2 verificar pares divide y vencerás
	 * @param arreglo, posI, posF
	 * @return
	 */
	private static boolean verificarParDivideVenceras2(int[] arreglo, int posI, int posF) {
		
		if( posI == posF ) 
			return arreglo[posI] % 2 == 0;
		else 
			return verificarParDivideVenceras2(arreglo, posI, (posI + posF)/2) || verificarParDivideVenceras2(arreglo, ((posI + posF)/2)+1, posF);
	}
}
