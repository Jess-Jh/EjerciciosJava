package preParcialListasEnlPilasColas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej_04_LlenarPilaValoresPositivos {
	
	public static void main(String[] args) {

		Pila<Double> pila = new Pila<>();
		int x;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Teclea número de elementos: ");
		
		try {
			x = Integer.parseInt(entrada.readLine());
			
			for (int j = 1; j <= x; j++) {
				Double d;
				d = Double.valueOf(entrada.readLine());
				pila.push(d);
			}
			// vaciado de la pila
			System.out.println("Elementos de la Pila: ");
			while (!pila.estaVacia()) {
				Double d;
				d = (Double)pila.pop();
				if (d.doubleValue() > 0.0)
					System.out.print(d + " ");
			}
		}
		catch (Exception er) {
			System.err.println("Excepcion: " + er);
		}
	}


}
