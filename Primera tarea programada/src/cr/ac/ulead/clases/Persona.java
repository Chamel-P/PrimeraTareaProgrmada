package cr.ac.ulead.clases;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class Persona implements SerializadorUlead {
	private String Nombre;
	private String Apellido;
	private String Fecha_Nacimiento;
	private String Peso;
	private int Estatura;
	private int num = 0;


	

	public Persona(String nombre, String apellido, String fecha_Nacimiento, String peso, int estatura) {
		Nombre = nombre;
		Apellido = apellido;
		Fecha_Nacimiento = fecha_Nacimiento;
		Peso = peso;
		Estatura = estatura;
	}
	public Persona() {
		
	}

	public int getEstatura() {
		return Estatura;
	}


	@Override
	public String SerializarXML() {
		num = num + 1;
		return "<?xml version=\"1.0\"?>\r\n" + " <" + "persona " + "id=\"1\">\r\n" + " <nombre>" + Nombre
				+ "</nombre>\r\n" + " <apellido>" + Apellido + "</apellido>\r\n" + " <Fecha de nacimiento>"
				+ Fecha_Nacimiento + "</Fecha de nacimiento>\r\n" + " <Peso>" + Peso + "</Peso>\r\n" + " <Estatura>"
				+ Estatura + "</Estatura>\r\n";
	}

	@Override
	public String SerializarJson() {
		
		return "{"+
				"firstName : "+Nombre+ ","+
			    "apellido : "+ Apellido+","+
			    "Fecha de nacimiento : "+Fecha_Nacimiento+","+
			    "Peso : "+Peso+","+
			    "Estatura : "+Estatura+","
				+"}";
	}

}
