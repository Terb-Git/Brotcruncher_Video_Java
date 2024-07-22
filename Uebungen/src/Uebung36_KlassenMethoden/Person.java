package Uebung36_KlassenMethoden;

public class Person {
	private String vorname;
	private String nachname;
	
	public Person(String v, String n) {
		vorname = v;
		nachname = n;
	}

	public void vorstellen () {
		System.out.println("Mein Name ist Herr " + nachname);
	}
	
	public static void main (String [] args) {
		Person p = new Person ("Sepp", "Maier");
		p.vorstellen();
		
		Person q = new Person("Franz", "Beckenbauer");
		q.vorstellen();
	}
	
	
}
