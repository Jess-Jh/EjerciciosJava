package EjerciciosAnalisis;

import java.util.Random;

public class NumerosAleatorios {
	public static double[][] obtener_numeros_aleatorios(int filas, int columnas) {
	    // Crea un objeto de la clase Random
	    Random random = new Random();

	    // Crea una nueva matriz de enteros con el tama�o especificado
	    double[][] randomNumbers = new double[filas][columnas];

	    // Llena la matriz con n�meros aleatorios
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            randomNumbers[i][j] = (double) (10000000 + random.nextInt(90000000)); // Genera n�meros aleatorios de 8 cifras
	        }
	    }

	    return randomNumbers;
	}

}