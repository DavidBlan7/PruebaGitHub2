
package Ejercicio1;

diferente

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		File f = new File("nums");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		
		num =pedirNumero();
	
		while (num != 0) {
			dos.writeInt(num);
			num = pedirNumero();
		} 
		dos.close();
		DataInputStream dis = new DataInputStream(new FileInputStream(f));
		BufferedWriter fs = new BufferedWriter(new FileWriter("nums.txt", true));
		while (dis.available() > 0) {

			fs.write(String.valueOf(dis.readInt()));
			fs.newLine();
		}
		fs.close();
		dis.close();
		System.out.println("Salida del programa");
	}
	
	public static int pedirNumero () {
		System.out.println("Introduce un número(O para finalizar)");
		int num = Consola.leeInt();
		return num;
	}

}
>>>>>>> e43ae7402019d1407fd93f518511cd7c034da6b6
