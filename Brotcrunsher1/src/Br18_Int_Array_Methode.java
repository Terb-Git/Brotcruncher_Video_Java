
public class Br18_Int_Array_Methode {
//Array mit Methode 
	public static void main(String[] args) {
		
		int[] zahlen = new int[10];//Anlegen von einem Array zahlen mit länge 10
		
		zahlen[0] = 1;// Array zahlen Index [0] mit 1 befüllen 
		
		System.out.println(zahlen[0]);// Ausgabe des zahlen Index [0]
		seltsam(zahlen);
		System.out.println(zahlen[0]);
	}
	static void seltsam(int[] x) {// Die Variable int[] x hat in der Regel mit der Variable zahlen [0] nichts zu tun.
								// ABER: Nur bei primitiven Datentypen: int short long Double float boolean char und byte
								//MERKE: ein Array ist KEIN primitiver Datentype, somit haben die beiden Varaiblen int[] x und zahlen [0] eine Verbindung
								// Siehe die Ausgabe 1 und 2 (1 in Zeile 18 um 1 erhöht)
		x[0]++;
	}
}
// Ausgabe 1 2

//-----------------------------------
/* Einfaches Array mit ausgabe
 * 
 
int[] zahlen = new int[10];//Anlegen von einem Array zahlen mit länge 10

zahlen[0] = 1;// Array zahlen Index [0] mit 1 befüllen 

System.out.println(zahlen[0]);// Ausgabe des zahlen Index [0]
*/