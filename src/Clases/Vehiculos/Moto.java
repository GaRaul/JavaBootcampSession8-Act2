package Clases.Vehiculos;

public class Moto extends Vehiculo{

	// ATRIBUTOS
	private Rueda ruedaDelantera;
	private Rueda ruedaTrasera;
	private int ruedas = 2;
	
	// CONSTRUCTOR VACIO
	public Moto() {
		
	}

	// GETTERS Y SETTERS
	public Rueda getRuedaDelantera() {
		return ruedaDelantera;
	}

	public void setRuedaDelantera(Rueda ruedaDelantera) {
		this.ruedaDelantera = ruedaDelantera;
	}

	public Rueda getRuedaTrasera() {
		return ruedaTrasera;
	}

	public void setRuedaTrasera(Rueda ruedaTrasera) {
		this.ruedaTrasera = ruedaTrasera;
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
		return super.toString() + "Rueda delantera [" + ruedaDelantera + "] Rueda trasera [" + ruedaTrasera + "]";
	}

}
