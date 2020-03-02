package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DuplicadorValidado extends DuplicadorDeArchivo {

	public DuplicadorValidado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicadorValidado(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean duplicar(String nombreArchivoCopia) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		char[] excepciones = { 'a', 'z', 'h' };
		File f = new File(getRuta());
		if (f.exists()) {
			FileReader in = new FileReader(f);
			FileWriter out = new FileWriter(nombreArchivoCopia);
			int n = in.read();
			while (n != -1) {
				boolean yaEsta = false;
				for (int i = 0; i < excepciones.length; i++) {
					if (excepciones[i] == (char) n) {
						yaEsta = true;
					}
				}
				if (yaEsta == false) {
					out.write((char) n);
				}
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
