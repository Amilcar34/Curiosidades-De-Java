package curiosidad1;

public final class Test {

/**
 * Aca tenemos un pequeño programa del cual atravez 
 * de un metodo static se instancia un metodo dinamico
 * teniendo de por medio un metodo estatico 
 * que retorna un objeto del tipo de la clase

 * En este caso de la clase Imprime
 */

	public static void main(String[] args) {
		
		Imprime im = new Imprime("Juan");
		
		System.out.println(Imprime.falsoObjeto().getNombre());
		
	}

}
