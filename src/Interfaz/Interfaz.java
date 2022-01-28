package Interfaz;

import java.util.Scanner;

import Clases.*;

public class Interfaz {
	static Scanner teclado = new Scanner(System.in);

	// Pido los datos del coche al usuario, instancio un coche y lo devuelvo
	public static Coche crearCoche() {
		String matricula, marca, color;
		
		// Le pido los atributos basicos del constructor del coche
		System.out.println("Introduce la matriculas del coche.");
		matricula = teclado.next();
		System.out.println("Introduce la marca del coche.");
		marca = teclado.next();
		System.out.println("Introduce el color del coche.");
		color = teclado.next();
		
		// Construyo el coche
		Coche coche = new Coche(matricula, marca, color);
		
		String marcaDelanteras;
		double diametroDelanteras;
		String marcaTraseras;
		double diametroTraseras;
		
		// Le pido los atributos de las ruedas al usuario
		System.out.println("Introduce la marca de las ruedas delanteras.");
		marcaDelanteras = teclado.next();
		System.out.println("Introduce el diametro de las ruedas delanteras.");
		diametroDelanteras = teclado.nextDouble();
		System.out.println("Introduce la marca de las ruedas traseras.");
		marcaTraseras = teclado.next();
		System.out.println("Introduce el diametro de las ruedas traseras.");
		diametroTraseras = teclado.nextDouble();
		
		// Construyo las ruedas
		Rueda ruedasDelanteras = new Rueda(marcaDelanteras, diametroDelanteras);
		Rueda ruedasTraseras = new Rueda(marcaTraseras, diametroTraseras);
		
		// Le añado las ruedas al objeto coche
		coche.setRuedasDelanteras(ruedasDelanteras);
		coche.setRuedasTraseras(ruedasTraseras);
		
		// Devuelvo el coche
		return coche;
	}
	
}
