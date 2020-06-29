package cr.ac.ulead.tda;

import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	Opcion_pila Op = new Opcion_pila();
	OpcionCola Oc = new OpcionCola();
	
	public void menuPila() {
		
		System.out.println("¿Cuál opcion desea realizar?");
		System.out.println("1. Registrar datos");
		System.out.println("2. Eliminar datos");
		System.out.println("3. Ver elementos de la pila");
		System.out.println("4. Salir");

		switch (input.nextInt()) {
		case 1:
			Op.InsertarPila();
			menuPila();
			break;
		case 2:
			Op.eliminarelemento();
			menuPila();
			break;
		case 3:
			Op.mostra();
			menuPila();
			break;
		case 4:
			System.out.println("Ha salido :C");
			break;
		default:
			System.out.println("Opcion desconocida");
			menuPila();
		}

	}
	public void MenuPila_TercerMain() {
		System.out.println("¿Cuál opcion desea realizar?");
		System.out.println("1. Registrar datos");
		System.out.println("2. Eliminar datos");
		System.out.println("3. Ver elementos de la pila");
		System.out.println("4. Menos altura");
		System.out.println("5. Salir ");

		switch (input.nextInt()) {
		case 1:
			Op.InsertarPila();
			MenuPila_TercerMain();
			break;
		case 2:
			Op.eliminarelemento();
			MenuPila_TercerMain();
			break;
		case 3:
			Op.mostra();
			MenuPila_TercerMain();
			break;
		case 4:
			Op.MenorAltura();
			MenuPila_TercerMain();
			break;
		case 5:
			System.out.println("Ha salido :C");
			break;
		default:
			System.out.println("Opcion desconocida");
			MenuPila_TercerMain();
		}
	}
	
	public void MenuCola_puntoC() {
		System.out.println("¿Cuál opcion desea realizar?");
		System.out.println("1. Registrar dato");
		System.out.println("2. Eliminar dato");
		System.out.println("3. Ver elementos de la cola");
		System.out.println("5. Salir ");
		
		switch (input.nextInt()) {
		case 1:
			Oc.IngresarCola();
			MenuCola_puntoC();
			break;
		case 2:
			Oc.eliminarelemento();
			MenuCola_puntoC();
			break;
		case 3:
			Oc.mostrar();
			MenuCola_puntoC();
			break;
		case 4:
			System.out.println("Ha salido :C");
			break;
		default:
			System.out.println("Opcion desconocida");
			MenuCola_puntoC();
		}
	}
}
