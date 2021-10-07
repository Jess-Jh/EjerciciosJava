package recursividad.ejemplos;

public class Ej_41_CalcularFibonacci {

	public static void main(String[] args) {
		System.out.println(sucesionFibonacci(6));
	}
	
	private static int sucesionFibonacci(int num){
        if(num == 0 || num==1)
             return num;
        else
             return sucesionFibonacci(num-1) + sucesionFibonacci(num-2);
   }

}
