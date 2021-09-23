package backtracking.facultad;

public class Piso {

	private int numeroCuartos;
	private int cuartosIdentificados;
	private int configuracion;
	
	private Cuarto[][] listaCuartos;
	
	public Piso() {}

	public int getConfiguracion() {
		return configuracion;
	}
	public void setConfiguracion(int configuracion) {
		this.configuracion = configuracion;
	}

	/**
	 * Inicializar pisos con el llamado de las configuraciones de los cuartos
	 * @param numeroCuartos, numero, configuracion
	 */
	public void inicializar(int numeroCuartos, int configuracion) {
		this.numeroCuartos = numeroCuartos;
		this.configuracion = configuracion;
		
		if(configuracion == 1) {
			crearConfiguracionCuartos1();
		}
		if(configuracion == 2) {
			crearConfiguracionCuartos2();
		}
		if(configuracion == 3) {
			crearConfiguracionCuartos3();
		}
	}

	//--------------- Configuración de cada piso con los tipos de cuarto de cada uno ------------------>
	private void crearConfiguracionCuartos1() {
		
		listaCuartos = new Cuarto[4][7];
		
		listaCuartos[0][0] = new Cuarto(101, TipoCuarto.SALON);
		listaCuartos[0][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][6] = new Cuarto(102, TipoCuarto.LABORATORIO);
		
		listaCuartos[1][0] = new Cuarto(TipoCuarto.ENTRADA);
		listaCuartos[1][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][3] = new Cuarto(103, TipoCuarto.SALA_SISTEMAS);
		listaCuartos[1][4] = new Cuarto(104, TipoCuarto.SALON);
		listaCuartos[1][5] = new Cuarto(105, TipoCuarto.SALON);
		listaCuartos[1][6] = new Cuarto(106, TipoCuarto.LABORATORIO);
		
		listaCuartos[2][0] = new Cuarto(TipoCuarto.BAÑO);
		listaCuartos[2][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][6] = new Cuarto(TipoCuarto.PASILLO);

		listaCuartos[3][0] = new Cuarto(107, TipoCuarto.LABORATORIO);
		listaCuartos[3][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][2] = new Cuarto(108, TipoCuarto.SALON);
		listaCuartos[3][3] = new Cuarto(109, TipoCuarto.LABORATORIO);
		listaCuartos[3][4] = new Cuarto(110, TipoCuarto.LABORATORIO);
		listaCuartos[3][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][6] = new Cuarto(111, TipoCuarto.OTRO);
	}
	
	private void crearConfiguracionCuartos2() {
		
		listaCuartos = new Cuarto[4][7];
		
		listaCuartos[0][0] = new Cuarto(201, TipoCuarto.SALON);
		listaCuartos[0][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][6] = new Cuarto(202, TipoCuarto.OFICINA);
		
		listaCuartos[1][0] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][4] = new Cuarto(203, TipoCuarto.SALON);
		listaCuartos[1][5] = new Cuarto(204, TipoCuarto.SALA_SISTEMAS);
		listaCuartos[1][6] = new Cuarto(205, TipoCuarto.SALON);
		
		listaCuartos[2][0] = new Cuarto(206, TipoCuarto.SALON);
		listaCuartos[2][1] = new Cuarto(207, TipoCuarto.SALA_SISTEMAS);
		listaCuartos[2][2] = new Cuarto(208, TipoCuarto.SALON);
		listaCuartos[2][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][6] = new Cuarto(TipoCuarto.PASILLO);

