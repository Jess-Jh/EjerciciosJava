package recursividad.ejemplos;

public class Ej_34_ContarConsonantes {

	public static void main(String[] args) {
		
		String[][] matriz = {{"Helado", "Holas", "saludo"},{"loco", "bicicleta","loro"}};
		String palabraMasConsonantes = palabraMasConsonantes(matriz, 0, 0, 0, "");
		System.out.println("Palabra con más consonantes " + palabraMasConsonantes);
		
		System.out.println();

		String cadena = "iglesias";
		System.out.println("El número de consonantes que tiene la palabra " + cadena + " es " +  numeroConsonantesCadena(cadena, cadena.length()-1));
	}
	
	/**
	 * Método recursivo para hayar dentro de una matriz de String la palabra
	 * con más consonantes
	 * @param matriz, i, j, aux, cadenaMasConsonantes
	 * @return
	 */
	public static String palabraMasConsonantes(String[][] matriz, int i, int j, int aux, String cadenaMasConsonantes) {
		
		if(i <= matriz.length-1 && j <= matriz[i].length-1) {
			
			String cadena = matriz[i][j].toString();
			int numCadena = numeroConsonantesCadena(cadena, cadena.length()-1);
			
			if(numCadena > aux) {
				aux = numCadena;
				cadenaMasConsonantes = cadena;
			}
			if(j == matriz[i].length-1) {
				i++;
				j = 0;
				
			} else {
				j++;
			}
			return palabraMasConsonantes(matriz, i, j, aux, cadenaMasConsonantes);
		} else {
			return cadenaMasConsonantes;
		}
	}
	
	/**
	 * Método recursivo para contar las consonantes de una cadena
	 * @param cadena, n
	 * @return
	 */
	public static int numeroConsonantesCadena(String cadena, int n) {
		
		char caracter = cadena.charAt(n);
		
		if(n == 0)
			return 0;
		
		if(caracter != 'a' && caracter != 'á' && caracter != 'e' && caracter != 'é' && caracter != 'i' && caracter != 'í' && caracter != 'o' && caracter != 'ó' && caracter != 'u' && caracter != 'ú' 
		   && caracter != 'A' && caracter != 'Á' && caracter != 'E' && caracter != 'É' && caracter != 'I' && caracter != 'Í' && caracter != 'O' && caracter != 'Ó' && caracter != 'U' && caracter != 'Ú')
			
			return numeroConsonantesCadena(cadena, n - 1) + 1;
		else 
			return numeroConsonantesCadena(cadena, n - 1);
	}

}
