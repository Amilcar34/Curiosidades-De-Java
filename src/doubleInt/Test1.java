package doubleInt;

public class Test1 {

/**
los tipos de dato int se comprenden en un valor de 32 bits que va desde -2147483648 hasta 2147483647 osea 2^31 hasta (2^31) - 1
los tipos de dato double se comprenden en un valor de 64 bits 

En ejecusion los metodos son buscados por orden, 
como hay dos metodos con el mismo nombre se ejecuta siempre que debuelve un int 

asique:
t.get() -> 1 y en 'd' se almacena 1.0

 */
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		
        								//System.out.println(t);
		int i = t.get();
										//System.out.println(i);
        double d = t.get();
        								//System.out.println(d);
        System.out.println( i + d );
   }

   public int get() {
       return 1;
   }

   public double get(){ 
       return 3.0;
   }

}