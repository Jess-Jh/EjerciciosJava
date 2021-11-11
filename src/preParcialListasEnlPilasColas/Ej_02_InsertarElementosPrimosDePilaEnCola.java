package preParcialListasEnlPilasColas;

public class Ej_02_InsertarElementosPrimosDePilaEnCola {
	
	public static void main(String[] args) {
		Pila<Integer> pila = new Pila<Integer>();
		
		for (int i = 0; i < 10; i++) {
			pila.push((int) Math.floor(Math.random() * 100));
		}
		System.out.println("Lista de la Pila: ");
		pila.imprimir();
		
		System.out.println("\n");
		Cola<Integer> cola = new Cola<>();
		cola = insertarElementosEnLaCola(pila);
		System.out.println("Números primos ingresados en la Cola:");
		cola.mostrar();
	}
	
	/**
	 * Insertar elementos primos de una pila en una cola
	 * @param pila
	 * @return
	 */
	public static Cola<Integer> insertarElementosEnLaCola(Pila<Integer> pila) {
		Cola<Integer> cola = new Cola<>();
		int v;
		
		while (!pila.estaVacia()) {
			v = pila.pop();
			
			int cant_divisores = 0;
            int i = 1;
            while (i <= v) {
                if (v % i == 0) 
                    cant_divisores++;
                i++;
            }	
            if (cant_divisores == 2) cola.insertar(v);    
		}
		return cola;
	}

}
