package Br35_GetSetter;

public class Mensch {
	String name;
	int alter;
	int groesse;
	String haarfarbe = "Blond";
	int iq = 0;
	
	//Hierum geht es Vairable auf Private setzen
	
	private static int anzahlMenschen = 69;
	//Nun kann nur noch innerhalb der Klasse der Wert verändert werden
	
	static int getAnzahlMenschen() {
		return anzahlMenschen;
	}
	
	void bildung() {
		iq+=5;
	}
	void bildung(int wieviel) {//Methoden-Überladung mit parameter anforderung
		iq+=wieviel;
	}
	//Konstruktor mit Parameter Anforderung beid er Objekterstellung Mensch und This Befehl
	Mensch(String name, int alter, int gross, String hairfarbe, int intelligenz){
		this.name = name;
		this.alter = alter;
		this.groesse = gross;
		this.haarfarbe = hairfarbe;
		this.iq = intelligenz; 

		}
	void setAlter(int alter) {
		this.alter = alter;
	}
	int getAlter() {
		return alter;
	
	}
	
	Mensch(){} //Kontruktor der keine Parameter-Übergabe benötigt 
}
