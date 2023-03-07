package Funciones;

import java.util.ArrayList;


public interface Imap {
    

    public String agregarProducto(String Categoria, String Producto);

    public String Mostrarcategorias(String producto);

    public String Mostrarproductosss();

    public String Mostrarproductosordenados();

    public String Mostrarinventario();

    public String MostrarinventarioOrdenado();

    public void llenardatos(ArrayList<String[]> Inventario);
}
