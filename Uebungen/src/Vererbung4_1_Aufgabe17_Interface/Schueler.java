package Vererbung4_1_Aufgabe17_Interface;

public class Schueler extends Person implements Lernend  {
	String chillen;
	
	public Schueler (String vorname, String nachname, String chillen) {
		super(vorname, nachname);
		this.chillen = chillen;
	}
	public void chillen () {
		System.out.println("saufen und lernen.....chillen");
	}
	 public void lesen() {
		 System.out.println("Schüler: Ich lese....");
	 }
}
