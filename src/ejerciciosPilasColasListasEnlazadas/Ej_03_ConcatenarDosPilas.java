package ejerciciosPilasColasListasEnlazadas;

public class Ej_03_ConcatenarDosPilas {

	public static void main(String[] args) {
		concatenarPilas();
	}
	
	public static void concatenarPilas() {
		Pila<Integer> pila1 = new Pila<Integer>();
		Pila<Integer> pila2 = new Pila<Integer>();
		Pila<Integer> pilaAux = new Pila<Integer>();

		for (int i = 0; i < 10; i++) {
			pila1.push((int) Math.floor(Math.random() * 100));
			pila2.push((int) Math.floor(Math.random() * 100));
		}
		System.out.println("Pila 1");
		pila1.imprimir();
		System.out.println("Pila 2");
		pila2.imprimir();

		for (int i = 0; i < 10; i++) {
			pilaAux.push(pila2.pop());
		}

		for (int i = 0; i < 10; i++) {
			pila1.push(pilaAux.pop());
		}
		System.out.println("Pilas concatenadas");
		pila1.imprimir();
	}

}
