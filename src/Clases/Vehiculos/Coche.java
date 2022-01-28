package Clases.Vehiculos;

public class Coche extends Vehiculo{

	// ATRIBUTOS
	private Rueda ruedasDelanteras;
	private Rueda ruedasTraseras;
	private int ruedas = 4;
	
	// CONSTRUCTOR VACIO
	public Coche() {
		
	}
	
	// CONSTRUCTOR 
	public Coche(Rueda ruedasDelanteras, Rueda ruedasTraseras) {
		super();
		this.ruedasDelanteras = ruedasDelanteras;
		this.ruedasTraseras = ruedasTraseras;
	}

	// GETTERS Y SETTERS
	public Rueda getRuedasDelanteras() {
		return ruedasDelanteras;
	}

	public void setRuedasDelanteras(Rueda ruedasDelanteras) {
		this.ruedasDelanteras = ruedasDelanteras;
	}

	public Rueda getRuedasTraseras() {
		return ruedasTraseras;
	}

	public void setRuedasTraseras(Rueda ruedasTraseras) {
		this.ruedasTraseras = ruedasTraseras;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return super.toString() + "Ruedas delanteras: " + ruedasDelanteras + " | Ruedas traseras: " + ruedasTraseras;
	}
	
	
}
