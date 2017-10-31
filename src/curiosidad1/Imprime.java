package curiosidad1;

public final class Imprime {

	private String nombre;
	private static String nombreStatic;

	public Imprime() {}
	
	public Imprime(String nombre) {
		Imprime.nombreStatic = nombre;
		this.nombre = nombre;
	}

	public static Imprime falsoObjeto(){
		return new Imprime();
	}
	
	public static String getNombre(){
		return nombreStatic;
	}
	
	

}
