package recursividad.Quicksort;

import java.util.Arrays;

public class OrdenamientoQuickSort {

	public static void main(String[] args) {

		//-------------------------------NÚMEROS-------------------------------------------------------->
		System.out.println("Arreglo de números");
		
		int[] numeros = {2, 6, 7, 9, 12, 34, 6, 0, 43, -1};
		System.out.println("Antes de QS: " + Arrays.toString(numeros) + "\n");
		
		ordenarQuicksort(numeros, 0, numeros.length-1);
		System.out.println("Después de QS: " + Arrays.toString(numeros) + "\n");
		
		
		//-------------------------------CADENAS-------------------------------------------------------->
		System.out.println("Arreglo de cadenas");
		
		String[] nombres = {"Luis", "Chris", "Jessica", "William", "Ana", "Tobias"};
        System.out.println("Antes de QS: " + Arrays.toString(nombres) + "\n");
        
        ordenarQuicksort2(nombres, 0, nombres.length - 1);
        System.out.println("Después de QS: " + Arrays.toString(nombres));
	}
	
	/**
	 * Método de ordenamiento QuickSort con Divide y vencerás
	 * @param numeros, i, j
	 */
	private static void ordenarQuicksort(int arreglo[], int izquierda, int derecha) {
	    if (izquierda < derecha) {
	        int indiceParticion = particion(arreglo, izquierda, derecha);
	        ordenarQuicksort(arreglo, izquierda, indiceParticion);
	        ordenarQuicksort(arreglo, indiceParticion + 1, derecha);
	    }
	}
	
	/**
	 * Método llamado por el método recursiv0 para dividir el arreglo
	 * @param arreglo, izquierda, derecha
	 * @return
	 */
	private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];

        while (true) {
        	
            while (arreglo[izquierda] < pivote) izquierda++;
            
            while (arreglo[derecha] > pivote) derecha--;
            
            if (izquierda >= derecha) return derecha;
            
            int temporal = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temporal;
            izquierda++;
            derecha--;
        }
    }
	
	private static void ordenarQuicksort2(String arreglo[], int izquierda, int derecha) {
	    if (izquierda < derecha) {
	        int indiceParticion = particion2(arreglo, izquierda, derecha);
	        ordenarQuicksort2(arreglo, izquierda, indiceParticion);
	        ordenarQuicksort2(arreglo, indiceParticion + 1, derecha);
	    }
	}
	
    private static int particion2(String arreglo[], int izquierda, int derecha) {
        String pivote = arreglo[izquierda];
        
        while (true) {
  
            while (arreglo[izquierda].compareTo(pivote) < 0) izquierda++;
            
            while (arreglo[derecha].compareTo(pivote) > 0) derecha--;
            
            if (izquierda >= derecha) return derecha;
       
            String temporal = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temporal;
   
            izquierda++;
            derecha--; 
        }
    }
}
