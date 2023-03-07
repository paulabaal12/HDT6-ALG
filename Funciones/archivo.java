package Funciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class archivo {
    public static void main(String[] args) {
        String fileName = "ListadoProducto.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}