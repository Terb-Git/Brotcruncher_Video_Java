package Aufgabe17_Interfaces;

public class Student extends Person implements Lernend{
			
		@Override
		public void lesen() {
			System.out.println("Klasse Student: Mehtode lesen");	
		}
	}


