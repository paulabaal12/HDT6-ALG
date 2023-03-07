package Archivos;
import java.io.*;

public class archivoss {
    

    public static void main(String[] args) {
        
        String filePath = "C:/Archivos\\ListoProductos.txt";
        File file = new File(filePath);
        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
            FileWriter fileWriter = new FileWriter(file);
//Para escbir 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          
            bufferedWriter.write("Hello, world!");
            
            // Close the FileWriter and BufferedWriter objects
            bufferedWriter.close();
            fileWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


