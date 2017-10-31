package polimorfismo;

public class Test implements ICuentaPremium{
	
/**
 * la interfaz ICuenta se implementa en ICuentaPremium que se implementa en Algoritmo1 
 * cuando se instancia getId() 
 * se ejecuta el de la interface mas proxima ya que la busqueda del metodo es de forma ascendente arrancando desde la instancia
 * 
 */
	
	public static void main(String[] args) {
		
	//Aca se tiene tres objetos de la instancia Algoritmo1()
		ICuenta a = new Test();
		System.out.println(a.getId());

		ICuentaPremium b = new Test();
		System.out.println(b.getId());

		Test c = new Test();
		System.out.println(c.getId());
		
	//Aca dos objetos de la instancia ICuentaPremium()
		ICuenta d = new ICuentaPremium() {};
		System.out.println(d.getId());
		
		ICuentaPremium e = new ICuentaPremium(){};
		System.out.println(e.getId());
		
	//Aca un objeto de la instancia Cuenta()
		ICuenta f = new ICuenta() {};
		System.out.println(f.getId());
		
/**
solo en el ultimo objeto se imprime 0000 ya que en todos el metodo que se ejecutaba era siempere el mismo porque
el punto de partida es apartir de la instancia y la busqueda es hacia arriba de la Jerarquia, en el ultimo caso el objeto es instanciado desde
el ultimo punto y solo que queda el metodo getId() pero de la interfaz ICuenta
 */
	}

}
