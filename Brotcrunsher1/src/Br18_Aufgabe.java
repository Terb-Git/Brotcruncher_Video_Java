/*Aufgabe: 
 * Methode mit 3 Int Werte Sek, Minute, Stunde
 * String zurückliefern eine Zeit  [Stunde:Minute:Sekunde]
 * Als String in der Main Methode speichern
 */

import java.util.Scanner;

public class Br18_Aufgabe {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int std = 2;
		int min = 30;
		int sek = 60;
		String st = zeit(std, min, sek);//String st Variable wird mit Methoden aufruf deklariert und übergibt die Werte der variabeln
										//und bekommt ein String zurück und wird in st gespeichert 
		System.out.println(st);				
	}
	private static String zeit(int h, int m, int sec) {// es werden die 3 Int Variabeln std, min, sek erwartet und als String (= string nach static) zurückgegeben.
		return String.format("[%02d:%2d:%2d]", h, m, sec);// Varibaeln werden im String.format abgespeichert
		
	}
}
