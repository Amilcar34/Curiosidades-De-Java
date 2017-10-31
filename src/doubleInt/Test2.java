package doubleInt;

public class Test2 {

/**
los tipos de dato int se comprenden en un valor de 32 bits que va desde -2147483648 hasta 2147483647 osea 2^31 hasta (2^31) - 1
los tipos de dato double se comprenden en un valor de 64 bits 

En ejecusion los metodos son buscados por orden, 
como hay dos metodos con el mismo nombre se ejecuta siempre que debuelve un DOUBLE 

asique:
h.get() -> 1.0 y en 'd' no se puede almacenar nada ya que el compilador no puede convertir de double a int
al ajacutarlo nos va a lanzar una exeption especificando dicho problema

 */
	
	public static void main(String[] args) {
		Test2 h = new Test2();
		
        								//System.out.println(t);
		int i = h.get();
										//System.out.println(i);
        double d = h.get();
        								//System.out.println(d);
        System.out.println( i + d );
   }

	public double get(){ 
		return 3.0;
	}

	public int get() {
       return 1;
   }


}
