package EjerciciosAnalisis;

public class NaivKahan {
	public static void main(String[] args) {
		int[] cantidad = {512, 1024, 2048};
		
		for (int i = 0; i < cantidad.length; i++) {
			
			long inicio = System.currentTimeMillis();
			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] c = new double[cantidad[i]][cantidad[i]];
			
//			double[][] a = {
//		    {3, 5, 6},
//		    {7, 6, 2},
//		    {8, 4, 5}
//		};
//	double[][] b = {
//		    {4, 5, 8},
//		    {1, 6, 7},
//		    {9, 3, 0}
//		};
//	double[][] c = new double[3][3];
			
			EjecutarNaivKahan(a, b, c, a.length, a[0].length, b[0].length);
			
			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecucion con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
	}
	
    public static void EjecutarNaivKahan(double[][] A, double[][] B, double[][] C, int N, int M, int P) {
    	
    	double temp, sum, err;
    	
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
            	
            	sum = 0;
                err = 0;
               
                for (int k = 0; k < M; k++) {
                	err = err + A[i][k] * B[k][j];
                	temp = sum + err;
                	err = (sum - temp) + err;
                	sum = temp;
                }
                
                C[i][j] = sum;
            }
        }
        
//	    for (int i = 0; i < C.length; i++) {
//    	for (int j = 0; j < C[i].length; j++) {
//    		System.out.print(C[i][j] + " ");
//    	}
//    	System.out.println(); // Salto de línea después de cada fila
//    }
    }
}
