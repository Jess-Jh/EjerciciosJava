package EjerciciosAnalisis;

public class NaivStandard {
	public static void main(String[] args) {
		Integer[] cantidad = {512, 1024, 2048};
		
		for (int i = 0; i < cantidad.length; i++) {
			
			long inicio = System.currentTimeMillis();
			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] c = new double[cantidad[i]][cantidad[i]];
			
//			double[][] a = {
//				    {3, 5, 6},
//				    {7, 6, 2},
//				    {8, 4, 5}
//				};
//			double[][] b = {
//				    {4, 5, 8},
//				    {1, 6, 7},
//				    {9, 3, 0}
//				};
//			double[][] c = new double[3][3];
			
			EjecutarNaivStandard(a, b, c, a.length, a[0].length, b[0].length);
			
			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecucion con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
		
	}
	
	public static void EjecutarNaivStandard(double[][] A, double[][] B, double[][] C, Integer N, double P, Integer M) {
	    for (int i = 0; i < N; i++) {
	        for (int j = 0; j < M; j++) {
	            double aux = 0.0;
	            for (int k = 0; k < P; k++) {
	                aux += A[i][k] * B[k][j];
	            }
	            C[i][j] = aux;
	        }
	    }
//	    for (int i = 0; i < C.length; i++) {
//	    	for (int j = 0; j < C[i].length; j++) {
//	    		System.out.print(C[i][j] + " ");
//	    	}
//	    	System.out.println(); // Salto de línea después de cada fila
//	    }
	}
	
}
