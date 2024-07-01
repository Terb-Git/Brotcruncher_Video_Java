package Br46_Dateiauslesen;

public class Mensch extends Lebewesen{
	
	int groesse;
	int iq = 0;
	
	void bildung() {
		iq+=5;
	}
	void bildung(int wieviel) {
		iq+=wieviel;
	}

	Mensch(String name, int alter, int gross, String hairfarbe, int intelligenz){
		this.name = name;
		this.alter = alter;
		this.groesse = gross;
		this.haarfarbe = hairfarbe;
		this.iq = intelligenz; 
	}
	
	Mensch(){} 
		
	//Überschreiben mit toString - nicht das gleiche wie Überladen -Merke wird eine mehtode überladen, ist die ursprüngliche Methode noch vorhanden
	@Override
	public String toString() {//Speicheradresse Ausgabe mit super.toString() Methode
		return String.format("Name: %s\nAlter: %s\nGroesse: %s\nHaarfarbe: %s\nIQ:%s\nSpeicheradresse: %s", name,alter,groesse,haarfarbe,iq, super.toString());
	}
}
