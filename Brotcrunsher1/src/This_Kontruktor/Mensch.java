package This_Kontruktor;

public class Mensch {
	String name;
	int alter;
	int groesse;
	String Haarfarbe;
	int iq = 0;
	
	void bildung() {
		iq+=5;
	}
	void bildung(int wieviel) {//Methoden-Überladung mit parameter anforderung
		iq+=wieviel;
	}
	//KOnstruktor mit Parameter Anforderung
	Mensch(String wieName, int wieAlt, int welcherIQ){
		name = wieName;
		alter = wieAlt;
		iq = welcherIQ;
	}
	
	Mensch(){} //Kontruktor der keine Parameter-Übergabe benötigt 
}
