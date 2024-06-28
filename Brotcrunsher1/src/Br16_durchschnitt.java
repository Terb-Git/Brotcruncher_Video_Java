import java.util.Scanner;

public class Br16_durchschnitt {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
				int [] x = new int[5];//Neues Array länge 5
				
				for (int i = 0; i<5; i++) {//Gehen jedes Feld vom Array durch -- 
					x[i] = s.nextInt(); //Befüllen jedes Feld vom Array mit dem Eingabewert vom Benutzer
				}
				//Double Varaible erstellen
				double derDurchschnitt = durchschnitt(x[0], x[1], x[2],x[3], x[04]);// Double der Durchschnitt frägt Methode durchschnitt ab und übergibt die Felder aus dem Array
				System.out.println(derDurchschnitt);
			}
			
			 static double durchschnitt(int x, int y, int z, int w, int q) { //Methode 
				double loesung = x+y+z+w+q;//Zusammenrechnen der Werte aus dem Array und in Loesung gespeichert
				loesung = loesung/5; // Loesung wird durch die Anazhl (Mittelwert Berechnung) geteilt - Neues Ergbnis landet in der loesung
				return loesung; //Rückgabewert des Ergebnis von loesung --> geht nach Zeile 14 in derDruchschnitt --> danach zur Ausgabe Zeile 15
			}


	}

