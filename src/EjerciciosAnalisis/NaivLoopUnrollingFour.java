package EjerciciosAnalisis;

public class NaivLoopUnrollingFour {
	public static void main(String[] args) {
		int[] cantidad = { 512, 1024, 2048 };

		for (int i = 0; i < cantidad.length; i++) {
			long inicio = System.currentTimeMillis();
//			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
//			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
//			double[][] c = new double[cantidad[i]][cantidad[i]];
			
			double[][] a = { { 3, 5, 6, 0, 1,5}, { 7, 6, 2, 0 ,2,6}, { 8, 4, 5, 0,3,7 }, {0, 0,0,0,0,0} };
			double[][] b = { { 4, 5, 8,0 , 1,5}, { 1, 6, 7,0,2,6 }, { 9, 3, 0,0,3,7 },{0,0,0,0,0,0} };
			double[][] c = new double[6][6];

			ejecutarNaivLoopUnrollingFour(a, b, c, a.length, a[0].length, b[0].length);

			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecucion con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
	}

	public static void ejecutarNaivLoopUnrollingFour(double[][] A, double[][] B, double[][] Result, int N, int P, int M) {

		int i, j, k;
		double aux = 0;

		if (P % 4 == 0) {
			for (i = 0; i < N; i++) {
				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < P; k += 4) {
						aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j]
								+ A[i][k + 3] * B[k + 3][j];
					}
					Result[i][j] = aux;
				}
			}
		} else if (P % 4 == 1) {

			int PP = P - 1;
			for (i = 0; i < N; i++) {
				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < PP; k += 4) {
						aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j]
								+ A[i][k + 3] * B[k + 3][j];
					}
					Result[i][j] = aux + A[i][PP] * B[PP][j];
				}
			}
		} else if (P % 4 == 2) {

			int PP = P - 2;
			int PPP = P - 1;
			for (i = 0; i < N; i++) {
				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < PP; k += 4) {
						aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j]
								+ A[i][k + 3] * B[k + 3][j];
					}
					Result[i][j] = aux + A[i][PP] * B[PP][j] + A[i][PPP] * B[PPP][j];
				}
			}
		} else {
			int PP = P - 3;
			int PPP = P - 2;
			int PPPP = P - 1;

			for (i = 0; i < N; i++) {

				for (j = 0; j < M; j++) {
					aux = 0.0;
					for (k = 0; k < PP; k += 4) {

					}
					aux += A[i][k] * B[k][j] + A[i][k + 1] * B[k + 1][j] + A[i][k + 2] * B[k + 2][j]
							+ A[i][k + 3] * B[k + 3][j];
				}
				Result[i][j] = aux + A[i][PP] * B[PP][j] + A[i][PPP] * B[PPP][j] + A[i][PPPP] * B[PPPP][j];
			}
		}
	}
}
