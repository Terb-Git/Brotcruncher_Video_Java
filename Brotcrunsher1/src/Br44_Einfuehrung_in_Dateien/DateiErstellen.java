package Br44_Einfuehrung_in_Dateien;

import java.io.File; //Wichtig Importieren
import java.io.FileNotFoundException;
import java.util.Formatter;//Wichtig: Klasse Formatter IMportieren

public class DateiErstellen {

	public static void main(String[] args) {
		
			File f = new File("C://Test//apfel.txt");//Prüft / Sucht, ob es bereits eine gleiche Datei bereits gibt.
			if(!f.exists()) {						//(!f.exist) = ist die "!" = Nicht-Variante. Also existiert KEINE Datei, dann weiter...schreibe die o. g. Datei --> gehe weiter zu Zeie 17
							 						// Ansonten würde die Datei immer überschrieben.
			
			//Formatter format = new Formatter("C://Test//apfel.txt");--> Jetz wird bei format gemeckert, das try und catch genutzt werden muss. 
			// Try und catch einfach Link "Surround try an catch" anklicken
			try (
			Formatter format = new Formatter("C://Test//apfel.txt")) {// hier wird die Datei geschrieben, falls keine vorhanden
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();// Ansonsten das hier
			}
	}

}
}