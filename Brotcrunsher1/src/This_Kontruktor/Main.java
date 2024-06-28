package This_Kontruktor;

public class Main {

	public static void main(String[] args) {
		Mensch chinese = new Mensch("Ying", 20, 140);//Neues Objekt chinese erstellt mit Parameter Übergabe
														//--> Durch Konstruktor muss GLEICH Parameter -Name/Alter/IQ mitgegeben werden
														// Der leer Konstruktor sorgt dafür, dass keine Parameter eingegeben werden MÜSSEN
		
		
		System.out.println(chinese.name + " " + chinese.alter + " " + chinese.iq);
		
		Mensch afrikaner = new Mensch();
		System.out.println(afrikaner.alter);//Kein Alter Angabe also kommt 0
		
		//Objekt erstellen chinese
		/* Umständlich -funktioniert - aber umständlich
		 * 
		 * Hierfür kommt ein Konstruktor ins Spiel --> Siehe Menschklasse
		 * 
		chinese.name = "Ying";
		chinese.alter = 30;
		chinese.groesse = 150;
		
		System.out.println("Name: -- "+ chinese.name + " -- Alter: " + chinese.alter + " -- Größe in cm:" + chinese.groesse);
		System.out.println("");
		afrikaner.name = "Mike";
		afrikaner.alter = 25;
		afrikaner.groesse = 180;
		System.out.println("Name: "+ afrikaner.name + " Alter: " + afrikaner.alter + " Größe in cm:" + afrikaner.groesse);
		
		System.out.println(chinese.iq); 
		chinese.bildung(100);//Aufrufen Methode mit Parameterübergabe
		System.out.println(chinese.iq);
		*/
	}

}