		listaCuartos[3][0] = new Cuarto(209, TipoCuarto.LABORATORIO);
		listaCuartos[3][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][5] = new Cuarto(210, TipoCuarto.LABORATORIO);
		listaCuartos[3][6] = new Cuarto(TipoCuarto.BAÑO);
	}
	
	private void crearConfiguracionCuartos3() {
		
		listaCuartos = new Cuarto[4][7];
		
		listaCuartos[0][0] = new Cuarto(301, TipoCuarto.SALON);
		listaCuartos[0][1] = new Cuarto(302, TipoCuarto.LABORATORIO);
		listaCuartos[0][2] = new Cuarto(303, TipoCuarto.SALON);
		listaCuartos[0][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[0][6] = new Cuarto(304, TipoCuarto.LABORATORIO);
		
		listaCuartos[1][0] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][2] = new Cuarto(305, TipoCuarto.LABORATORIO);
		listaCuartos[1][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][4] = new Cuarto(306, TipoCuarto.SALON);
		listaCuartos[1][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[1][6] = new Cuarto(307, TipoCuarto.SALON);
		
		listaCuartos[2][0] = new Cuarto(308, TipoCuarto.SALA_SISTEMAS);
		listaCuartos[2][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][2] = new Cuarto(309, TipoCuarto.LABORATORIO);
		listaCuartos[2][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[2][4] = new Cuarto(310, TipoCuarto.OFICINA);
		listaCuartos[2][5] = new Cuarto(311, TipoCuarto.SALON);
		listaCuartos[2][6] = new Cuarto(312, TipoCuarto.SALON);

		listaCuartos[3][0] = new Cuarto(TipoCuarto.BAÑO);
		listaCuartos[3][1] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][2] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][3] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][4] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][5] = new Cuarto(TipoCuarto.PASILLO);
		listaCuartos[3][6] = new Cuarto(TipoCuarto.PASILLO);
	}
	//----------------------------------------------------------------------------------------------------||

	/**
	 * Valida si en la posición actual hay un cuarto alrededor
	 * @param x
	 * @param y
	 */
	private void validarCuartos(int x, int y) {
				
		/*------------------- Hacia Arriba ------------------*/
		validarCuarto(x-1, y);

		/*------------------- Diagonal Derecha --------------*/
		validarCuarto(x-1, y+1);

		/*------------------- Hacia la Derecha --------------*/
		validarCuarto(x, y+1);

		/*------------------- Diagonal abajo Derecha --------*/
		validarCuarto(x+1, y+1);

		/*------------------- Hacia Abajo -------------------*/
		validarCuarto(x+1, y);

		/*------------------- Diagonal Abajo Izquierda ------*/
		validarCuarto(x+1, y-1);

		/*------------------- Hacia la Izquierda ------------*/
		validarCuarto(x, y-1);

		/*------------------- Digonal arriba Izquierda ------*/
		validarCuarto(x-1, y-1);	
	}
	
	/**
	 * Validar si en la posición actual hay un cuato para identificar
	 * @param x
	 * @param y
	 */
	private void validarCuarto(int x, int y) {
		
		
		if(x < 0 || x > listaCuartos.length-1 || y < 0 || y > listaCuartos[x].length-1 ||listaCuartos[x][y].getTipoCuarto() == TipoCuarto.ENTRADA 
				 || listaCuartos[x][y].getTipoCuarto() == TipoCuarto.PASILLO || listaCuartos[x][y].getEstado().equals("I"))		 
			return;
		else {
			cuartosIdentificados++;
			listaCuartos[x][y].setEstado("I");	
			return;
		}		
	}

	/**
	 * Validar si en la siguiente posición se puede dar un paso
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean validarCamino(int x, int y) {
		
		validarCuartos(x, y);
		
		if(cuartosIdentificados == numeroCuartos) return true;
			
		if(x < 0 || x > listaCuartos.length-1 || y < 0 || y > listaCuartos[x].length-1 || listaCuartos[x][y].getEstado().equals("f") 
				 || listaCuartos[x][y].getEstado().equals("*") || listaCuartos[x][y].getEstado().equals("I")) 
			return false;
		
		listaCuartos[x][y].setEstado("*");
		
		boolean pasillo;
		
		pasillo = validarCamino(x-1, y);
		if(pasillo) return true;
		
		pasillo = validarCamino(x, y+1);
		if(pasillo) return true;
		
		pasillo = validarCamino(x+1, y);
		if(pasillo) return true;
			
		pasillo = validarCamino(x, y-1);
		if(pasillo) return true;
			
		listaCuartos[x][y].setEstado("f");	
		return false;
	}
	
	/**
	 * Imprimir el resultado
	 */
	public void imprimirPiso() { 
        String salida = "";    
        for (int x = 0; x < listaCuartos.length; x++) { 
            for (int y = 0; y < listaCuartos[x].length; y++) { 
                salida += listaCuartos[x][y].getEstado() + " "; 
            }
            salida += "\n"; 
        }
        System.out.println(salida);
    }
}
