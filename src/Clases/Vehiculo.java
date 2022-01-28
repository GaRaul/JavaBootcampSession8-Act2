package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {

	// ATRIBUTOS
	private String matricula = "";
	private String marca = "";
	private String color = "";

	// CONSTRUCTOR VACIO
	public Vehiculo() {
		
	}
	
	// CONSTRUCTOR CON ATRIBUTOS
	public Vehiculo(String matricula, String marca, String color) {
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


	// TO STRING
	@Override
	public String toString() {
		return "Matricula: " + matricula + " | Marca: " + marca + " | Color: " + color + " | ";
	}
	
}
