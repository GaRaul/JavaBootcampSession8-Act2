package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coche {

	// ATRIBUTOS
	private String matricula = "";
	private String marca = "";
	private String color = "";
	private Rueda ruedasDelanteras;
	private Rueda ruedasTraseras;
	
	public Coche() {
		
	}
	
	// CONSTRUCTOR CON ATRIBUTOS
	public Coche(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;

	}
	
	public boolean comprobarMatricula(String matricula){
		Pattern pat = Pattern.compile("^[0-9]{4}[A-Z]{2,3}$");
		Matcher mat = pat.matcher(matricula);
		if (mat.find()) {
			return true;
		} else {
			return false;
		}
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
