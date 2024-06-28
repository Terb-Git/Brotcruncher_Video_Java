package EinführunginObjekte;

public class Mensch {
	String name;
	int alter;
	int groesse;
	String haarfarbe = "Blond";
	int iq = 0;
	
	void bildung() {
		iq+=5;
	}
	void bildung(int wieviel) {//Methoden-Überladung mit parameter anforderung
		iq+=wieviel;
	}
	//Konstruktor mit Parameter Anforderung beid er Objekterstellung Mensch und This Befehl
	Mensch(String name, int alter, int gross, String hairfarbe, int intelligenz){
		this.name = name;// Wenn man eine Variable überladen möchte, dann geht das nur mit this.
		this.alter = alter;
		this.groesse = gross;
		this.haarfarbe = hairfarbe;// HAarfarbe wird bei der Objekt Erstellung vom angegeben Parameter überschrieben
		this.iq = intelligenz; 
		//Man sieht an den Farben der Wörter, auf welche sich diese Variabeln referenzieren
		
	}
	
	Mensch(){} //Kontruktor der keine Parameter-Übergabe benötigt 
}
