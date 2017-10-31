package polimorfismo;

public interface ICuenta {
	
	public default String getId(){
		return "0000";
	}

}
