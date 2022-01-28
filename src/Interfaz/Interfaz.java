package Interfaz;

import java.util.Scanner;

import Clases.*;
import Clases.Vehiculos.Camion;
import Clases.Vehiculos.Coche;
import Clases.Vehiculos.Moto;
import Clases.Vehiculos.Rueda;
import Clases.Vehiculos.Vehiculo;

public class Interfaz {
	static Scanner teclado = new Scanner(System.in);

	public static String pedirTipo() {
		System.out.println("�Que quieres crear?\n � Coche\n � Moto\n � Camion");
		String opcion = teclado.next();

		return opcion;
	}

	// Pido los datos del vehiculo al usuario, instancio un vehiculo y lo devuelvo
	public static Vehiculo crearVehiculo() {

		String opcion = pedirTipo();

		// Instancio un vehiculo para acceder a sus metodos
		Vehiculo vehiculo = new Vehiculo();

		// Declaro variables para los atributos de vehiculo
		String matricula, marca, color;

		// Le pido los atributos basicos del constructor del vehiculo
		do {
			System.out.println("Introduce la matricula de " + opcion + ". [4 numeros y 2-3 letras mayusculas]");
			matricula = teclado.next();
		} while (!vehiculo.comprobarMatricula(matricula)); // Mientras el usuario no introduzca una matricula valida, el
															// bucle se repite

		System.out.println("Introduce la marca de " + opcion + ".");
		marca = teclado.next();
		System.out.println("Introduce el color de " + opcion + ".");
		color = teclado.next();

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
		} while (!ruedasDelanteras.comprobarDiametro(diametroDelanteras)); // Mientras el usuario no introduzca un
																			// diametro valido, el bucle se repite

		System.out.println("Introduce la marca de las ruedas traseras.");
		marcaTraseras = teclado.next();

		do {
			System.out.println("Introduce el diametro de las ruedas traseras. [Entre 0.4 y 4]");
			diametroTraseras = teclado.nextDouble();
		} while (!ruedasTraseras.comprobarDiametro(diametroTraseras)); // Mientras el usuario no introduzca un diametro
																		// valido, el bucle se repite

		// A�ado los atributos a las ruedas
		ruedasDelanteras.setMarca(marcaDelanteras);
		ruedasDelanteras.setDiametro(diametroDelanteras);
		ruedasTraseras.setMarca(marcaTraseras);
		ruedasTraseras.setDiametro(diametroTraseras);

		// Paso la opcion a minusculas para que entre en un case
		opcion = opcion.toLowerCase();
		switch (opcion) {
		case "coche":
			// Instancio el coche
			Coche coche = new Coche();

			// A�ado los atributos al coche
			coche.setMatricula(matricula);
			coche.setMarca(marca);
			coche.setColor(color);

			// Le a�ado las ruedas al coche
			coche.setRuedasDelanteras(ruedasDelanteras);
			coche.setRuedasTraseras(ruedasTraseras);

			// Devuelvo el vehiculo (coche)
			return coche;

		case "moto":
			// Instancio la moto
			Moto moto = new Moto();

			// A�ado los atributos a la moto
			moto.setMatricula(matricula);
			moto.setMarca(marca);
			moto.setColor(color);

			// Le a�ado las ruedas a la moto
			moto.setRuedaDelantera(ruedasDelanteras);
			moto.setRuedaTrasera(ruedasTraseras);

			// Devuelvo el vehiculo (moto)
			return moto;

		case "camion":
			// Instancio el camion
			Camion camion = new Camion();

			// A�ado los atributos al camion
			camion.setMatricula(matricula);
			camion.setMarca(marca);
			camion.setColor(color);

			// Le a�ado las ruedas al camion
			camion.setRuedasDelanteras(ruedasDelanteras);
			camion.setRuedasTraseras(ruedasTraseras);

			// Devuelvo el vehiculo (camion)
			return camion;

		default:
			break;
		}

		// El metodo nunca llega hasta aqui, siempre devuelve el vehiculo dentro del
		// switch
		return vehiculo;
	}

}
