package Vererbung_4_1_getset;


public class Schueler extends Person {
	
	String chillen;
	
	public Schueler (String vorname, String nachname, String chillen) {
		super(vorname, nachname);
		this.chillen = chillen;
	}
	public void chillen () {
		System.out.println("saufen und lernen.....chillen");
	}
}
