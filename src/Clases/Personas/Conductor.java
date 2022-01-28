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

	public boolean comprobarLicencia(String vehiculo, String tipoLicencia) {

		if (tipoLicencia.equalsIgnoreCase("C")) {
			return true;
		} else if (tipoLicencia.equalsIgnoreCase("B") && !vehiculo.equalsIgnoreCase("camion")) {
			return true;
		} else if (tipoLicencia.equalsIgnoreCase("A") && vehiculo.equalsIgnoreCase("moto")) {
			return true;
		} else {
			return false;
		}

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
