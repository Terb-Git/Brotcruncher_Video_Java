package VererbungMitKonstruktoren;

public class Hund extends Lebewesen{
	
	String bellen;
		
	public Hund(String name, int alter, String farbe, String bellen) {
		super(name, alter,farbe);
		this.bellen = bellen;
		
		System.out.println("Hund-Konstruktor.....");
	}
	
	public void bellen() {
		System.out.println("Wau..Wau");
	}
}
