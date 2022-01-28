package Clases.Personas;

public class Persona {

	// ATRIBUTOS
	private String nom = "";
	private String cognoms = "";
	private String fechaNacimiento = "";

	// CONSTRUCTOR VACIO
	public Persona() {

	}

	// CONSTRUCTOR
	public Persona(String nom, String cognoms, String fechaNacimiento) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.fechaNacimiento = fechaNacimiento;
	}

	// GETTERS Y SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognoms=" + cognoms + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
