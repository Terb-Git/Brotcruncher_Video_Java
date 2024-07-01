package Br47_InDatei_schreiben_pruefen_ob_Datei_da;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Klasse für zum Einlesen der User EIngaben
		System.out.println("Welche Datei soll gelesen werden?");
		String dateiname = s.next();//Schreibt den Dateiname in die String Variable dateiname
		String dateiInhalt = "";
		Formatter dateiErsteller = null;//null heißt -> Zeigt auf nichts!  --> LOKALE VARIABLE 
		File f = new File("C://test//"+dateiname+" .txt");//Konstruktor - Wird ein neues Objekt von Type File = f mit den Parameter generiert. 
														  
		if(f.exists()) {//Wenn es ein Flie f bereits gibt, dann....
				try {
				Scanner leser = new Scanner(f);//Konstruktor - neues Objekt leser erstellt --> Scanner (f) liest nun aus f ein
				while(leser.hasNext()) { //leser.hasNext() = Methode, Lesekopf in der Datei ist ganz links, geht nach rechts und prüft -> kommt eine neue Info - ja gehe zu zeile 21/Nein gehe zu 28   	 
					dateiInhalt+=leser.next();// Schreibt alles was leser.hasNext() liest in den dateiInhalt
				}
				dateiErsteller = new Formatter (f);//Leere Textdatei wird mit Formatter erstellt
				dateiErsteller.format(" %s ", dateiInhalt);//.format Methode = Wenn es die Datei schon gibt, dann schreiben wir in die Datei -platzhalter %-  den Inhalt von dateiInhalt 
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			}
			}else {
				try {
				dateiErsteller = new Formatter(f);//Leere Textdatei wird mit Formatter erstellt
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		System.out.println("Was soll neu reingeschrieben werden ?");
		String neueEingabe = s.next();
		dateiErsteller.format(" %s ", neueEingabe);//format schreibt immer hinten dran
		dateiErsteller.close();//Datei schließen
		}
}

