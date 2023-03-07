package Funciones;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;

public class main {
	public static void main(String[] args) {
        BufferedReader reader;
        String line;
        int noOfLines=0;
        /*reader = new BufferedReader(new FileReader("datos.txt"));
        while (reader.readLine() != null) {
            noOfLines++;
        }
        reader = new BufferedReader(new FileReader("datos.txt"));
        for(int l=0; l<noOfLines;l++){
        }}*/
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. HashMap ");
            System.out.println("2. TreeMap ");
            System.out.println("3. LinkedHashMap");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

}






