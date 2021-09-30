package collections.ejemplos;

import java.util.Arrays;

public class EjemplosArrays {
	
	
	public static void main(String[] args) {
		
		ordenarArray();
		busquedaArray();
		armarArrays();
//		arrayObjetos();
		
		
	}
	
	
//	public static void sort(double [] w);
//	public static void sort(int [] w);
//	public static void sort(long [] w);
//	public static void sort(Object [] w);
//	public static void sort(Object [] w, Comparator cmp);
	
	
//	Se puede ordenar un subarray, para ello se especifica el índice inicio (inclusive) y final (exclusive):
//	// ordena los elementos w[inicio] .. w[final-1]
//	public static void sort(double [] w, int inicio, int final );
//	public static void sort(int [] w, int inicio, int final);
	

	public static void ordenarArray() 
	{
		Double [] array = {5.6,12.4,3.5,-2.0};
		Arrays.sort(array);
//		Arrays.sort(array,1,2);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
	}

	
//	public static int binarySearch(double [] w, double clave);
//	public static int binarySearch(int [] w, int clave);
//	public static int binarySearch(Object [] w, Object clave);
//	public static int binarySearch(Object[]w, Object clave, Comparator c);
	
	public static void busquedaArray() 
	{
		int [] w = {14, -5, 3, 2, 6, -4, 22, 4};
		// llamada a sort() para ordenar w
		Arrays.sort(w);
		// búsqueda de un elemento
		int k;
		int buscar = -25;
		k = Arrays.binarySearch(w, buscar);
		if (k >= 0)
			System.out.println("Elemento de búsqueda<" + buscar + "> en la posicion: " + k);
		else
			System.out.println("Numero no encontrado");
	}
	
	
	public static void armarArrays() 
	{
		final int N = 10;
		int [] iv = new int[N];
		char [] cv = new char [N];
		String [] sv = new String [N];
		// llenado de los arrays
		Arrays.fill(iv, 0, iv.length/2, -1);
		Arrays.fill(iv, iv.length/2 +1, iv.length -1, 1);
		Arrays.fill(cv, 'a');
		Arrays.fill(sv, "Paloma");

		for (int i = 0; i < sv.length; i++) {
			System.out.println(sv[i]);
		}
	}
	
	private static void arrayObjetos() {
		class Punto2D { }
		class Punto3D { }
		class PuntoPolar {}
		
		//La declaración y creación del array de N elementos es:
		final int N = 10;
		Object [] array = new Object[N];
		int i = 0;
		Boolean mas = true;
		int opcion = 1;
		
		while (mas && (i < N))
		{
			if(opcion >3)
				opcion = 1;
			
			if (opcion == 1)
			{
				array[i++] = new Punto2D();
				System.out.println("Objeto agragado Punto 2D en la posición:"+(i-1));
				opcion++;
			}
			else 
			{
				if (opcion == 2)
				{
					array[i++] = new Punto3D();
					System.out.println("Objeto agragado Punto 3D en la posición:"+(i-1));
					opcion++;
				}
				else
				{
					if (opcion == 3)
					{
//						array[i++] = new PuntoPolar();
						System.out.println("Objeto agragado Punto Polar en la posición:"+(i-1));
						opcion++;
					}
					else
					{
						mas = false;
					}
				}
			}
		}
		
//		Arrays.sort(array);
//		System.out.println("ordenado");

		
	}
	
	

}
