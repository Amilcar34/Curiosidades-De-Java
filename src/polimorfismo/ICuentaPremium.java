package polimorfismo;

public interface ICuentaPremium extends ICuenta {
	
	default String getId(){
		return "1111";
	}
	

}
