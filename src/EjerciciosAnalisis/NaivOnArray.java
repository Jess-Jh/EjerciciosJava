package EjerciciosAnalisis;

public class NaivOnArray {
	public static void main(String[] args) {
		
		int[] cantidad = {512, 1024, 2048};
		
		for (int i = 0; i < cantidad.length; i++) {
			
			long inicio = System.currentTimeMillis();
			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] c = new double[cantidad[i]][cantidad[i]];
			
			EjecutarNaivOnArray(a, b, c, a.length, a[0].length);
			
			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecucion con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
	}
	
    public static double[][] EjecutarNaivOnArray(double[][] A, double[][] B, double[][] C, int M, int N) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
}
