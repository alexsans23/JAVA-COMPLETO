package ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * crea un programa que duplique el contenido de un fichero. Realiza dos versiones.
 * b)Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre
 * con el prefijo "copia_de_".
 */

public class ej1_3a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File o = new File("original.txt");
		File c = new File("copia.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(o));
			BufferedWriter bw = new BufferedWriter(new FileWriter(c));
			
			String linea;
			while((linea = br.readLine()) != null) {
				bw.write(linea);
				bw.newLine();
			}					
			br.close();
			bw.close();
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
