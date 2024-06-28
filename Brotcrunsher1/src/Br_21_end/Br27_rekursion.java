package Br_21_end;

public class Br27_rekursion {
	public static void main(String[] args) {
		
		 System.out.println(fakultaet(5));
	}
	private static int fakultaet(int n) {
		if (n <= 1) {
			return 1;
		}else {
			return fakultaet(n - 1) * n;
		}
	}
}
/*Die Methode fakultaet() wird hier initial mit dem Parameter 5 aufgerufen, 
 * sodass die Ausgabe nach Abschluss der Berechnung 120 ergibt. 
 * 
 * Das Ergebnis wird schließlich in main() auf die Konsole ausgegeben. 
 * Was geschieht hier beim Programmablauf genau?

/* Der initial übergebene Parameter 5 ist größer als 1. 
 * Somit tritt der else-Fall der Verzweigung ein. 
 * Hier wird eine Rückgabe durch return eingeleitet, jedoch noch nicht sofort ausgeführt, 
 * da zunächst der rechts davon stehende Ausdruck ausgewertet werden muss. 
 * Hier, also bevor die Rückgabe erfolgt, wird eine Multiplikation durchgeführt, bei der der Multiplikand der Methodenparameter 5 ist, 
 * der Multiplikator jedoch aus einem neuerlichen Methodenaufruf mit dem um 1 verminderten Parameter 4 besteht. 
 * Dieser muss natürlich zunächst berechnet werden, bevor die Multiplikation mit 5 stattfinden kann. 
 * Bevor also irgendetwas zurückgegeben wird, muss somit zunächst folgende Berechnung stattfinden
 * 4! * 5
 * wobei 4! wiederum natürlich erst ermittelt werden muss. 
 * Bei der Berechnung von fakultaet(4) wird n mit 4 belegt, sodass, nach dem obigen Ablauf, aus diesem isolierten Berechnungsschritt
 * 
 * 3! * 4 * 5
 * 
 * ergibt. Dieses Verfahren läuft so lange ab, bis n-1 den Wert 1 erreicht hat. Die Methode wird mit 1 als Parameter aufgerufen, 
 * die Rekursion wird durch die Verzweigung terminiert und durch die Rückgabe von 1 resultiert schließlich die Berechnung von
 * 
 * 1 * 2 * 3 * 4 * 5
 * deren Ergebnis final zurückgegeben und schließlich in main() ausgegeben wird.
 */







