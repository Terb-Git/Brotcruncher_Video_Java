package Br43_Ausnahmebehandlung_TryCatrch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int zahl1, zahl2, zahl3;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie die 1.Zahl ein: ");
		zahl1 = s.nextInt();
		System.out.println("Bitte geben Sie die 2.Zahl ein: ");
		zahl2 = s.nextInt();
		
		try { //Fängt mögliche Fehler ab z. B. bei Division 0
			zahl3 = zahl1/zahl2;//Berechnung der 2 eingegebenen Zahlen
			System.out.println("Ergebnis: " +zahl3);//Wenn OK -> wird hier Ergebnis ausgegeben, ansonsten weiter zu catch
		}catch (Exception e) {// Exception ist Fehlermeldung
			System.out.println("Oh nein! Es ist ein Fehler aufgetreten! " + e.toString());//Die Exception Fehlermeldung wird mit e.toString ausgegeben
			zahl3 = 0;
		}
	}

}
/* Output Division mit 0
Bitte geben Sie die 1.Zahl ein: 
10
Bitte geben Sie die 2.Zahl ein: 
0
Oh nein! Es ist ein Fehler aufgetreten! java.lang.ArithmeticException: / by zero



*/