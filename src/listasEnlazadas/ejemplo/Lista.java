package listasEnlazadas.ejemplo;

import java.util.Iterator;

public class Lista implements Iterable<Nodo>{
	
    // Puntero que indica el inicio de la lista o conocida tambien como cabeza de la lista.
    private Nodo nodoPrimero;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;
    
    /**
     * Constructor por defecto.
     */
    public Lista(){
        nodoPrimero = null;
        tamanio = 0;
    }
    
    /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){

    	if(tamanio == 0) return true;
    	else return false;
    }
    
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     * @param valor a agregar.
     */   
    public void agregarAlInicio(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            nodoPrimero = nuevo;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(nodoPrimero);
            // Renombra al nuevo nodo como el inicio de la lista.
            nodoPrimero = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
    
    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param valor a agregar.
     */
    public void agregarAlFinal(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        
        boolean flagValorDuplicado = false;
        
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            nodoPrimero = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
            Nodo aux = nodoPrimero;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null ){
            	
            	if(aux.getValor() == nuevo.getValor()){
            		flagValorDuplicado = true;
            		break;
            	}
            	
                aux = aux.getSiguiente();
            }
            
            if(flagValorDuplicado != true){
                // Agrega el nuevo nodo al final de la lista.
                aux.setSiguiente(nuevo);
                // Incrementa el contador de tamaño de la lista
                tamanio++;
            }
        }
    }

    /**
     * Inserta un nuevo nodo despues de otro, ubicado por el valor que contiene.
     * @param referencia valor del nodo anterios al nuevo nodo a insertar.
     * @param valor del nodo a insertar.
     */
    public void insertarPorReferencia(int referencia, int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Verifica si la lista contiene elementos
        if (!esVacia()) {
            // Consulta si el valor existe en la lista.
            if (buscar(referencia)) {
                // Crea ua copia de la lista.
                Nodo aux = nodoPrimero;
                // Recorre la lista hasta llegar al nodo de referencia.
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                // Crea un respaldo de la continuación de la lista.
                Nodo siguiente = aux.getSiguiente();
                // Enlaza el nuevo nodo despues del nodo de referencia.
                aux.setSiguiente(nuevo);
                // Une la continuacion de la lista al nuevo nodo.
                nuevo.setSiguiente(siguiente);
                
                // Incrementa el contador de tamaño de la lista.
                tamanio++;
            }
        }
    }
    
    /**
     * Inserta un nuevo nodo despues en una posición determinada.
     * @param posicion en la cual se va a insertar el nuevo nodo.
     * @param valor valor del nuevo nodo de la lista.
     */
    public void insrtarPorPosicion(int posicion, int valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Inserta el nuevo nodo al inicio de la lista.
                nuevo.setSiguiente(nodoPrimero);
                nodoPrimero = nuevo;
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamanio){
                    Nodo aux = nodoPrimero;
                    // Recorre la lista hasta llegar al ultimo nodo.
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    // Inserta el nuevo nodo despues de del ultimo.
                    aux.setSiguiente(nuevo);              
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo aux = nodoPrimero;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo siguiente = aux.getSiguiente();
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSiguiente(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSiguiente(siguiente);
                }
            }
            // Incrementa el contador de tamaño de la lista.
            tamanio++;
        }
    }
    /**
     * Obtiene el valor de un nodo en una determinada posición.
     * @param posicion del nodo que se desea obtener su valor.
     * @return un numero entero entre [0,n-1] n = numero de nodos de la lista.
     * @throws Exception
     */
    public int getValor(int posicion) throws Exception{
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return nodoPrimero.getValor();
            }else{
                // Crea una copia de la lista.
                Nodo aux = nodoPrimero;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getValor();
            }
        // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    
    /**
     * Busca si existe un valor en la lista.
     * @param referencia valor a buscar.
     * @return true si existe el valor en la lista.
     */
    public boolean buscar(int referencia){
        Nodo aux = nodoPrimero;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    
    public Nodo buscarNodo(int referencia){
        
    	Nodo aux = null;
    	
    	for (aux = nodoPrimero; aux != null; aux = aux.getSiguiente()) {
			if(referencia == aux.getValor()) {
				return aux;
			}
		}
    	return aux;
    }
    
    /**
     * Consulta la posición de un elemento en la lista
     * @param referencia valor del nodo el cual se desea saber la posición.
     * @return un valor entero entre [0,n] que indica la posición del nodo. 
     * @throws Exception 
     */
    public int getPosicion(int referencia) throws Exception{
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea una copia de la lista.
            Nodo aux = nodoPrimero;
            // COntado para almacenar la posición del nodo.
            int cont = 0;
            // Recoore la lista hasta llegar al nodo de referencia.
            while(referencia != aux.getValor()){
                // Incrementa el contador.
                cont ++;
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
            // Retorna el valor del contador.
            return cont;
        // Crea una excepción de Valor inexistente en la lista.
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }
    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado
     * por un valor de referencia.
     * @param referencia valor del nodo el cual se desea actualizar.
     * @param valor nuevo valor para el nodo.
     */
    public void editarPorReferencia(int referencia, int valor){
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea ua copia de la lista.
            Nodo aux = nodoPrimero;
            // Recorre la lista hasta llegar al nodo de referencia.
            while(aux.getValor() != referencia){
                aux = aux.getSiguiente();
            }
            // Actualizamos el valor del nodo
            aux.setValor(valor);
        }
    }
    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a actualizar.
     * @param valor nuevo valor para el nodo.
     */
    public void editarPorPosicion(int posicion , int valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero.
            if(posicion == 0){
                // Alctualiza el valor delprimer nodo.
                nodoPrimero.setValor(valor);
            }
            else{
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                Nodo aux = nodoPrimero;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Alctualiza el valor del nodo.
                aux.setValor(valor);
            }
        }
    }
    
    public int eliminar(int referencia){
    	
    	Nodo nodo = nodoPrimero;
    	Nodo previo = null;
    	Nodo siguiente = null;
    	boolean encontrado = false;
    	
    	//Buscar el nodo previo
    	while(nodo != null){
    		
    		if(nodo.getValor() == referencia){
    			encontrado = true;
    			break;
    		}
    		previo = nodo;
    		nodo = nodo.getSiguiente();
    	}
    	
    	if(encontrado == true){
    		siguiente = nodo.getSiguiente();
    		
    		if(previo == null){
    			nodoPrimero = siguiente;
    			nodo = null;
    		}else{
    			previo.setSiguiente(siguiente);
    			nodo = null;
    		}
    	}
		return referencia;
    }
    
    
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por un valor de referencia.
     * @param referencia valor del nodo que se desea eliminar.
     */
    public void removerPorReferencia(int referencia){
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (nodoPrimero.getValor() == referencia) {
                // El primer nodo apunta al siguiente.
                nodoPrimero = nodoPrimero.getSiguiente();
            } else{
                
                Nodo aux = nodoPrimero;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setSiguiente(siguiente);  
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a eliminar.
     */
    public void removerPorPosicion(int posicion){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                // Elimina el primer nodo apuntando al siguinte.
                nodoPrimero = nodoPrimero.getSiguiente();
            }
            // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo aux = nodoPrimero;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                Nodo siguiente = aux.getSiguiente();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setSiguiente(siguiente.getSiguiente());
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
    /**
     * Elimina la lista
     */
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        nodoPrimero = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }
    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = nodoPrimero;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }
    
    @Override
    public Iterator<Nodo> iterator() {
    	// TODO Auto-generated method stub
    	return new IteradorListaSimple(nodoPrimero);
    }
    
    public class IteradorListaSimple implements Iterator<Nodo>{

		private Nodo nodo;
		private int posicion;
		
    	public IteradorListaSimple(Nodo nodo) {
			this.nodo = nodo;
			this.posicion = 0;
		}
    	
		@Override
		public boolean hasNext() {
			return nodo != null;
		}

		@Override
		public Nodo next() {
			Nodo nodoActual = nodo;
			nodo = nodo.getSiguiente();
			posicion++;
			return nodoActual;
		}
    }
    
    
}