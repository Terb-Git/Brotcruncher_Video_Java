package VererbungMitKonstruktoren;

public class Katze extends Lebewesen{
	
	String schnurren;
	
	public Katze(String name, int alter, String farbe, String schnurren) {
		super(name,alter,farbe);
		this.schnurren = schnurren;
		
		System.out.println("Katzen-Konstruktor.....");
	}
	
	public void schnurren() {
		System.out.println("Schnurr......");
	}
}
