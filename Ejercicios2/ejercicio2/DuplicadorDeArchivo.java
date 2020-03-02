package ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class DuplicadorDeArchivo {

	private String ruta;
	private final static String NOMBRE = "Archivo.txt";

	public DuplicadorDeArchivo(String nom) {
		this.ruta = nom;
	}

	public DuplicadorDeArchivo() {
		this.ruta = NOMBRE;
	}

	public abstract boolean duplicar(String nombreArchivoCopia) throws FileNotFoundException, IOException;

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String nomFich) {
		this.ruta = nomFich;
	}

	public static String getNombre() {
		return NOMBRE;
	}
}
