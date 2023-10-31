package EjerciciosAnalisis;

public class NaivLoopUnrollingTwo {
	public static void main(String[] args) {
		
		int[] cantidad = {512, 1024, 2048};
		
		for (int i = 0; i < cantidad.length; i++) {
			
			long inicio = System.currentTimeMillis();
			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] c = new double[cantidad[i]][cantidad[i]];
			
			ejecutarNaivLoopUnrollingTwo(a, b, c, a.length, a[0].length, b[0].length);
			
			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecucion con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
	}
	
    public static void ejecutarNaivLoopUnrollingTwo(double[][] A, double[][] B, double[][] Result, int N, int P, int M) {
    	
    	int i, j, k;
    	double aux;
    	
        if (P % 2 == 0) {
        	
            for (i = 0; i < N; i++) {
                for (j = 0; j < M; j++) {
                	aux = 0;
                    for (k = 0; k < P; k += 2) {
                    	aux += A[i][k]*B[k][j] + A[i][k+1]*B[k+1][j];
                    }
                    Result[i][j] = aux;
                }
            }
            
        } else {
        	
            int PP = P - 1;
            for (i = 0; i < N; i++) {
                for (j = 0; j < M; j++) {
                    aux = 0;
                    for (k = 0; k < PP; k += 2) {
                    	aux += A[i][k]*B[k][j] + A[i][k+1]*B[k+1][j];

                    }
                    Result[i][j] = aux + A[i][PP] * B[PP][j];
                }
            }
        }
    }
}
