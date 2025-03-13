package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * realiza un prgrama que lea un fichero de texto llamado carta.txt, tenemos que
 * contar los caracteres, las lineas y las palabra. Para facilitar el procesamiento 
 * supondremos que cada palabra esta separada de otra por un unico espacio en blanco
 */
public class ej1_4 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("carta.txt"));
			int contLineas = 0;
			int contLetras = 0;
			int contPalabras;
			String linea;
			while((linea = br.readLine()) != null) {
				contLineas++;
			}
			int c;
			while((c =  br.read()) != -1) {
				if (Character.toString((char) c).matches("[a-zA-Z]")) {
					contLetras++;
				}
	
			}
			while((c =  br.read()) != -1) {
				if (Character.toString((char) c).matches("[a-zA-Z]")) {
					contLetras++;
				}
	
			}
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println(contLineas);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
