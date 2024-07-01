package Br35_Public_VariablennichtVeraendern;

public class Main {

	public static void main(String[] args) {
		Mensch chinese = new Mensch("Ying", 20, 140,"Schwarz", 140 );//Parameter kommen vom Konstruktor in der Klasse Mensch

		System.out.println(chinese.name + " " + chinese.alter + " " + chinese.groesse + " " + chinese.haarfarbe + " " + chinese.getIq());
		
		Mensch afrikaner = new Mensch();
		System.out.println(afrikaner.alter);//Kein Alter Angabe also kommt 0
		
		chinese.setAlter(201);//Set Methode in Mensch mit Parameter Übergabe 
		System.out.println(chinese.getAlter());// Get Methode -also holen- 
	
		//Um das geht es
		System.out.println(Mensch.getAnzahlMenschen());
		chinese.setAnzahlMenschen(99);
		System.out.println(Mensch.getAnzahlMenschen());
		chinese.setIq(140);
		System.out.println(Mensch.getIq());
		
		
		
	}

}
