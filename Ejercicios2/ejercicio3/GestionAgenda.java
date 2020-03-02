package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestionAgenda {

	private String nomFich;

	public GestionAgenda(String nomFich) {
		this.nomFich = nomFich;
	}

	public void ver() throws IOException {
		File f = new File(nomFich);
		if (f.exists()) {
			BufferedReader in = new BufferedReader(new FileReader(f));
			String linea = in.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = in.readLine();
			}
			in.close();
			System.out.println();
		} else {
			System.out.println("No existe el fichero");
		}
	}

	public void anadePersona(Persona otraPersona) throws IOException {
		File f = new File(nomFich);
		BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
		String linea = otraPersona.toString();
		bw.newLine();
		bw.write(linea);
		bw.close();
	}

	public Persona buscaPersona(String nombre) {
		String linea = nombre.toString();
		if (nombreEnLinea(linea, nombre) == true) {
			return transforma(linea);
		} else {
			return null;
		}
	}

	public static boolean nombreEnLinea(String linea, String nombre) {
		String[] aux = linea.split("\t");
		if (aux[2].equals(nombre)) {
			return true;
		}
		return false;
	}

	public static Persona transforma(String linea) {
		String[] aux = linea.split("\t");
		Persona per = new Persona(aux[2], Integer.valueOf(aux[1]), aux[0], aux[3]);
		return per;
	}

	public void eliminaPersona(Persona persona) throws IOException {
		File f = new File(nomFich);
		ArrayList<Persona> aux = new ArrayList<Persona>();
		if (f.exists()) {
			BufferedReader in = new BufferedReader(new FileReader(f));
			String linea = in.readLine();
			while (linea != null) {
				if (!linea.equals(persona.toString())) {
					aux.add(transforma(linea));
				}
			}
			in.close();
			for (Persona p : aux) {
				anadePersona(p);
			}

		} else {
			System.out.println("No existe el fichero");
		}
	}
}
