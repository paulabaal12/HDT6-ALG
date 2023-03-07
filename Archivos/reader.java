package Archivos;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class reader {
	
	 public ArrayList<ArrayList<String>> leer_txt(String ruta) {
	        // StringBuilder sb = new StringBuilder();
	        ArrayList<ArrayList<String>> Categoria =  new ArrayList<ArrayList<String>>();

	        Path filePath = Paths.get("\\Archivos\\ListoProductos.txt");
	        try {
	            // Tratar de leer el archivo segun su ruta.
	            BufferedReader br = Files.newBufferedReader(filePath);
	            String linea;
	            // Lectura linea por linea del archivo.
	            while ((linea = br.readLine()) != null) {
	                String[] datosDeLinea = linea.split(",");
	                ArrayList<String> datos_temporal = new ArrayList<String>();
	                for (String dato : datosDeLinea) {
	                    datos_temporal.add(dato);
	                }
	                Categoria.add(datos_temporal);
	            }
	        } catch (IOException exception) {
	            exception.printStackTrace();
	        }
	        return Categoria;
	 }
	 
	 /**
	  * 
	  */
	 public void save_data(ArrayList<String> saveData, String ruta) {
		 File archivo;
        try {
            // Modificar la ruta del arhcivo a la ruta donde se ubica actualmente
            archivo = new File(ruta);
            if (archivo.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
                // bw.write(titulos + "\n");
                for (int i = 0; i < saveData.size(); i++) {
                    int maximo = saveData.size() - 1;
                    if (i == maximo) {
                        bw.write(saveData.get(i) + "\n");
                    } else {
                        // if (i == 0) {
                        // bw.write("\n" + datos[i] + ",");
                        // } else {
                        bw.write(saveData.get(i) + ",");
                        // }
                    }
                }
                bw.close();
            }
        } catch (IOException exception) {
            System.err.println("NO SE PUDO HACER NADA PARA ALMACENAR EN EL ARCHIVO");
        }		 
	 }

	 public void agregar_nueva_linea(String linea, String ruta){
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File(ruta), true);
			os.write(linea.getBytes(), 0, linea.length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 }
	 
	 /**
	  * 
	  * @param nombre_archivo
	  */
	 public void crear_archivo(String nombre_archivo) {
		File archivo;
		try {
		    // ruta archivos
		    archivo = new File("\\Archivos\\"+nombre_archivo + ".txt");
		    // Verificar si existe
		    if (archivo.exists()) {
		        System.out.println("el arhcivo ya existe");
		    } else if (archivo.createNewFile()) {// crear en caso de no existir
		        System.out.println("Se ha creado el archivo");
		    }
		} catch (IOException exception) {// Throwable, excepcion padre (general) de todas las excepciones.
		    System.err.println("No se ha creado el archivo");
		}
	 }
}
