package Taschenrechner35.prof;

public class Teilen {
	public static int teil (int zahl1, int zahl2) {
		try {// Abfangen der 0 Division
		return zahl1/zahl2;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}System.out.println("Division durch 0 nicht möglich!");
		return 0;
		
}
}