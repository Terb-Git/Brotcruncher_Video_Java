package VererbungMitKonstruktoren;

public class Hund extends Lebewesen{
	
	String bellen;
		
	public Hund(String name, int alter, String farbe, String bellen) {
		super(name, alter,farbe);//Variabeln kommen von Classe Lebewesen
		this.bellen = bellen;
		
		System.out.println("Hund-Konstruktor....Hundeklasse");
	}
	
	public void bellen() {
		System.out.println("Wau..Wau...Hundeklasse_Mehtode bellen()");
	}
}
