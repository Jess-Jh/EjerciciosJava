package ejerciciosPilasColasListasEnlazadas;

public class Ej_01_VerificarCadenaPalindromaPilas {
	
	public static void main(String[] args) {
		String palabra = "Luz azul";
		
		verificarPalindroma(palabra);
		verificarPalindroma("Ingenieria");

	}
	
	public static void verificarPalindroma(String palabra) {
		Pila<Character> p = new Pila<>();
		
		// Quitar espacios y caracteres especiales de la palabra
		String verificarPalabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		for (int i = 0; i < verificarPalabra.length(); i++) {
			p.push(verificarPalabra.charAt(i));
		}
		p.imprimir();

		String palabra2 = "";

		for (int i = 0; i < verificarPalabra.length(); i++) {
			palabra2 += p.pop();
		}
		if(verificarPalabra.equalsIgnoreCase(palabra2)){
			System.out.println("La palabra es palindroma");
		}else{
			System.out.println("La palabra no es palindroma");
		}
			
	}
	
}
