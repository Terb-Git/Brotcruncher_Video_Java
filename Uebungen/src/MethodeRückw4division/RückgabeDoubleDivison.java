package MethodeRückw4division;

public class RückgabeDoubleDivison {
	public static float methode (double a, double b) {
		double summe = a/b;
		return (float) summe;
	}
public static void main(String [] args) {
	double a = 7.5;
	double b = 3.0;
	float ergebnis = methode (7.5,3.0); 
	
	System.out.println(ergebnis);
	
}
}
