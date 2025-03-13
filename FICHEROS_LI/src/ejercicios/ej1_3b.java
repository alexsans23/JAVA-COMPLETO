package ejercicios;
/*
 * crea un programa que duplique el contenido de un fichero. Realiza dos versiones.
 * a) pedir el nombre del fichero originar.txt en uno que se llame copia.txt
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej1_3b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el nombre del fichero que deseas copiar");
		String ruta = sc.nextLine();
		File f = new File(ruta);
		File c = new File("copia_de_"+ ruta);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
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
