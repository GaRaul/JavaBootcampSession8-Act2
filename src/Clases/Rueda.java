package Clases;

public class Rueda {

	// ATRIBUTOS
	private String marca;
	private double diametro;
	
	// CONSTRUCTOR VACIO
	public Rueda() {
		
	}
	
	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Rueda(String marca, double diametro) {
		this.marca = marca;
		this.diametro = diametro;
	}

	// GETTERS Y SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Marca: " + marca + " | Diametro: " + diametro;
	}
	
}
