package VererbungMitKonstruktoren;

public class Lebewesen {
	 String name;
	 int alter;
	 String farbe;
	
	public Lebewesen(String name, int alter, String farbe) {
		this.name = name;
		this.alter = alter;
		this.farbe = farbe;
		
		//System.out.println("Lebewesen-Kostruktor.....");
	}
	
	public void sex() {
		System.out.println("Kann sich fortpflanzen...LebenwesenKlasse....methode sex()");
}
}
