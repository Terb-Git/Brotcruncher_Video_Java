package VectorenTutorial;

import java.util.Vector;

//https://www.youtube.com/watch?v=gW-WhU3aMpU

public class VectorTutorial {

	public static void main(String[] args) {
		
		Testklasse test = new Testklasse();//Anlage Objekt test
		
		Vector ce = new Vector(10);
		System.out.println(ce.size()); //Vector Methode --> momentane Menge an Objekten die sich aktuell im Vector befinden 
		System.out.println(ce.capacity());// Kapazität (in dem Fall 10) welche eingestellt ist
		
		ce.addElement(test);//Vector platz 0 wird durch das Objekt test befüllt
		ce.addElement("Dies ist ein String von Pos 1 aus dem Vector");// Vector platz 1 wird durch diesen String befüllt
		System.out.println(ce.size());//Wieviel elemente befinden sich nun im Vector
		
		((Testklasse)ce.elementAt(0)).ausgabe(); // Mache aus dem Element an der Stelle 0 des Vectors ein Testklassen-objekt und benutze dafür die Mehtode ausgabe 
		//Wichtig, welches Element an welcher Stelle (0) steht, in dem Fall das Objekt 0
		// Vetcor ist eine Liste, welcher nur den Aufenhaltsort der werte speichert
		
		// ce.remove(1); <--löschen der Pos 1 aus der Vector/Liste
		
		System.out.println(ce.elementAt(1));
	
	}				
		
}
