package collections.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas {
	
	public static void main(String[] args) {
		
		//Declaración de una ArrayList
		ArrayList<Integer> lista = new ArrayList<>();
		        
		//Metodo add. añade elementos a nuestra lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("Elementos de la lista " + lista);

		 //Metodo remove, 
		lista.remove(2);
		System.out.println("Remover un elemento " + lista);

		//Metodo size, indica el numero de elementos de la lista
		int tamaño = lista.size();
		System.out.println("Tamaño lista " + tamaño);

		 //Metodo get, devolvemos un elemento de un índice
		 int elemento = lista.get(0);
		 
		 System.out.println("Obtener un elemento de la lista " + elemento);

		 //Metodo indexOf, util para saber la posicion de un elemento
        int posicion = lista.indexOf(2);
        System.out.println("Posición de un elemento " + posicion);
        
      //Metodo Clear, elimina todos los elementos
        lista.clear();
        System.out.println("Elimina todos los elementos " + lista);
//		lista.removeAll(lista2);

		//Iteración sobre la lista
		 //Metodo Iterator, util para recorrer un arrayList
		Iterator<Integer> it = lista.iterator();
	        int num;
	        while (it.hasNext()){
	            num = it.next();
	            System.out.println(num);
    	}

	}

		       
}
