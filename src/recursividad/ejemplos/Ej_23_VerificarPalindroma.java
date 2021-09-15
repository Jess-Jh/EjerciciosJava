package recursividad.ejemplos;

public class Ej_23_VerificarPalindroma {

	public static void main(String[] args) {

		String cadena = "Allíva Ramón y no maravilla";
		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
									.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		boolean flag = esPalindroma(cadena, 0, cadena.length()-1);
		
		if(flag) System.out.println("Es Palíndroma");
		
		else System.out.println("No es palíndroma");
	}
	
	/**
	 * Método recursivo para determinar si una palabra o frase es palíndroma
	 * @param cadena, i, f
	 * @return
	 */
	public static  boolean esPalindroma(String cadena, int i, int f) {
		
		if(i < f) {
			if(cadena.charAt(i) >= 65 && cadena.charAt(i) <= 90 || cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122 || cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57) {
				if(cadena.charAt(f) >= 65 && cadena.charAt(f) <= 90 || cadena.charAt(f) >= 97 && cadena.charAt(f) <= 122 || cadena.charAt(f) > 48 && cadena.charAt(f) <= 57) {
				
					if(cadena.charAt(i) == cadena.charAt(f)) 
						return esPalindroma(cadena, i+1, f-1);
					else 
						return false;
					
				} else 
					return esPalindroma(cadena, i, f-1);	
			} else 
				return esPalindroma(cadena, i+1, f);
		} 
		return true;
	}
}