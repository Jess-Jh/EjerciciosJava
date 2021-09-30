package collections.clases;

public class Cliente implements Comparable<Cliente>{
	
	String nombres;
	String apellidos;
	String cedula;
	String descripcion;

	public Cliente() {}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int compareTo(Cliente cliente) {
	
		return this.getNombres().compareTo(cliente.getNombres());
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		if (cedula == null) {
//			if (other.cedula != null)
//				return false;
//		} else if (!cedula.equals(other.cedula))
//			return false;
//		return true;
//	}

}
