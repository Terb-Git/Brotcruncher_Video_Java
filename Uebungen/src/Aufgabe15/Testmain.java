package Aufgabe15;

public class Testmain {

	public static void main(String[] args) {
		Person p = new Person ("Sepp", "Maier");
		
		p.vorstellen();
		
		p.setVorname("Hugo");
		
		p.vorstellen();
		
		Adresse adresse = new Adresse();
		
		adresse.setStrasse("Hinterhof");
		adresse.setPlz("66666");
		adresse.setOrt("Linsengericht");
		adresse.setTelefon("696969");
		adresse.setMail("Hotsexy@hotti.com");
		adresse.print();
		
		System.out.println();
		
		Person q = new Person("Franz", "Beckenbauer");
		adresse.setStrasse("Guckloch");
		q.vorstellen();
		adresse.print();
	}

	}


