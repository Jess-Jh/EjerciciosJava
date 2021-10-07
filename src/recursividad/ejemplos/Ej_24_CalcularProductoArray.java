package recursividad.ejemplos;

public class Ej_24_CalcularProductoArray {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		int b = 2;
		System.out.println(calcularProducto(a, b, 0));	
	}
	
	/**
	 * Método recursivo que calcula el producto de los elementos del array a mayores que b
	 * @param a, b, i
	 * @return
	 */
	public static int calcularProducto(int[] a, int b, int i) {
		
		if(i < a.length) {	
			if(a[i] > b) return calcularProducto(a, b, i + 1) * a[i];
			
			else return calcularProducto(a, b, i + 1);
		}
		return 1;
	}
}


