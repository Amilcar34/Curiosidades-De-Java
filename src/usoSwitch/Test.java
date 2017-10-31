package usoSwitch;
/*
 se imprimen todos los Sysout() que alla debajo de la validacion
 en tanto no alla un 'break' que salga del 'switch'
 */
public class Test {

	public void switchString(String input) {
		switch (input) {
		case "a":
			System.out.println("apple");
		case "b":
			System.out.println("bat");
			break;
		case "B":
			System.out.println("big bat");
		case "f":
			System.out.println("pasa por aca");
		case "g":
//			System.out.println("tambien pasa por aca");
//			break;
		default:
			System.out.println("none");

		}
	}

	public static void main(String[] args) throws Exception {
		Test tc = new Test();
		tc.switchString("B");
	}
}
