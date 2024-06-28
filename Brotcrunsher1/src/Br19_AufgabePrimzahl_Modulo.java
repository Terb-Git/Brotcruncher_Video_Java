import java.util.Scanner;
//Aufgabe: User gibt Primzahl ein
//User gibt anzahl der Grenze wieviel ausgeben werden sollen
//Primzahl ausgeben
// Tipp: Modulo
//Primzahlen sind Zahlen, Sie sind nur durch sich selbst und durch 1 teilbar. 3 5 7 9 

public class Br19_AufgabePrimzahl_Modulo {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	long wieviel = s.nextLong();//Benutzerabfrage wie viele
	long primzahlenAnzahl = 0;//zählt hoch wieviele er schon gefunden hat
	long beiZahl = 1;//ist die Zahl die gerade auf Primzahl geprüft gespeichert wird 
	int zeilenumbruch = 0;//Schönheits Trick für die Anzeige
	boolean isPrim = true;
	
	final int MAXINZEILE = 3;
	
	while(true) {
		if(primzahlenAnzahl >= wieviel) {//While Schleife bricht dann ab, wenn soviele Primzahlen gefunden wurden, wie User-Eingabe
			break;
		}
		beiZahl++;//wird pro durchlauf um 1 erhöht
		isPrim = true;//Anfang geht wir davon aus, es ist eine Primzahl also true - es wird immer die beiZahl untersucht

		//Überprüfung ob es tatsächlich eine PRIMzahl ist  --> Das hier ist der komplexe Teil-Herzstück
		
		for (int i = 2; i<beiZahl; i++) {//For Schleife beginnt bei 2, solange dies kleiner beiZahl ist
			if(beiZahl%i == 0) {//Überprüfung der beiZahl durch Modulo auf Rest == 0 dann ist dies keine Primzahl.
				isPrim = false;//Bei Rest == 0 --> Ist dies keine Primzahl
			}
		}	
		
		if(isPrim) {//Falls es eine Primzahl ist wird diese einfach ausgegeben
			System.out.print(beiZahl + " ; ");//ACHTUNG print
			primzahlenAnzahl++;//Anzahl der Primzahlen um 1 erhöht// Wieviel wir gefunden haben - hat wiede rmit der Abruchschleife Zeile20 zu tun
			zeilenumbruch++;//bei jedem Primzahl-FUnd wird der ZeielnUmbruch um 1 erhöht
		}
		if(zeilenumbruch>=MAXINZEILE) {//Wenn zeilenumbruch MAXINZEILE 3 (Siehe Zeiel 18) erreicht hat -->
			zeilenumbruch = 0;//Anzahl wieder auf 0
			System.out.println();
			
		}
	
	}
	
	System.out.println("Done!");
	
	}
	
}

