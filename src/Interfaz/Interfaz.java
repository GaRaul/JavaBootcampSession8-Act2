package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Vehiculos.*;
import Clases.Personas.*;

public class Interfaz {
	static Scanner teclado = new Scanner(System.in);

	public static ArrayList<Persona> arrayListPersonas = new ArrayList<Persona>();
	public static  ArrayList<Vehiculo> arrayListVehiculos = new ArrayList<Vehiculo>();
	
	// METODO PARA PEDIR EL TIPO DE VEHICULO
	public static String pedirTipoVehiculo() {
		System.out.println("¿Que quieres crear?\n · Coche\n · Moto\n · Camion");
		String opcion = teclado.next();

		return opcion;
	}

	// Pido los datos del vehiculo al usuario, instancio un vehiculo y lo devuelvo
	public static Vehiculo crearVehiculo() {

		// Pido el tipo de vehiculo que quiere crear al usuario
		String opcion = pedirTipoVehiculo();

		// Creo un titular y lo guardo
		Titular titular = crearTitular();

		// Instancio un vehiculo para acceder a sus metodos
		Vehiculo vehiculo = new Vehiculo();

		// Compruebo si la licencia del titular le permite conducir el vehiculo que
		// quiere crear
		if (titular.comprobarLicencia(opcion, titular.getLicencia().getTipo())) {
			// Declaro variables para los atributos de vehiculo
			String matricula, marca, color;

			// Le pido los atributos basicos del constructor del vehiculo
			do {
				System.out.println("Introduce la matricula de " + opcion + ". [4 numeros y 2-3 letras mayusculas]");
				matricula = teclado.next();
			} while (!vehiculo.comprobarMatricula(matricula)); // Mientras el usuario no introduzca una matricula
																// valida, el
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
			} while (!ruedasTraseras.comprobarDiametro(diametroTraseras)); // Mientras el usuario no introduzca un
																			// diametro
																			// valido, el bucle se repite

			// Añado los atributos a las ruedas
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

				// Añado los atributos al coche
				coche.setMatricula(matricula);
				coche.setMarca(marca);
				coche.setColor(color);

				// Le añado las ruedas al coche
				coche.setRuedasDelanteras(ruedasDelanteras);
				coche.setRuedasTraseras(ruedasTraseras);

				// Le añado el titular al coche
				coche.setTitular(titular);

				// Le pregunto si el titular sera el conductor
				if (!titularEsConductor()) {
					Conductor conductor = crearConductor(); // Creo un conductor

					// Compruebo si su licencia le permite conducir el tipo de vehiculo
					if (conductor.comprobarLicencia(opcion, conductor.getLicencia().getTipo())) {
						coche.introducirConductor(conductor); // Lo añado si se lo permite
					} else {
						System.out.println("La licencia del conductor no le permite conducir " + opcion + "."); // Muestro
																												// un
																												// mensaje
																												// si no
					}

				}
				
				arrayListVehiculos.add(coche); // Añado el coche al ArrayList de vehiculos

				// Devuelvo el vehiculo (coche)
				return coche;

			case "moto":
				// Instancio la moto
				Moto moto = new Moto();

				// Añado los atributos a la moto
				moto.setMatricula(matricula);
				moto.setMarca(marca);
				moto.setColor(color);

				// Le añado las ruedas a la moto
				moto.setRuedaDelantera(ruedasDelanteras);
				moto.setRuedaTrasera(ruedasTraseras);

				// Le añado el titular a la moto
				moto.setTitular(titular);

				// Le pregunto si el titular sera el conductor
				if (!titularEsConductor()) {
					Conductor conductor = crearConductor(); // Creo un conductor

					// Compruebo si su licencia le permite conducir el tipo de vehiculo
					if (conductor.comprobarLicencia(opcion, conductor.getLicencia().getTipo())) {
						moto.introducirConductor(conductor); // Lo añado si se lo permite
					} else {
						System.out.println("La licencia del conductor no le permite conducir " + opcion + "."); // Muestro
																												// un
																												// mensaje
																												// si no
					}

				}
				
				arrayListVehiculos.add(moto); // Añado la moto al ArrayList de vehiculos

				// Devuelvo el vehiculo (moto)
				return moto;

			case "camion":
				// Instancio el camion
				Camion camion = new Camion();

				// Añado los atributos al camion
				camion.setMatricula(matricula);
				camion.setMarca(marca);
				camion.setColor(color);

				// Le añado las ruedas al camion
				camion.setRuedasDelanteras(ruedasDelanteras);
				camion.setRuedasTraseras(ruedasTraseras);

				// Le añado el titular al camion
				camion.setTitular(titular);

				// Le pregunto si el titular sera el conductor
				if (!titularEsConductor()) {
					Conductor conductor = crearConductor(); // Creo un conductor

					// Compruebo si su licencia le permite conducir el tipo de vehiculo
					if (conductor.comprobarLicencia(opcion, conductor.getLicencia().getTipo())) {
						camion.introducirConductor(conductor); // Lo añado si se lo permite
					} else {
						System.out.println("La licencia del conductor no le permite conducir " + opcion + "."); // Muestro
																												// un
																												// mensaje
																												// si no
					}

				}
				
				arrayListVehiculos.add(camion); // Añado el camion al ArrayList de vehiculos

				// Devuelvo el vehiculo (camion)
				return camion;

			default:
				break;
			}

		} else {
			System.out.println("La licencia no es valida para conducir " + opcion + ".");
		}

		// El metodo nunca llega hasta aqui, siempre devuelve el vehiculo dentro del
		// switch
		return vehiculo;
	}

	// METODO PARA COMPROBAR SI EL TITULAR ES CONDUCTOR
	public static boolean titularEsConductor() {
		System.out.println("El titular conducirá el vehiculo? [Si - No]");
		String opcion = teclado.next();
		if (opcion.equalsIgnoreCase("si")) {
			return true;
		} else {
			return false;
		}
	}

	// METODO PARA CREAR UN TITULAR
	public static Titular crearTitular() {
		Titular titular = new Titular();

		String nombre, apellidos, fechaNacimiento, opcion;
		boolean aseguranza = false, garaje = false;

		// Le pido los datos
		System.out.println("Introduce el nombre del titular.");
		nombre = teclado.next();
		System.out.println("Introduce los apellidos del titular.");
		apellidos = teclado.next();
		System.out.println("Tiene aseguranza? | [Si - No]");
		opcion = teclado.next();
		if (opcion.equalsIgnoreCase("si")) {
			aseguranza = true;
		}

		System.out.println("Tiene garaje? | [Si - No]");
		opcion = teclado.next();
		if (opcion.equalsIgnoreCase("si")) {
			garaje = true;
		}

		System.out.println("Introduce la fecha de nacimiento del titlar. [dd/mm/yyyy]");
		fechaNacimiento = teclado.next();

		// Guardo los datos
		titular.setNombre(nombre);
		titular.setApellidos(apellidos);
		titular.setFechaNacimiento(fechaNacimiento);
		titular.setAseguranza(aseguranza);
		titular.setGaraje(garaje);
		titular.setLicencia(crearLicencia()); // Creo una licencia para guardarla en el atributo licencia del titular
		
		arrayListPersonas.add(titular); // Añado el titular al ArrayList de personas

		return titular;
	}

	// METODO PARA CREAR CONDUCTOR
	public static Conductor crearConductor() {
		Conductor conductor = new Conductor();

		String nombre, apellidos, fechaNac;

		// Pido los datos
		System.out.println("Introduce el nombre del conductor.");
		nombre = teclado.next();
		System.out.println("Introduce los apellidos del conductor.");
		apellidos = teclado.next();
		System.out.println("Introduce la fecha de nacimiento del conductor. [dd/mm/yyyy]");
		fechaNac = teclado.next();

		// Guardo los datos
		conductor.setNombre(nombre);
		conductor.setApellidos(apellidos);
		conductor.setFechaNacimiento(fechaNac);
		conductor.setLicencia(crearLicencia()); // Creo una licencia para guardarla en el atributo licencia del
												// conductor

		arrayListPersonas.add(conductor); // Añado el conductor al ArrayList de personas
		
		return conductor;
	}

	// METODO PARA CREAR LICENCIA
	public static Licencia crearLicencia() {
		Licencia licencia = new Licencia();

		// Pido los datos
		System.out.println("Introduce el ID de la licencia.");
		String id = teclado.next();
		System.out.println("Introduce el tipo de licencia. [A - B - C]\n"
				+ "A - Motos | B - Coches y Motos | C - Camiones, Coches y Motos");
		String tipo = teclado.next();
		System.out.println("Introduce el nombre completo que aparecera en la licencia.");
		String nombreComp = teclado.next();
		System.out.println("Introduce la fecha de caducidad de la licencia. [dd/mm/yyyy]");
		String fechaCad = teclado.next();

		// Guardo los datos
		licencia.setId(id);
		licencia.setTipo(tipo);
		licencia.setNombreCompleto(nombreComp);
		licencia.setFechaCaducidad(fechaCad);

		return licencia;
	}

	// METODO MENU
	public static void menu() {

		boolean salir = false;

		do {
			System.out.println( // Le pregunto que quiere hacer
					"Que quieres hacer\n1 - Crear persona\n2 - Crear vehiculo\n3 - Listar personas\n4 - Listar vehiculos\n5 - Listar todo\n6 - Salir");
			int opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("1 - Crear titular\n2 - Crear conductor"); // Le pregunto que tipo de persona quiere crear
				int opcion2 = teclado.nextInt();

				switch (opcion2) {
				
				case 1:
					crearTitular();
					break;
					
				case 2:
					crearConductor();
					break;

				default:
					break;
					
				}
				
				break;

			case 2:
				crearVehiculo();
				break;
				
			case 3:
				
				for (int i = 0; i < arrayListPersonas.size(); i++) {
					System.out.println(arrayListPersonas.get(i));
				}
				
				break;
				
			case 4:

				for (int i = 0; i < arrayListVehiculos.size(); i++) {
					System.out.println(arrayListVehiculos.get(i));
				}
				
				break;
				
			case 5:
				
				for (int i = 0; i < arrayListPersonas.size(); i++) {
					System.out.println(arrayListPersonas.get(i));
				}
				
				for (int i = 0; i < arrayListVehiculos.size(); i++) {
					System.out.println(arrayListVehiculos.get(i));
				}
				
				break;
				
			case 6:
				salir = true;
				break;

			default:
				
				break;
				
			}
			
		} while (!salir); // Hasta que no introduzca la opcion de salir, el programa se ejecuta en bucle
	}

}
