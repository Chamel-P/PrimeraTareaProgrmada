package cr.ac.ulead.preguntas;

import java.util.Scanner;

import cr.ac.ulead.clases.Mascota;
import cr.ac.ulead.clases.Persona;

public class Help {
	Scanner input = new Scanner(System.in);
	int num;
	Persona persona;
	Mascota pets;
	int contador;

	public void menu() {
		System.out.println("Que quiere regristrar?\n1)Persona\n2)Mascota\n3)No hacer nada");

		switch (input.nextInt()) {
		case 1:
			registro1();
			menu();
			break;
		case 2:
			registro2();
			menu();
			break;
		case 3:
			System.out.println("Hasta luego, Feliz dia");
			break;
		default:
			System.out.println("Opcion invalida\nElija de nuevo\n");
			menu();
			break;
		}
	}

	private void registro2() {
		contador = 0;
		System.out.println("introduzca dato de la mascota: ");
		input.nextLine();
		pets = new Mascota(introducirmascota(), introducirmascota(), introducirmascota());
		seleccionpet();
	}

	protected String introducirmascota() {
		String[] Mascota = { "Nombre: ", "Tipo de animal: ", "Edad: " };
		System.out.print(Mascota[contador]);
		contador++;
		if (contador == 3) {
			contador = 0;
		}
		return input.nextLine();
	}

	private void seleccionpet() {
		System.out.println("En que formato ?\n1-)XML\n2-)Json");

		switch (input.nextLine()) {
		case "1":
			System.out.println(pets.SerializarXML());
			break;
		case "2":
			System.out.println(pets.SerializarJson());
			break;
		default:
			System.out.println("Opcion no valida, introduzca de nuevo ");
			seleccionpet();
			break;
		}
	}

	private void registro1() {
		contador = 0;
		System.out.println("introduzca dato de la persona: ");
		input.nextLine();
		persona = new Persona(introducirString(), introducirString(), introducirString(), introducirString(),
				introducirInt());
		seleccion();
	}

	protected String introducirString() {
		String[] info_persona = { "Nombre: ", "Apellido: ", "Fecha de nacimiento: ", "Peso: ", "Estatura: " };
		System.out.print(info_persona[contador]);
		contador++;
		if (contador == 5) {
			contador = 0;
		}
		return input.nextLine();

	}

	protected int introducirInt() {
		System.out.print("Estatura: ");

		return input.nextInt();

	}

	private void seleccion() {
		System.out.println("En que formato ?\n1-)XML\n2-)Json");
		input.nextLine();
		switch (input.nextLine()) {
		case "1":
			System.out.println(persona.SerializarXML());
			break;

		case "2":
			System.out.println(persona.SerializarJson());
			break;

		default:
			System.out.println("Opcion no valida, introduzca de nuevo ");
			seleccion();
			break;
		}
	}
}
