package ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu nombre:");
		String nombre = sc.nextLine();
		System.out.println("introduce tu edad:");
		int edad = sc.nextInt();
		
		
		File f = new File("datos.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write(nombre);
			
			bw.write(edad);
			bw.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		

	}

}
