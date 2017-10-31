package manejoLong;

public class Test {
	
/**
la clase Long tiene un Constructor que admite String y lo transforma en un long primitivo
 
 
El metodo estatico parseLong(String s) de la clase Long devuelve el un Long de una cadena de String que resibe como parametro 


longValue() devuelve un long primitivo de una instancia de objeto long
valueOf(String s) devuelve un objeto Long con el valor que se pase en el parametro de la cadena de String
 */

	public static void main(String[] args) {
		
		String st = "123";
		
		long m = new Long(st);
		
		long m1= Long.parseLong(st);
		
		long m2= Long.valueOf(st).longValue();
		
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
