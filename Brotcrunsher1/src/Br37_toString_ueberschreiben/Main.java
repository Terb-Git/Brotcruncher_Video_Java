package Br37_toString_ueberschreiben;

public class Main {

	public static void main(String[] args) {
		Mensch chinese = new Mensch("Ying", 20, 140,"Schwarz", 140 );

		System.out.println(chinese.name + " " + chinese.alter + " " + chinese.groesse + " " + chinese.haarfarbe + " " + chinese.iq);
		
		Mensch afrikaner = new Mensch("Hawk", 20,100,"Blond", 90);
		System.out.println("Alter von Hawk -Afrikaner: "+afrikaner.alter);
		System.out.println("");
		
		System.out.println(chinese.toString());//<---Output toString Methode 
		
		}

}
