package Br35_GetSetter;

public class Main {

	public static void main(String[] args) {
		Mensch chinese = new Mensch("Ying", 20, 140,"Schwarz", 140 );//Parameter kommen vom Konstruktor in der Klasse Mensch

		System.out.println(chinese.name + " " + chinese.alter + " " + chinese.groesse + " " + chinese.haarfarbe + " " + chinese.iq);
		
		Mensch afrikaner = new Mensch();
		System.out.println(afrikaner.alter);//Kein Alter Angabe also kommt 0
		
		chinese.setAlter(201);//Set Methode in Mensch mit Parameter Übergabe 
		System.out.println(chinese.getAlter());// Get Methode -also holen- 
		
	
		
		
		
	}

}
