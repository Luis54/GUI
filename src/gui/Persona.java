package gui;

public class Persona {
	private String nombre;
	private String apellido;
	private String localidad;
	private String direccion;
	private String Telefono;
	public Persona(String nombre, String apellido, String localidad,
			String direccion, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.localidad = localidad;
		this.direccion = direccion;
		Telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", localidad=" + localidad + ", direccion=" + direccion
				+ ", Telefono=" + Telefono + "]";
	} 
	
}
