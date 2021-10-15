package listasEnlazadas.taller;

public class Lista {
	Nodo nodoPrimero;
	int tamano;
	
	public Lista() {
		nodoPrimero = null;
		tamano = 0;
	}

	public Nodo getNodoPrimero() {
		return nodoPrimero;
	}
	public void setNodoPrimero(Nodo nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo(valor);
        
        if (esVacia()) nodoPrimero = nuevo;
        
        else{
            Nodo aux = nodoPrimero;
            while(aux.getSiguienteNodo() != null) aux = aux.getSiguienteNodo();
            
            aux.setSiguienteNodo(nuevo);
        }
        tamano++;
    }
	
	public void agregarAlFinal(String valor){
        Nodo nuevo = new Nodo(valor);
        
        if (esVacia()) nodoPrimero = nuevo;
        
        else{
            Nodo aux = nodoPrimero;
            while(aux.getSiguienteNodo() != null) aux = aux.getSiguienteNodo();
            
            aux.setSiguienteNodo(nuevo);
        }
        tamano++;
    }
	
	public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo(valor);
        
        if (esVacia()) nodoPrimero = nuevo;
        
        else{
            nuevo.setSiguienteNodo(nodoPrimero);
            nodoPrimero = nuevo;
        }
        tamano++;
    }
	
	public void agregarNodo(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.setSiguienteNodo(nodoPrimero);
		nodoPrimero = nuevo;
		tamano++;
	}

	public void agregarNodo(String dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.setSiguienteNodo(nodoPrimero);
		nodoPrimero = nuevo;
		tamano++;
	}
	
	public boolean esVacia(){
		
		if(nodoPrimero == null) return true;	
		else return false;
    }
	
	public void imprimirLista() {
		Nodo actual = nodoPrimero;
		while(actual != null) {
			System.out.print("[" + actual.getCadenaNodo() + "]->");
			actual = actual.getSiguienteNodo();
			
		}
	}
}
