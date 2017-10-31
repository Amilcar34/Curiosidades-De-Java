package exception;
/**
 no es muy dificil de entender
 hay que agregar que como metodo() esta vacio se ejecuta pero no realiza nada
 hay quienes podrian pensar que esto lanzaria una excepcion 
 u error de compilacion pero no es asi
 
 no habiendo excepciones se imprime 'try'
 ABAJO se imprime 'finally'
 ALADO se imprime 'out'
 */
public class MetodoBasio {
	
	   public static void main(String[] args) throws Exception{
		     
		   try{
		         metodo();
		         System.out.println("try ");
		      }
		      catch(Exception e){
		         System.out.print("catch ");
		      }
		      finally   {
		         System.out.print("finally ");
		      }
		      System.out.print("out ");
		   }
	   
		   public static void metodo(){
			   ;
		   }

}
