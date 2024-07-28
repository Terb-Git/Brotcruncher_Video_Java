package Aufgabe20_Taschenrechner_Loesung;


/**Aufgabe 20 Lösung**/


/** Klasse zur Berechnung einfacher mathematischer Operationen **/
public class Taschenrechner {
	/** Addition **/
	public static int add(int x, int y) {
		return x + y;
	}

	/** Subtraktion **/
	public static int sub(int x, int y) {
		return x - y;
	}
	
	/** Multiplikation **/
	public static int mult(int x, int y) {
		return x * y;
	}
	
	/** Division **/
	public static int div(int x, int y) {
		try {
			return x / y;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}
	
	/** Main Methode zum Aufruf des Programms **/
	public static void main(String[] args) {
		int z = div(3, 1);
		System.out.println("Ergebnis: " + z);
	}
}
