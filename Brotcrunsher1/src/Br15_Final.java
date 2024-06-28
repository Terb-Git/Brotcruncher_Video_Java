
public class Br15_Final {

	public static void main(String[] args) {
		final double PI = 3.14;//Mit final kann der Wert in der Variabeln PI nicht umgeschrieben werden
		double zahl;
		zahl = PI + 1;
		//PI = 3.90;// Versuch PI umzuschreiben, Fehler
		System.out.println(zahl);
	}

}
