package Rueckgabewert;

public class Taschenrechner {

	public int addieren(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}
	
	public int minus(int zahl1, int zahl2) {
		return zahl1 - zahl2;
	}
	public int mal(int zahl1, int zahl2) {
		return zahl1 * zahl2;
	}
	
	public double teilen(int zahl1, int zahl2) {
		return zahl1 / zahl2;
	}
	public int[] zusammenfassen(int zahl1, int zahl2, int zahl3) {
		int[] intArray = {zahl1, zahl2, zahl3};
	
		return intArray;
	}
	
}
