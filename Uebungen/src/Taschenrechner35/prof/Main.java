package Taschenrechner35.prof;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int zahl1;
		int zahl2;
		String operator;
		
		Addieren adi = new Addieren();
		Teilen teilen = new Teilen();
				
		Scanner s= new Scanner(System.in);
		
		System.out.println("Bitte erste Zahl eingeben: ");
		zahl1 = s.nextInt();
		
		System.out.println("Bitte zweite Zahl eingeben: ");
		zahl2 = s.nextInt();
		
		System.out.println("Bitte geben Sie ein Operator (+,/) ein: ");
		operator = s.next();
		
		if (operator.equals("+")) {
			System.out.println("Ergebnis: "+adi.plus(zahl1, zahl2) );
			
		} else if (operator.equals ("/")){
			System.out.println("Ergebnis: "+teilen.teil(zahl1, zahl2) );
			
		}
		//System.out.println("Fehler in der Berechnung!" );
	}

}
