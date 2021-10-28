package ejerciciosPilasColasListasEnlazadas;

import java.util.ArrayList;

public class Ej_05_EliminarValorDadoPila {
	
	public static void main(String[] args) {
		Pila<Integer> pila = new Pila<>();
		
		for (int i = 0; i < 10; i++) {
			pila.push(i);
		}

		pila.imprimir();
		pila = eliminarValorDadoPila(5, pila);
		pila.imprimir();
		
	}
	
	public static Pila<Integer> eliminarValorDadoPila(int valor, Pila<Integer> pila) {
		ArrayList<Integer> temp = new ArrayList<>();
        Nodo<Integer> nodo = pila.obtenerValor(); 
        
        while(nodo != null){
        	if(nodo.getValorNodo() == valor) break;
        	
        	else {
	        	temp.add(nodo.getValorNodo());
	        	nodo = pila.obtenerValor();
        	}
        }
        for (int i = 0; i < temp.size(); i++) 
			pila.push(temp.get(i));
		
        return pila;
	}
}
