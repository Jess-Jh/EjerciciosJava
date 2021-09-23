package backtracking.facultad;

public class Cuarto {

	private int numeroCuarto;
	private TipoCuarto tipoCuarto;
	private String estado = "C";
	
	public Cuarto() {}

	public Cuarto(TipoCuarto tipoCuarto) {
		this.tipoCuarto = tipoCuarto;
	}
	
	public Cuarto(int numeroCuarto, TipoCuarto tipoCuarto) {
		this.numeroCuarto = numeroCuarto;
		this.tipoCuarto = tipoCuarto;
	}
	
	public int getNumeroCuarto() {
		return numeroCuarto;
	}
	public void setNumeroCuarto(int numeroCuarto) {
		this.numeroCuarto = numeroCuarto;
	}
	public TipoCuarto getTipoCuarto() {
		return tipoCuarto;
	}
	public void setTipoCuarto(TipoCuarto tipoCuarto) {
		this.tipoCuarto = tipoCuarto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
