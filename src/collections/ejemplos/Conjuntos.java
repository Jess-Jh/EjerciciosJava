package collections.ejemplos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		
		System.out.println("Ejemplo ArrayList\n");
		ejemploArraylist();

		System.out.println("----------------------------------------");
		
		System.out.println("Ejemplo HashSet\n");
		ejemploHashSet();
	}
	
	private static void ejemploArraylist() {
		
		ArrayList<Fruta> listaFrutas = new ArrayList<>();
		
		Fruta manzana = new Fruta("Manzana");
		Fruta Pera = new Fruta("Pera");
		Fruta mango = new Fruta("Mango");
		
		listaFrutas.add(manzana);
		listaFrutas.add(manzana);
		listaFrutas.add(manzana);
		
		for (Fruta fruta : listaFrutas) {
			System.out.println("Frutas: " + fruta.getNombre());
		}
	}
	
	private static void ejemploHashSet() {
		
		Set<Fruta> listaFrutas = new HashSet<>();
		
		Fruta manzana = new Fruta("Manzana");
		Fruta Pera = new Fruta("Pera");
		Fruta mango = new Fruta("Mango");
		
		listaFrutas.add(manzana);
		listaFrutas.add(manzana);
		listaFrutas.add(manzana);
		
		for (Fruta fruta : listaFrutas) {
			System.out.println("Frutas: " + fruta.getNombre());
		}
	}

}
