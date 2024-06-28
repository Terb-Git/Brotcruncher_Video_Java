import java.util.Scanner;


//Aufgabe: Nutzer-Abfrage, wieviel Zahlen soll eingegeben werden (Hinweis = length des Array)
//User soll entsprechend der Anzahl die Zahlen nun eingeben
// Ausgabe der Zahlen in [2,3,4] in Eckige Klammern und durch Komma getrennt
//Wichtig: letzte Zahl soll kein Komma am Schluß haben

public class Br17_Array_mit_Eingabe {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Wieviel Zahlen möchten Sie eingeben ?");
		int anzahl =s.nextInt();//anzahl erhält Werte von der User-Eingabe
		
		System.out.println("Bitte geben Sie gemäß der eingegebenen Anzahl nun die Zahlen ein:");
		int[] zahlen = new int[anzahl]; //Erstellen Array mit der anzahl(länge) 
		
		for (int i=0; i<zahlen.length; i++) {// 1x Durchgehen jedes Index/Feld des Array 
			zahlen[i]=s.nextInt();//Es werden die User Wert von zahl eingelesen
		}
		System.out.print("[");//Ausgabe [ auf
		for (int i=0; i<zahlen.length; i++) {//For-Schleife geht jeden Indexmit der zahl des Arrays durch 
			System.out.print(zahlen[i]);// Gibt die Zahl an der Stelle der For-Schleife gerade ist des Index aus
			
			if (i<zahlen.length-1) {//Wenn i kleiner als zahl.length -1 ist 
				System.out.print(",");//Wird ein Komma ausgegeben 
			}
		}
		System.out.println("]");//Ausgabe ] zu
	}

}
