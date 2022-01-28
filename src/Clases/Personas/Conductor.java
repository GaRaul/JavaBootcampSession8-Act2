package Clases.Personas;

public class Conductor extends Persona {

	// ATRIBUTOS
	private Licencia licencia;

	// CONSTRUCTOR VACIO
	public Conductor() {
		
	}
	
	// CONSTRUCTOR
	public Conductor(Licencia licencia) {
		super();
		this.licencia = licencia;
	}

	// GETTERS Y SETTERS
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Conductor [licencia=" + licencia + "]";
	}
	
	
}
