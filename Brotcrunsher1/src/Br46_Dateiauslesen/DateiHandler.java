package Br46_Dateiauslesen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateiHandler {
	Scanner s;
	
	DateiHandler (File f) {//Konstruktor erwartet File f
		try { //try and catch surrounden --> Muss eingepfelgt werden, da es sein kann, dass es die Datei gar nicht gibt
			s = new Scanner (f);//Hier wird der neue Scanner (nicht nextInt() wie bei IEngaben, sondern die f = Datei
								// d. h. es werden keine Infos von EIngabe sonder aus einer Datei eingelesen
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Mensch lesen () { //Methode die ein new Mensch zurück liefert und Parameter übergibt
		if (s.hasNext() ) {		// s.hasNext() Methode bedeutet = liest in der Datei von links nach rechts durch und erwartet eine Info....   
			String name = s.next();
			int alter = s.nextInt();
			int groesse = s.nextInt();
			String haarfarbe = s.next();
			int iq = s.nextInt();
			return new Mensch(name, alter, groesse, haarfarbe, iq);//New Mensch und erwartet folgende Parameter (name.........
			}
		return null;
	}
	public void schliesen() {//Schließt die Datei.
		s.close();
	}

}


/*this.name = name;
		this.alter = alter;
		this.groesse = gross;
		this.haarfarbe = hairfarbe;
		this.iq = intelligenz; 
		*/
