package Clases.Personas;

public abstract class Persona {

	// ATRIBUTOS
	private String nombre = "";
	private String apellidos = "";
	private String fechaNacimiento = "";

	// CONSTRUCTOR VACIO
	public Persona() {

	}

	// CONSTRUCTOR
	public Persona(String nombre, String apellidos, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract boolean comprobarLicencia(String tipoLicencia, String vehiculo);
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
