package Aufgabe15;

public class Person {
	private String vorname;
	private String nachname;
	public String adresse;
	
	public Person(String v, String n) {
		vorname = v;
		nachname = n;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void vorstellen () {
		System.out.println("Mein Name ist Herr " + vorname);
			
	}
}

	
	

