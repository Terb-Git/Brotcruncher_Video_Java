package Vererbung4_1_Aufgabe17_Interface;

public class Angestellter extends Person {
	
	String schaffen;

	public Angestellter (String vorname, String nachname, String schaffen) {
		super(vorname, nachname);
		this.schaffen = schaffen;
	}
	public void schaffen () {
		System.out.println("Angestellter schaffe schaffe Häusle baue.......");
	}
}