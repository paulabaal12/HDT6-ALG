

public class Interaction {
    

    public int verificacion_programa(int valor) {
        int opcion = 0;
        boolean pasar = false;
        do {
            try {
                opcion = Integer.parseInt(("Ingrese una de las opciones proveidas"));
                if ((opcion <= 0) || (opcion > valor)) {
                    System.err.println(fuera_de_rango());
                } else {
                    pasar = true;
                }
            } catch (NumberFormatException exception) {
                System.err.println(mal_dato());
            }
        } while (!pasar);
        return opcion;
    }

    public void bienvenida() {
        System.out.println("\nIniciando...");
        System.out.println("Bienvenido al sistema ");
    }
   
    public void despedida() {
        System.out.println("\nMuchas gracias por haber utilizado nuestro sistema.");
    }

    public String mal_dato() {
        String respuesta = "\nDEBE INGRESAR UN VALOR NUMERICO";
        return respuesta;
    }

    public String fuera_de_rango() {
        String respuesta = "\nDEBE INGRESAR UN VALOR SEGUN LAS OPCIONES DEL MENU";
        return respuesta;
    }


    private void inicio() {
        System.out.println("");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
    }

    private void Hashmap_menu() {
        System.out.println("\nSELECCIONE UNA DE LAS OPCIONES");
        System.out.println("1.Agregar un producto a la colección");
        System.out.println("2.Mostrar la categoría del producto");
        System.out.println("3.Mostrar los datos del producto, categoría y la cantidad de cada artículo");
        System.out.println("4.Mostrar los datos del producto, categoría y la cantidad de cada artículo ordenadas");
        System.out.println("5.Mostrar el producto y la categoría de todo el inventario.");
        System.out.println("6.Mostrar el producto y la categoría existentes, ordenadas por tipo. ");
    }

    public byte verificacion_entrada(byte valor) {
        byte opcion = 0;
        boolean pasar = false;
        do {
            if (valor == 3) {
                inicio();
            } else if (valor == 10) {
                Hashmap_menu();}
            try {
                opcion = Byte.parseByte(("Ingrese una de las opciones del menu"));
                if ((opcion <= 0) || (opcion > valor)) {
                    System.err.println(fuera_de_rango());
                } else {
                    pasar = true;
                }
            } catch (NumberFormatException exception) {
                System.err.println(mal_dato());
            }

        } while (!pasar);
        return opcion;
    }

}


