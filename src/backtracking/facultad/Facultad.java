package backtracking.facultad;

import java.util.ArrayList;

public class Facultad {
	
	private ArrayList<Piso> listaPisos = new ArrayList<>();
	
	public Facultad() {
		inicializarPisos();
	}

	public ArrayList<Piso> getListaPisos() {
		return listaPisos;
	}
	public void setListaPisos(ArrayList<Piso> listaPisos) {
		this.listaPisos = listaPisos;
	}
	
	public void inicializarPisos() {
		Piso piso1 = new Piso();
		piso1.inicializar(12, 1);
		listaPisos.add(piso1);

		Piso piso2 = new Piso();
		piso2.inicializar(11, 2);
		listaPisos.add(piso2);

		Piso piso3 = new Piso();
		piso3.inicializar(13, 3);
		listaPisos.add(piso3);

	}
	
	public void verificarPiso(int posicion) {
		
		if(posicion == listaPisos.size()) return;
		
		else {
			Piso piso;
			piso = listaPisos.get(posicion);
			piso.validarCamino(1, 0);
			verificarPiso(posicion + 1);
		}
	}
	
	public void imprimirPiso() {
		for (Piso piso : listaPisos) {
			System.out.println("Piso " + piso.getConfiguracion());	
			piso.imprimirPiso();
		}
	}
	
	
	
	
}
