package Br44_Einfuehrung_in_Dateien;

import java.io.File; //WICHTIG: Import der vordefinierten Klasse "File" 

//Es wurde als vorbereitung ein Ordner Test mit erb.txt unter c: platziert

public class DateiSuchenFinden {

	public static void main(String[] args) {
		File f = new File("C://Test//erb.txt");//Suchen der Datei in der ("...") <--Konstruktor der Klasse
												// Wichtig: String und // nutzen
		if(f.exists()) {//f.exist() Methode ist bereits vordefiniert--> kommt von Import "File" Klasse
			System.out.println("Die Datei " + f.getName() + " gibt es!"); //f.getName()Methode ist bereits vordefiniert
		}else {
			System.out.println("Die Datei " + f.getName() + " gibt es nicht");
		}
		
	}

}
