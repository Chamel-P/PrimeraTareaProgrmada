package cr.ac.ulead.clases;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class Mascota implements SerializadorUlead{
private String Nombre;
private String Tipo_Animal;
private String Edad;

public Mascota(String nombre, String tipo_Animal, String edad) {
	Nombre = nombre;
	Tipo_Animal = tipo_Animal;
	Edad = edad;
}

@Override
public String SerializarXML() {
	
	
	return "<?xml version=\"1.0\"?>\r\n" + 
			" < Mascota "+"id="+"\"1\""+">\r\n" + 
			" <nombre>"+Nombre+"</nombre>\r\n" + 
			" <Tipo de animal>"+Tipo_Animal+"</Tipo de animal>\r\n" + 
			" <Edad>"+Edad+"</Edad>\r\n";
}

@Override
public String SerializarJson() {
	
	return "{\n"+
			"Nomnre : "+Nombre+ ",\n"+
		    "Tipo de animal : "+ Tipo_Animal+",\n"+
		    "Edad : "+Edad+",\n"
			+"}\n";
}

}

