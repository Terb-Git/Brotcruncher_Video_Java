package Aufgabe17_Interfaces;

public class Schueler extends Person implements Lernend{
			
		@Override
		public void lesen() {
			System.out.println("Klasse Schueler: Mehtode lesen");	
		}
	}


