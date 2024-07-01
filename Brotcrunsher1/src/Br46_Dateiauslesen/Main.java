package Br46_Dateiauslesen;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("C://test//apfel.txt");//Konstruktor - prüft, ob es die Datei gibt
		DateiHandler dh = new DateiHandler(f);//Neues Objekt aus der Klasse DateiHandler der das File (f) bekommen soll.
		Mensch m = dh.lesen();//New Objekt mit der Mehtode aus DateiHandler = dh.lesen
		System.out.println(m.toString());//ToString Methode aus der Klasse Mensch
		
		System.out.println();
		// 2tes Objekt 
		Mensch u = dh.lesen();
		System.out.println(u.toString());
		
		dh.schliesen();
		}

}
// Es sei angemerkt, dass die Date entsprechend vorbereitet sein muss.
/* d. h. die Daten in der Datei müssen die gleiche Reihenfolge haben, also name, alter, groesse.......
 *this.name = name;
		this.alter = alter;
		this.groesse = gross;
		this.haarfarbe = hairfarbe;
		this.iq = intelligenz; 
		
		 Datei apfel.txt = Inhalt: 
		 Kai 30 180 schwarz 100
		 Ute 15 165 blond 50
		 
		 
 */
 