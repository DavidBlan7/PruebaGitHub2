package ejercicio3;

import java.io.IOException;

public class Prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		GestionAgenda ga = new GestionAgenda("Agenda.txt");

		Persona p = new Persona("Jose", 56, "999777555", "Bilbao");
		ga.anadePersona(p);

		Persona p1 = new Persona("Aitor", 45, "444222999", "Miranda");
		ga.anadePersona(p1);

		ga.ver();
		
		System.out.println(ga.buscaPersona("Aitor").toString());
	}

}
