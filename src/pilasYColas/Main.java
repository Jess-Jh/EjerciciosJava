package pilasYColas;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Pila<String> pila = new Pila<>();
		System.out.println("<-------------------------PILA DINÁMICA------------------------------>\n");
		System.out.println("¿La lista está vacía?(Al principio): "+ pila.Vacia());
		System.out.println("¿Cuantos elementos hay?: "+ pila.longitud());
		pila.insertar("pedro");
		pila.insertar("juana");
		pila.insertar("marcos");
		pila.insertar("Antonio");
		System.out.println("ELEMENTOS INSERTADOS:");
		System.out.println(pila.toString() + "\n");
		System.out.println("¿La lista está vacía?(ya hay elementos insertados): " + pila.Vacia());
		System.out.println("¿Cuantos elementos hay?: "+ pila.longitud());
		System.out.println("EXTRAEMOS UN ELEMENTO: ");
		System.out.println("¿A quién hemos extraido?: " + pila.extraer());
		System.out.println(pila.toString()+"\n");
		System.out.println("¿Cuantos elementos hay ahora?: " + pila.longitud());
		pila.vaciar();
		System.out.println("VACIAMOS LA PILA Y PREGUNTAMOS CUANTOS ELEMENTOS HAY AHORA?: " + pila.longitud()+"\n");
		System.out.println("<-------------------------PILA DINÁMICA------------------------------>\n");
		
		
		System.out.println("<-------------------------COLA DINÁMICA------------------------------>\n");
		Cola <String> cola = new Cola<>();
		System.out.println("¿La lista está vacía?(Al principio): "+ cola.isVacia()); 
		System.out.println("¿Cuantos elementos hay?: "+cola.longitud());
		cola.insertar("Loca");
		cola.insertar("pedro");
		cola.insertar("caca");
		System.out.println("ELEMENTOS INSERTADOS:");
		System.out.println(cola.toString()+"\n");
		System.out.println("¿La lista está vacía?(ya hay elementos insertados): "+cola.isVacia());
		System.out.println("¿Cuantos elementos hay?: "+cola.longitud());
		System.out.println("EXTRAEMOS UN ELEMENTO(el primero): ");
		cola.extraer();
		System.out.println(cola.toString()+"\n");
		System.out.println("¿Cuantos elementos hay ahora?: "+cola.longitud());
		cola.vaciar();
		System.out.println("VACIAMOS LA PILA Y PREGUNTAMOS CUANTOS ELEMENTOS HAY AHORA?: "+cola.longitud()+"\n");

		System.out.println("<-------------------------COLA DINÁMICA------------------------------>\n");
		
		
	}

}
