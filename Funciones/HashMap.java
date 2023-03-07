package Funciones;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;


public class HashMap implements Imap {
    private static final String[][] Listdeproductos = null;
    private String name;

    public HashMap(String name) {
        this.name = name;
    }
    /**
     *
     */
    HashMap<String, Integer> productos = new HashMap<String, Integer>();

   
    @Override
    public String agregarProducto(String Categoria, String Producto) {
        /*for (String[]producto : Listdeproductos){
            productos.put(newProductos.getName());*/
        }
        HashMap<String, String> map  = new HashMap<String, String>();

    // key-value pairs
        System.out.println("Bienvenido ");
        System.out.println("Ingrese el producto que desea agregar");
        map = sc.nextLine();
        map.put("-", " ");
        map.put("-", "");
        

    @Override
    public String Mostrarcategorias(String producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Mostrarcategorias'");
    }

    @Override
    public String Mostrarproductosss() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Mostrarproductosss'");
    }

    @Override
    public String Mostrarproductosordenados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Mostrarproductosordenados'");
    }

    @Override
    public String Mostrarinventario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Mostrarinventario'");
    }

    @Override
    public String MostrarinventarioOrdenado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MostrarinventarioOrdenado'");
    }

    @Override
    public void llenardatos(ArrayList<String[]> Inventario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'llenardatos'");
    }
    
}
