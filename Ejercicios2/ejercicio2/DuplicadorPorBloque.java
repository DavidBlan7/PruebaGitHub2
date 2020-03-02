package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DuplicadorPorBloque extends DuplicadorDeArchivo {

	
	public DuplicadorPorBloque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicadorPorBloque(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean duplicar(String nombreArchivoCopia) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		File f = new File(getRuta());
		if (f.exists()) {
			FileReader in = new FileReader(f);
			FileWriter out = new FileWriter(nombreArchivoCopia);
			char[] buffer =new char[20];
			int n = in.read(buffer);
			while (n != -1) {
				out.write(buffer, 0 , n);
				n = in.read(buffer);
			}
			in.close();
			out.close();
			return true;

		}else {
			System.out.println("El archivo no existe");
			return false;
		}
	}
}