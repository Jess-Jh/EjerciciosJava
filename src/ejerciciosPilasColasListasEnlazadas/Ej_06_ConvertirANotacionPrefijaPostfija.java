package ejerciciosPilasColasListasEnlazadas;

public class Ej_06_ConvertirANotacionPrefijaPostfija {
	
	public static void main(String[] args) {
		
		String infija1 = "(A + B) * C - (D - E) * (F + G)";
		infija1 = infija1.replaceAll("\\s+", "");
		
		String postfija = convertirApostfija(infija1);
		String prefija = convertirAprefija(infija1);
		
		System.out.println();
		System.out.println("La expresión Postfija de " + infija1 + " es: " + postfija);
		System.out.println("La expresión Prefija de " + infija1 + " es: " + prefija);
		
		String infija2 = "4*(5+6-(8/2^3)-7)-1";
		
		infija2 = infija2.replaceAll("\\s+", "");
		
		String postfija2 = convertirApostfija(infija2);
		String prefija2 = convertirAprefija(infija2);
		
		System.out.println();
		System.out.println("La expresión Postfija de " + infija2 + " es: " + postfija2);
		System.out.println("La expresión Prefija de " + infija2 + " es: " + prefija2);
		
		System.out.println();
		System.out.println("Evaluar postfija " + postfija2 + " = " + evaluarPostfija(postfija2));
	}

	public static String convertirApostfija(String infijo){
		PilaC p1 = InfijoAPosfijo(infijo);
		String text = "";
		while (p1.i > 0)
			text = p1.pop() + text;
		return text;
	}
	
   public static PilaC InfijoAPosfijo(String infijo) {
		infijo +=')'; // Agregamos al final del infijo un &#8216;)&#8217
		int tamaño = infijo.length();
		PilaC pilaDefinitiva = new PilaC(tamaño);
		
		PilaC pilaTemp = new PilaC(tamaño);
		
		pilaTemp.push('('); // Agregamos a la pila temporal un &#8216;(&#8216;<br />
		for (int i = 0; i < tamaño; i++) {
			char caracter = infijo.charAt(i);
			switch (caracter) {
			case '(':
				pilaTemp.push(caracter);
				break;
			case '+':case '-':case '^':case '*':case '/':
				while (Jerarquia(caracter) <= Jerarquia(pilaTemp.nextPop()))
					pilaDefinitiva.push(pilaTemp.pop());
				pilaTemp.push(caracter);
				break;
			case ')':
				while (pilaTemp.nextPop() != '(')
					pilaDefinitiva.push(pilaTemp.pop());
				pilaTemp.pop();
				break;
			default:
				pilaDefinitiva.push(caracter);
			}
		}
		return pilaDefinitiva;
	}
   
   public static String convertirAprefija(String infijo){
       PilaC p1 = Infijo2Prefijo(infijo);
       String text = "";
       while (p1.i > 0)
           text += p1.pop();
       return text;

   }

   public static PilaC Infijo2Prefijo(String infijo) {
       infijo = '(' + infijo ; // Agregamos al final del infijo un ')'
       int tamaño = infijo.length();
       PilaC pilaDefinitiva = new PilaC(tamaño);
       PilaC pilaTemp = new PilaC(tamaño);
       
       pilaTemp.push(')'); // Agregamos a la pila temporal un '('
       for (int i = tamaño-1; i > -1; i--) {
           char caracter = infijo.charAt(i);
           switch (caracter) {
           case ')':
        	   pilaTemp.push(caracter);
               break;
           case '+':case '-':case '^':case '*':case '/':
               while (Jerarquia(caracter) > Jerarquia(pilaTemp.nextPop()))
            	   pilaDefinitiva.push(pilaTemp.pop());
               pilaTemp.push(caracter);
               break;
           case '(':
               while (pilaTemp.nextPop() != ')')
            	   pilaDefinitiva.push(pilaTemp.pop());
               pilaTemp.pop();
               break;
           default:
        	   pilaDefinitiva.push(caracter);
           }
       }
       return pilaDefinitiva;
   }
   
   public static int Jerarquia(char elemento) {
		int res = 0;
		switch (elemento) {
		case ')':
			res = 5; break;
		case '^':
			res = 4; break;
		case '*': case '/':
			res = 3; break;
		case '+': case '-':
			res = 2; break;
		case '(':
			res = 1; break;
		}
		return res;
	}
   
   public static double evaluarPostfija(String posfija) {
        double numero1;
        double numero2;
        double numero3;
        
        Pila<Double> pilaposfija = new Pila<>();
        pilaposfija.setTamano(100);
        
        for(int i = 0; i < posfija.length(); i++){
            char letra = posfija.charAt(i);
            
            if(!esOperador(letra)){
                double numero = new Double(letra + "");
                pilaposfija.push(numero);
            }
            else{
                numero2 = (double) pilaposfija.pop();
                numero1 = (double) pilaposfija.pop();
                numero3 = operar(letra, numero1, numero2);
                
                pilaposfija.push(numero3);
            }
        }
        return (double) pilaposfija.obtenerCima();
    }
  
    //Metodo para saber si es operador 
    public static boolean esOperador(char operador){
        
        if(operador == '^' || operador == '*' || operador == '/' || operador == '+' || operador == '-' || operador == '(' || operador == ')')
            return true;
        
        else return false;
        
    }
    
    //Metodo para realizar operacion
    private static double operar(char operador, double numero1, double numero2){
        
        if(operador == '^') return Math.pow(numero1, numero2);
        
        if(operador == '*') return numero1 * numero2;
        
        if(operador == '/') return numero1 / numero2;
        
        if(operador == '+') return numero1 + numero2;
        
        if(operador == '-') return numero1 - numero2;
          
        return 0;
    }


	
}
