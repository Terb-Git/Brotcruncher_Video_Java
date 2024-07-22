package Vererbung_4_1_getset;

public class Person {
	
	String vorname;
	String nachname;
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public void vorstellen () {
		System.out.println("Mein Name ist Herr " + vorname + " " + nachname);
	}
}
	

