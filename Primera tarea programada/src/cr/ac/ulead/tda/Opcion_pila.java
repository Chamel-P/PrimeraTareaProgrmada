package cr.ac.ulead.tda;

import java.util.Scanner;

import cr.ac.ulead.clases.Persona;
import cr.ac.ulead.preguntas.Help;

public class Opcion_pila extends Help {
	Scanner input = new Scanner(System.in);

	static int ingreso = 0;
	static int posicion = 0;
	int inicio = 0;
	int max = 50;
	Persona persona[] = new Persona[50];

	public Opcion_pila() {
		super();
	}

	public void InsertarPila() {
		if (PilaLlena()) {
			System.out.println("La pila esta llena");
		} else {
			System.out.println("Ingrese la siguiente informacion: ");

			persona[ingreso] = new Persona(super.introducirString(), super.introducirString(), super.introducirString(),
					super.introducirString(), super.introducirInt());

			if (ingreso > 0) {
				if (persona[ingreso].getEstatura() < persona[posicion].getEstatura()) {
					posicion = ingreso;
				}

			}
			
			ingreso++;
			System.out.println("Se regitro correctamente");

		}
	}

	 private boolean PilaLlena() {
		if (Opcion_pila.ingreso-1 == persona.length) {
			return true;
		} else {
			return false;
		}
	}

	public void eliminarelemento() {
		if (PilaVacia()) {
			System.out.println("La pila no tiene a nadie");
		} else {
			ingreso--;
			System.out.println(persona[ingreso].SerializarJson());
			persona[ingreso] = null;
			System.out.println("se elimino");
		}

	}

	private boolean PilaVacia() {
		if (persona[inicio] == null) {
			return true;
		} else {
			return false;
		}
	}

	public void mostra() {
		System.out.println("---------------------------------------------");
		for (int i = max - 1; i >= 0; i--) {
			if (persona[i] != null) {
				System.out.println(persona[i].toString());
			}
		}
		System.out.println("------------------------------------------------------");

	}

	public void MenorAltura() {
		if (PilaVacia()) {
			System.out.println("La pila no tiene a nadie");
		} else {
			System.out.println("La persona con menos altura es:\n " + persona[posicion]);
		}

	}

}