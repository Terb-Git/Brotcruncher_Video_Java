package Br35_Public_VariablennichtVeraendern;

public class Mensch {
	String name;
	int alter;
	int groesse;
	String haarfarbe = "Blond";
	private static int iq = 0;
	
	//Hierum geht es Vairable auf Private setzen
	private static int anzahlMenschen = 69;
	//Durch PRIVATE kann diese Varibale nur noch innerhalb dieser Klasse gesehen werden, außer......
		
	static int getAnzahlMenschen() {//Mit dieser Methode kann auch außerhalb der Klasse den Wert abgelesen werden, aber NICHT mit z.B. Set verändert werden
			return anzahlMenschen;
		}
	void setAnzahlMenschen(int neueAnzahlMenschen) {//Durch diese Methode kann die Varaibele OBWOHL PRIVATE in der Mainmehtode umgeschrieben werden.
		this.anzahlMenschen = neueAnzahlMenschen;
	}
	
	static int getIq() {//kann auch Public davor geschrieben werden, muss aber nicht, geht auch so
		return iq;
	}
	void setIq(int neuIq) {
			this.iq = neuIq;
		}
	
	
	void bildung() {
		iq+=5;
	}
	void bildung(int wieviel) {
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
