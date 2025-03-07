package ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* Realizar un programa que solicite al usiario el nombre de un 
 * fichero de texto y muestre su contenido por pantalla. Si no
 * se propociona ningun nombre de fichero,la aplicacioin utilizara 
   por defecto prueba.txt  */ 

public class ej1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el nombre del fichero/ruta que quieres leer:");
		String ruta = sc.next();
		File ficheroP = new File("prueba.txt");
		
		File f = new File(ruta);
		if(f.exists()) {
			System.out.println("aqui tienes el contenido de tu fichero "+ ruta+ " :");
			leerFichero(f);
		}else {
			System.out.println("como no has introducido ningun fichero existente te mostraremos el de prueba.txt:");
			leerFichero(ficheroP);
		}	
	}
	
	public static void leerFichero(File f) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {				
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
