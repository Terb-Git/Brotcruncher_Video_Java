import java.util.Scanner;

public class Br12_KomplexeAufgabe_Stringeinlesen_Rückgabewert {

	public static void main(String[] args) {
		
	double x, y, z;
	String s;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Bitte 1te Kommazahl eingeben: ");
	x = scan.nextDouble();
	
	System.out.println("Bitte 2te Kommazahl einbgeben: ");
	y = scan.nextDouble();
	
	System.out.println("Bitte + , - , * , / eingeben: ");
	s = scan.next();//String einlesen
	
	z = rechnen(x,y,s);//Rückgabewert z Ergebnis der -Methode rechnen- kommt aus (Zeile 40) = Methodenaufruf mit Übergabe der 3 Variabeln an Methode
	System.out.println("Das Ergebnis = "+z);
		
		}
	private static double rechnen(double x, double y, String s) {//Methode 
		double z;//Variable z als Rückgabewert - Siehe Zeile 40
		
		if(s.equals("+")) // If (s.equals("+") Abfrage, welcher Operator genutzt werden soll
			z=x+y;
		else if (s.equals("-"))
			z = x-y;
		else if (s.equals("*"))
			z=x*y;
		else if (s.equals("/"))
			z=x/y;
		else {
			System.out.println("Bitte nur '+', '-', '*' oder '/' eingeben");
		return 0;//Errorwert-Fals was anderes als Operatoren eingeben wird -2 als Rückgabe - führt auch zum Abbruch 
		}
		return z;//Rückgabewert z --> Dieser geht zurück an main zeile 21
	}
}