package listasEnlazadasGenericas;

import java.util.Iterator;

import collections.clases.Producto;

public class RunListas {

	public static void main(String[] args) {

		ListaSimple<Integer> listaEnteros = new ListaSimple<>();
		listaEnteros.agregarfinal(1);
		listaEnteros.agregarfinal(2);
		listaEnteros.agregarfinal(3);
		listaEnteros.agregarfinal(4);
		listaEnteros.agregarfinal(5);
		listaEnteros.agregarfinal(6);
		
		listaEnteros.imprimirLista();

		ListaSimple<Integer> listaEnteros2 = new ListaSimple<>();
		listaEnteros2.agregarfinal(1);
		listaEnteros2.agregarfinal(2);
		listaEnteros2.agregarfinal(3);
		listaEnteros2.agregarfinal(4);
		listaEnteros2.agregarfinal(5);
		listaEnteros2.agregarfinal(6);

		listaEnteros2.imprimirLista();
		
		ListaSimple<Integer> listaEnteros3 = new ListaSimple<>();
		listaEnteros3 = listaEnteros3.concatenarDosListasSimplesEnlazadas(listaEnteros, listaEnteros2);
		
		listaEnteros3.imprimirLista();
//		
//		borrarPosicionesParesOImpares(listaEnteros);
//		
//		listaEnteros.imprimirLista();
		
//		ListaDoble<Integer> listaEnteros2 = new ListaDoble<>();
//		listaEnteros2.agregarfinal(1);
//		listaEnteros2.agregarfinal(2);
//		listaEnteros2.agregarfinal(3);
//		listaEnteros2.agregarfinal(4);
//		listaEnteros2.agregarfinal(5);
//		listaEnteros2.agregarfinal(6);
//		
//		listaEnteros2.imprimirLista();
//		listaEnteros2.imprimirAtras();
		
		
		ListaSimple<Producto> listaProductos = new ListaSimple<>();
		
		Producto producto = new Producto();
		producto.setNombre("Arroz");
		
		listaProductos.agregarInicio(producto);
		
		producto = new Producto();
		producto.setNombre("Leche");
		
		listaProductos.agregarInicio(producto);
		
		Iterator<Producto> iter = listaProductos.iterator();
		
		while (iter.hasNext()) {
			Producto producto2 = iter.next();
//			System.out.println(producto2.getNombre());
			
			if(iter.hasNext()) System.out.println("existe");
		}
		listaProductos.eliminar(producto);
		
//		IteradorListaSimple iteradorListaSimple = new IteradorListaSimple(listaProductos.getNodoPrimero());
	}
	
	static <T> boolean borrarParesOImpares (Nodo<T> nodo) {
		boolean resul;
		Nodo<T> aux;
		if (nodo != null) {
			aux = nodo;
			nodo = nodo.getSiguienteNodo();
			resul = borrarParesOImpares (nodo);
			
			if (!resul && (nodo != null)) {
				aux.setSiguienteNodo(nodo.getSiguienteNodo());
				resul = !resul;
			}
		}
		
		else resul = true;
		return resul;
	}
	
	static <T> void borrarPosicionesParesOImpares (ListaSimple<T> lista){
		boolean resul = borrarParesOImpares (lista.getNodoPrimero());
		if (!resul)
			lista.setNodoPrimero(lista.getNodoPrimero().getSiguienteNodo());
	}
	
	
}
