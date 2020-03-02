package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DuplicadorCar extends DuplicadorDeArchivo {

	
	public DuplicadorCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicadorCar(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean duplicar(String nombreArchivoCopia) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(getRuta());
		if (f.exists()) {
			FileReader in = new FileReader(f);
			FileWriter out = new FileWriter(nombreArchivoCopia);
			int n = in.read();
			while (n != -1) {
				out.write((char)n);
				n = in.read();
			}
			in.close();
			out.close();
			return true;

		} else {
			System.out.println("El archivo no existe");
			return false;
		}
	}
}
