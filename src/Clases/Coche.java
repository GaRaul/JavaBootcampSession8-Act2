package Clases;

public class Coche {

	// ATRIBUTOS
	private String matricula = "";
	private String marca = "";
	private String color = "";
	private Rueda ruedasDelanteras;
	private Rueda ruedasTraseras;
	
	// CONSTRUCTOR CON ATRIBUTOS
	public Coche(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;

	}

	// GETTERS Y SETTERS
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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


	// TO STRING
	@Override
	public String toString() {
		return "Matricula: " + matricula + " | Marca: " + marca + " | Color: " + color + " | Ruedas delanteras: "
				+ ruedasDelanteras + " | Ruedas traseras: " + ruedasTraseras;
	}
	
}
