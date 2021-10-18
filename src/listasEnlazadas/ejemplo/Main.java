package listasEnlazadas.ejemplo;

import java.util.Iterator;

public class Main {
    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        
        System.out.println("<<-- Ejemplo de lista simple -->>\n");
        
        
        // Agregar in inicio de la lista
        lista.agregarAlInicio(41);
        lista.agregarAlInicio(6);
        
        // Agregar al final de la lista
        lista.agregarAlFinal(6);
        lista.agregarAlFinal(15);
        lista.agregarAlFinal(9);
        
        
        System.out.println("<<-- Lista -->>");
        lista.listar();
        
        lista.insrtarPorPosicion(2, 90);
        
        System.out.println(lista.eliminar(9));
        
        
        System.out.println(lista.buscarNodo(9));
        
        System.out.println("<<-- Lista -->>");
        lista.listar();
        
        System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n<<-- Obtener el valor del nodo en la posicion 3 -->>");
        System.out.println(lista.getValor(3));
        
        System.out.println("\nInserta un nodo con valor 16 despues del 15");
        lista.insertarPorReferencia(15, 16);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\nInsrta un nodo con valor 44 en la posición 3");
        lista.insrtarPorPosicion(3, 44);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
        lista.editarPorReferencia(12, 13);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nActualiza el valor nodo en la posición 0 por 17");
        lista.editarPorPosicion(0, 17);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        
        for (Nodo nodo : lista) {
			System.out.println(nodo.getValor());
		}
        
        
		Iterator<Nodo> iter = lista.iterator();
		
		while (iter.hasNext()) 
		{
			Nodo nodoActual = iter.next();
			
			System.out.println(nodoActual.getValor());
			
			if(iter.hasNext())
			{
				System.out.println("existe");
			}
		}
        
        System.out.println("\nElimina el nodo con el valor 41");
        lista.removerPorReferencia(15);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nElimina el nodo en la posición 4");
        lista.removerPorPosicion(4);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(lista.buscar(30));
        
        System.out.println("\nConsulta la posicion del valor 9");
        System.out.println(lista.getPosicion(41));
        
        System.out.println("\nElimina la lista");
        lista.eliminar();
        
        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(lista.esVacia());
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
    }   
}
