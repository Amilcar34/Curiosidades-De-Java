package exception;

public class Test {
/**
 1)Se crea un objeto del tipo test en un metodo preparado para lanzar una excepsion
 del tipo Exception
 
 2)el objeto instancia el primer metodo preparado para lanzar una excepsion
 del tipo Exception y lo ejecuta
 
 3) el primer metodo ejecuta el segundo  metodo preparado para lanzar una excepsion
 del tipo Exception que lanza una excepsion del tipo Exception
 
 4)el objeto del tipo Exeption es lanzado y no capturado por ninguno de los metodos
 
 5) reccorre cada metodo llegando hasta el main y se muestra en consola
 el que se a lanzado un objeto en el hilo main y su recorrido 
 */

	    public static void main(String[] args) throws Exception{
	    	Test tc = new Test();
	        tc.myMethod();
	    }
	    
	    public void myMethod() throws Exception {
	        yourMethod();
	    }
	    
	    public void yourMethod() throws Exception {
	        throw new Exception();
	    }

}
