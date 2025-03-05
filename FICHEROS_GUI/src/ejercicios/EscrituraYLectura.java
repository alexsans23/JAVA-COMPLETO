package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraYLectura {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---------MENU--------- \n 1. Escribir un archivo  \n 2. Leer un archivo \n 3. Salir del programa \n");
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la ruta/nombre del archivo en el que quieres escribir.");
                    
                    break;

                case 2:
                    System.out.println("Introduce la ruta/nombre del fichero que quieres leer:");
                    String ruta = sc.nextLine(); // Permite capturar nombres de archivo con espacios
                    File f = new File(ruta);

                    if (f.exists()) {
                        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                            String linea = null;
                            while (( br.readLine()) != null) { // Guarda la línea antes de imprimirla
                                System.out.println(linea);
                            }
                        }
                    } else {
                        System.out.println("El fichero que intentas leer no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
