package Clases.Personas;

public class Titular extends Persona{
	
	// ATRIBUTOS
	private Licencia licencia;
	private boolean aseguranza = false;
	private boolean garaje = false;
	
	// CONSTRUCTOR VACIO
	public Titular() {
		
	}
	
	// CONSTRUCTOR
	public Titular(Licencia licencia, boolean aseguranza, boolean garaje) {
		super();
		this.licencia = licencia;
		this.aseguranza = aseguranza;
		this.garaje = garaje;
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

	public boolean isAseguranza() {
		return aseguranza;
	}

	public void setAseguranza(boolean aseguranza) {
		this.aseguranza = aseguranza;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Titular [licencia=" + licencia + ", aseguranza=" + aseguranza + ", garaje=" + garaje + "]";
	}
	
	
	
}
