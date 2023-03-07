
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class archivo {
    public static void main(String[] args) {
        String fileName = "ListadoProducto.txt";
        String line = null;
        Scanner scanner = new Scanner(fileName);

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] columnas = line.split("|"); // Separador de columna
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}