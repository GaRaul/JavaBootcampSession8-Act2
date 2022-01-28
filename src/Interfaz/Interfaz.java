package Interfaz;

import java.util.Scanner;

import Clases.*;

public class Interfaz {
	static Scanner teclado = new Scanner(System.in);

	// Pido los datos del coche al usuario, instancio un coche y lo devuelvo
	public static Coche crearCoche() {
		
		// Creo un coche vacio para acceder a sus metodos 
		Coche coche = new Coche();
		
		// Declaro variables para los atributos de coche
		String matricula, marca, color;
		
		// Le pido los atributos basicos del constructor del coche
		do { 
		System.out.println("Introduce la matriculas del coche. [4 numeros y 2-3 letras mayusculas]");
		matricula = teclado.next();
		} while (!coche.comprobarMatricula(matricula)); // Mientras el usuario no introduzca una matricula valida, el bucle se repite
		
		System.out.println("Introduce la marca del coche.");
		marca = teclado.next();
		System.out.println("Introduce el color del coche.");
		color = teclado.next();
		
		// Añado los atributos al coche
		coche.setMatricula(matricula);
		coche.setMarca(marca);
		coche.setColor(color);
		
		// Instancio las ruedas
		Rueda ruedasDelanteras = new Rueda();
		Rueda ruedasTraseras = new Rueda();
		
		// Declaro variables para guardar los atributos de las ruedas
		String marcaDelanteras, marcaTraseras;
		double diametroDelanteras, diametroTraseras;
		
		// Le pido los atributos de las ruedas al usuario
		System.out.println("Introduce la marca de las ruedas delanteras.");
		marcaDelanteras = teclado.next();
		
		do {
		System.out.println("Introduce el diametro de las ruedas delanteras. [Entre 0.4 y 4]");
		diametroDelanteras = teclado.nextDouble();
		} while (!ruedasDelanteras.comprobarDiametro(diametroDelanteras)); // Mientras el usuario no introduzca un diametro valido, el bucle se repite
		
		System.out.println("Introduce la marca de las ruedas traseras.");
		marcaTraseras = teclado.next();
		
		do {
		System.out.println("Introduce el diametro de las ruedas traseras. [Entre 0.4 y 4]");
		diametroTraseras = teclado.nextDouble();
		} while (!ruedasTraseras.comprobarDiametro(diametroTraseras)); // Mientras el usuario no introduzca un diametro valido, el bucle se repite
		
		// Añado los atributos a las ruedas
		ruedasDelanteras.setMarca(marcaDelanteras);
		ruedasDelanteras.setDiametro(diametroDelanteras);
		ruedasTraseras.setMarca(marcaTraseras);
		ruedasTraseras.setDiametro(diametroTraseras);
		
		// Le añado las ruedas al objeto coche
		coche.setRuedasDelanteras(ruedasDelanteras);
		coche.setRuedasTraseras(ruedasTraseras);
		
		// Devuelvo el coche
		return coche;
	}
	
}
