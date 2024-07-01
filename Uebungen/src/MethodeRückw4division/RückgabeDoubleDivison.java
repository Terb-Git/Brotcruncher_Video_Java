package MethodeRückw4division;

public class RückgabeDoubleDivison {
	public static float methode (double a, double b) {
		double summe = a/b;
		return (float) summe;
	}
public static void main(String [] args) {
	System.out.println(methode(7.8, 2.9));
	
}
}
