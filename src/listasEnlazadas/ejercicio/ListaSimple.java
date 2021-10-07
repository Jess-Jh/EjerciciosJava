package listasEnlazadas.ejercicio;

public class ListaSimple {

	Nodo nodoPrimero;
	int tamano;
	
	public ListaSimple() {
		nodoPrimero = null;
		tamano = 0;
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
	
	public boolean esVacia(){
		
		if(nodoPrimero == null) return true;	
		else return false;
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
}
