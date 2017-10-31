package charInt;

public final class Test {

	public static void main(String[] args) {

/**
 * aca tenemos dos variables:
 * Una del tipo Char (caracter) y otra del tipo Int (numero entero)
 */
		char let;
		int num;
	
		//A 'let' le asignamos c y la imprimimos
		let='c';
		System.out.println(let);
		
		//Le sumamos un valor de la tabla Ascii: 
		//c -> d   =   99 -> 100
		let++;
		System.out.println(let);
		
		//como los char son de un rango de bits de 	-128 a 127
		//y los int son de -32768 a 32767
		//se puede copiar en un int un char (nunca al revez)
		//se almacena en el numero el numero correspondiente a la tabla Ascii
		num=let;
		System.out.println(num);
		
		//a ese numerico se le suma un valor
		num++;
		System.out.println(num);
	}

}
