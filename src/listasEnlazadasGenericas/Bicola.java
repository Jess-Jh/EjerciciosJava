package listasEnlazadasGenericas;

public class Bicola<T> extends Cola<T>{
	
	public Bicola() 
	{
		
	}
	
	// inserta por el final de la Bicola
	public void ponerFinal(T dato)
	{
		encolar(dato); // método heredado de ColaLista
	}
	
	// inserta por el frente; método propio de Bicola
	public void ponerFrente(T dato)
	{
		Nodo<T> nuevoNodo;
		nuevoNodo = new Nodo<T>(dato);
		if (estaVacia())
		{
			nodoUltimo = nuevoNodo;
		}
		nuevoNodo.setSiguienteNodo(nodoPrimero);
		nodoPrimero = nuevoNodo;
	}
	
	
	// retira elemento frente de la Bicola
	public T quitarFrente() 
	{
		T valor = desencolar();
		return valor; // método heredado de ColaLista
	}
	
	// retira elemento final; método propio de Bicola.
	// Es necesario recorrer la bicola para situarse en
	// el nodo anterior al final, para después enlazar.
	public T quitarFinal() throws Exception
	{
		T aux;
		if (!estaVacia())
		{
			if (nodoPrimero == nodoUltimo) // la Bicola dispone de un solo nodo
				aux = desencolar();
			else
			{
				Nodo<T> nodo = nodoPrimero;
				while (nodo.getSiguienteNodo() != nodoUltimo){
//				while (nodo.getSiguienteNodo() != null){
					nodo = nodo.getSiguienteNodo();
				}
					
				aux = nodo.getSiguienteNodo().getValorNodo();
				// siguiente del nodo anterior se pone a null
				nodo.setSiguienteNodo(null);
				nodoUltimo = nodo;
			}
		}
		else
			throw new Exception("Eliminar de una bicola vacía");
		return aux;
	}
	

}

