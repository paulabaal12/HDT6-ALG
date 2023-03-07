package Funciones;

public class Interaction {
    
    
        public int Menu_principal() {
		String[] options = {"HashMap", "TreeMap", "LinkedHashMap", "Salida"};
	    System.out.println("\nMenu principal, Escoge una opción:)\n");
	    for(int i = 0; i < options.length; i++) {
	    	System.out.println((i+1) + ". " + options[i]);
	    }
	    return options.length;
    }

    public void Welcome(){
        System.out.println( "Bienvenido a nuestro programa");
      }
    
        public void welcome() {
            System.out.println("Bienvenido x2 !");
        }
        
        public void end_sys() {
            System.out.println("Saliendo...");
        }

/**
 	 * 
 	 * @param amountOptions
 	 * @return
 	 */
      public int selection(int amountOptions) {
		int selection = 0;
		boolean next_step = false;
		do {
			try {
				selection = Integer.parseInt(("Ingrese una de las opciones"));
				if(selection < 1 || selection > amountOptions) {
					System.err.println("DEBE INGRESAR UNA OPCION VALIDA");
				}else {
					next_step = true;
				}
			}catch(NumberFormatException e){
				System.err.println("DEBE INGRESAR UN VALOR NUMERICO");
			}
			
		}while(!next_step);
		return selection;
	}

}

