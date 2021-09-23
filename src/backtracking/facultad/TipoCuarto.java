package backtracking.facultad;

public enum TipoCuarto {
	SALON(1), LABORATORIO(2), OFICINA(3), SALA_SISTEMAS(5), BAÑO(4), PASILLO(5), OTRO(6), ENTRADA(7), SALIDA(8) ;
	
	private int numero;
	
	private TipoCuarto(int numero) {
		this.numero = numero;
	}
}
