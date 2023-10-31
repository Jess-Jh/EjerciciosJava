package EjerciciosAnalisis;

public class NaivLoopUnrollingThree {
	public static void main(String[] args) {
		int[] cantidad = { 512, 1024, 2048 };

		for (int i = 0; i < cantidad.length; i++) {

			long inicio = System.currentTimeMillis();
			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] c = new double[cantidad[i]][cantidad[i]];

			ejecutarNaivLoopUnrollingThree(a, b, c, a.length, a[0].length, b[0].length);
			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecuci�n con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
	}

	public static void ejecutarNaivLoopUnrollingThree(double[][] A, double[][] B, double[][] Result, int N, int P, int M) {

		int i, j, k;
		double aux;
		
		if (P % 3 == 0) {
			for (i = 0; i < N; i++) {
				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < P; k += 3) {
						aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j];
					}
					Result[i][j] = aux;
				}
			}
		} else if (P % 3 == 1) {
			int PP = P - 1;
			for (i = 0; i < N; i++) {
				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < PP; k += 3) {
						aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j];
					}
					Result[i][j] = aux + A[i][PP] * B[PP][j];
				}
			}
		} else {
			int PP = P - 2;
			int PPP = P - 1;
			for (i = 0; i < N; i++) {
				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < PP; k += 3) {
						aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j];
					}
					Result[i][j] = aux + A[i][PP] * B[PP][j] + A[i][PPP] * B[PPP][j];
				}
			}
		}
	}
}
