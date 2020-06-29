package cr.ac.ulead.tda;

import java.util.Scanner;

import cr.ac.ulead.clases.Mascota;

public class OpcionCola extends Opcion_pila {
	static int iniciar = 0;
	static int ingreso = 0;
	Scanner input = new Scanner(System.in);
	Mascota[] mascota = new Mascota[5];

	public void IngresarCola() {
		if (PilaLlena()) {
			System.out.println("La cola esta llena");
		} else {
			System.out.println("Ingrese la siguiente informacion: ");
			mascota[(iniciar + ingreso % mascota.length)] = new Mascota(super.introducirmascota(),
					super.introducirmascota(), super.introducirmascota());
			ingreso++;
			System.out.println("Se regitro correctamente");

		}

	}
	public void eliminarelemento() {
		if (PilaVaciaa()) {
			System.out.println("La pila no tiene a nadie");
		} else {
			System.out.println(mascota[iniciar].SerializarJson());
			mascota[iniciar] = null;
			ingreso--;
			iniciar = (iniciar + 1 % mascota.length);
			System.out.println("se elimino");
		}
	}

	private boolean PilaVaciaa() {
		if (mascota[inicio] == null) {
			return true;
		} else {
			return false;
		}

	}
	private boolean PilaLlena() {
		if (OpcionCola.ingreso-1 == mascota.length) {
			return true;
		} else {
			return false;
		}
	}
	public void mostrar() {
		System.out.println("---------------------------------------------");
		
		int contador=iniciar;
		for (int i = 0; i <= ingreso; i++) {
			if (mascota[i] != null) {
				System.out.println(mascota[i].SerializarJson());
			 contador++;
			}else if (i==(ingreso-iniciar)) {
				contador=0;
			}else {
				contador++;
			}
		}
		System.out.println("------------------------------------------------------");

		
	}

}
