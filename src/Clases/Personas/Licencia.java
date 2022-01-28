package Clases.Personas;

public class Licencia {

	// ATRIBUTOS
	private String id = "";
	private String nombreCompleto = "";
	private String fechaCaducidad = "";
	
	// CONSTRUCTOR VACIO
	public Licencia() {
	}

	// CONSTRUCTOR
	public Licencia(String id, String nombreCompleto, String fechaCaducidad) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
	}

	// GETTERS Y SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Licencia [id=" + id + ", nombreCompleto=" + nombreCompleto + ", fechaCaducidad=" + fechaCaducidad + "]";
	}
	
	
	
}
