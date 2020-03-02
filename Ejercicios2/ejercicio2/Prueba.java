package ejercicio2;

import java.io.IOException;

public class Prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		DuplicadorCar dc1 = new DuplicadorCar("Ejer2.txt");
		dc1.duplicar("CopyCarEjer2");
		
		DuplicadorPorBloque dpb = new DuplicadorPorBloque("Ejer2.txt");
		dpb.duplicar("CopyBloqEjer2");
		
		DuplicadorValidado dv = new DuplicadorValidado("Ejer2.txt");
		dv.duplicar("CopyValEjer2");
	}

}
