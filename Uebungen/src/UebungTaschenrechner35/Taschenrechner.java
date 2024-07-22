package UebungTaschenrechner35;

public class Taschenrechner {

	public static void main(String[] args) {
		
		int z = plus(3,4);
		int y = minus (10,5);
		System.out.println("Ergebnis: "+z);
		System.out.println("Ergebnis: "+y);
		
		/*int a;
		int b;
		
		System.out.println("Ergebnis Plus-Rechnen: "+ plus( 3,4));
		System.out.println("Ergebnis Minus-Rechnen: "+ minus(10,8));
		System.out.println("Ergebnis Mal-Rechnen: "+ mal(100,2));
		System.out.println("Ergebnis Teilen-Rechnen: "+ teilen(100,10));
		*/
	}
	public static int plus( int a, int b) {
		return a+b;
	}
	public static int minus ( int a, int b) {
		return a-b;
	}
	public static int mal ( int a, int b) {
		return a*b;
	}
	public static int teilen ( int a, int b) {
		try {
			return a/b;
		}catch (Exception ex) {
			ex.printStackTrace();
	}
		return 0;
	}
}
