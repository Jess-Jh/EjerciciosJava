package EjerciciosAnalisis;

public class StrassenNaiv {
	public static void main(String[] args) {

		int[] cantidad = { 512, 1024, 2048 };
		for (int i = 0; i < cantidad.length; i++) {

			long inicio = System.currentTimeMillis();
			double[][] a = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] b = NumerosAleatorios.obtener_numeros_aleatorios(cantidad[i], cantidad[i]);
			double[][] c = new double[cantidad[i]][cantidad[i]];

//			double[][] a = { { 3, 5, 6, 0 }, { 7, 6, 2, 0 }, { 8, 4, 5, 0 }, {0, 0,0,0} };
//			double[][] b = { { 4, 5, 8,0 }, { 1, 6, 7,0 }, { 9, 3, 0,0 },{0,0,0,0} };
//			double[][] c = new double[4][4];

			double[][] matriz = multiply(a, b);

//			for (int i1 = 0; i1 < matriz.length; i1++) {
//				for (int j = 0; j < matriz.length; j++) {
//					System.out.print(matriz[i1][j] + " ");
//				}
//				System.out.println();
//			}

			long fin = System.currentTimeMillis();
			long tiempo_final = fin - inicio;
			System.out.println("Tiempo final de ejecucion con " + cantidad[i] + ": " + tiempo_final + "ms");
		}
	}

	public static void multiply(double[][] A, double[][] B, double[][] C) {
	    int n = A.length;

	    if (n == 1) {
	        C[0][0] = A[0][0] * B[0][0];
	    } else {
	        double[][] A11 = new double[n / 2][n / 2];
	        double[][] A12 = new double[n / 2][n / 2];
	        double[][] A21 = new double[n / 2][n / 2];
	        double[][] A22 = new double[n / 2][n / 2];
	        double[][] B11 = new double[n / 2][n / 2];
	        double[][] B12 = new double[n / 2][n / 2];
	        double[][] B21 = new double[n / 2][n / 2];
	        double[][] B22 = new double[n / 2][n / 2];

	        splitMatrix(A, A11, 0, 0);
	        splitMatrix(A, A12, 0, n / 2);
	        splitMatrix(A, A21, n / 2, 0);
	        splitMatrix(A, A22, n / 2, n / 2);
	        splitMatrix(B, B11, 0, 0);
	        splitMatrix(B, B12, 0, n / 2);
	        splitMatrix(B, B21, n / 2, 0);
	        splitMatrix(B, B22, n / 2, n / 2);

	        double[][] P1 = multiply(add(A11, A22), add(B11, B22));
	        double[][] P2 = multiply(add(A21, A22), B11);
	        double[][] P3 = multiply(A11, subtract(B12, B22));
	        double[][] P4 = multiply(A22, subtract(B21, B11));
	        double[][] P5 = multiply(add(A11, A12), B22);
	        double[][] P6 = multiply(subtract(A21, A11), add(B11, B12));
	        double[][] P7 = multiply(subtract(A12, A22), add(B21, B22));

	        double[][] C11 = add(subtract(add(P1, P4), P5), P7);
	        double[][] C12 = add(P3, P5);
	        double[][] C21 = add(P2, P4);
	        double[][] C22 = add(subtract(add(P1, P3), P2), P6);

	        copySubMatrix(C11, C, 0, 0);
	        copySubMatrix(C12, C, 0, n / 2);
	        copySubMatrix(C21, C, n / 2, 0);
	        copySubMatrix(C22, C, n / 2, n / 2);
	    }
	}

	private static void splitMatrix(double[][] input, double[][] output, int rowStart, int colStart) {
	    for (int i = 0; i < output.length; i++) {
	        System.arraycopy(input[i + rowStart], colStart, output[i], 0, output.length);
	    }
	}

	private static void copySubMatrix(double[][] source, double[][] destination, int rowStart, int colStart) {
	    for (int i = 0; i < source.length; i++) {
	        System.arraycopy(source[i], 0, destination[i + rowStart], colStart, source.length);
	    }
	}

	private static double[][] add(double[][] A, double[][] B) {
	    int n = A.length;
	    double[][] result = new double[n][n];
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            result[i][j] = A[i][j] + B[i][j];
	        }
	    }
	    return result;
	}

	private static double[][] subtract(double[][] A, double[][] B) {
	    int n = A.length;
	    double[][] result = new double[n][n];
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            result[i][j] = A[i][j] - B[i][j];
	        }
	    }
	    return result;
	}

	private static double[][] multiply(double[][] A, double[][] B) {
	    int n = A.length;
	    double[][] result = new double[n][n];
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            for (int k = 0; k < n; k++) {
	                result[i][j] += A[i][k] * B[k][j];
	            }
	        }
	    }
	    return result;
	}

}
