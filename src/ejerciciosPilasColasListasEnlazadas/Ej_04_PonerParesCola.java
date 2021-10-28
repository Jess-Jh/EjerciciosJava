package ejerciciosPilasColasListasEnlazadas;

import java.util.ArrayList;

public class Ej_04_PonerParesCola {

	public static void main(String[] args) {
		Pila<Integer> pila = new Pila<>();
		
		for (int i = 0; i < 10; i++) {
			pila.push((int) Math.floor(Math.random() * 100));
		}
		
		pila = ponerParesCola(pila);
		System.out.println("La pila: ");
		pila.imprimir();
	}
	
	public static Pila<Integer> ponerParesCola(Pila<Integer> pila) {
		ArrayList<Integer> noPares = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		Nodo<Integer> nodo = pila.obtenerValor();
		
		while(nodo != null){
			if(nodo.getValorNodo() %2 == 0) pares.add(nodo.getValorNodo());
			else noPares.add(nodo.getValorNodo());
			
			nodo = pila.obtenerValor();
		}
		
		//ingreso los impares a la pila
	    for (int i = 0; i < noPares.size(); i++) {
			pila.push(noPares.get(i));
		}
	    
	    Cola<Integer> cola = new Cola<>();
	    for (int i = 0; i < pares.size(); i++) {
			cola.insertar(pares.get(i));
		}
	   System.out.println("La cola: ");
	   cola.mostrar();
	
	   return pila;
	}
}
