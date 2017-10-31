package usoDeGuionBajo;

public class Test {

	public static void main(String[] args) {

/** 
 Puedes usar guiones bajos para todos los tipos de números,
sina fectar la interpretacion del numero para el compilador
incluidos long, double, float, binary y hex. 
Por ejemplo, los siguientes son todos números válidos- 
*/
		
		int hex = 0xCAFE_BABE;
		System.out.println(hex);
		hex++;
		System.out.println(hex);
		System.out.println();

		int bin = 0b1111_0000_1100_1100;
		System.out.println(bin);
		bin++;
		System.out.println(bin);
		System.out.println();

		float f =9899___8_7854678.33_333f;
		System.out.println(f);
		f++;
		f++;
		f ++;
		System.out.println(f);
		f =
				+1;
		System.out.println(f);

	}

}
