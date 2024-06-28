import java.util.Scanner;

public class Br16_durchschnitt_array_length {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int [] x = new int[5];
				
		for (int i = 0; i<x.length; i++) {//besser Schreibweise anstatt i<5 ersetzt durch i<x.length 
											// x.length ist eine Methode die einen int - Wert zurück gibt, wielange das Array ist
			x[i] = s.nextInt(); 
		}
		
		double derDurchschnitt = durchschnitt(x);//anstatt (x[0], x[1], x[2],x[3], x[04]); wird das komplette Array x übergeben
		System.out.println(derDurchschnitt);
	}
	
	 static double durchschnitt (int[] x) {//hier wird anstatt (int x, int y, int z, int w, int q) das komplette Array erwartet  
		double loesung = 0;//Initialwert 0
		
		for (int i = 0; i<x.length; i++) {// For [Zählervariable] int i= 0, [Bedingung] i<x.length; [Schrittweite] i++;
			
			loesung+=x[i];//[Anweisung] jedesmal soll auf loesung draufaddiert werden, was in dem Index von x an der Stelle i ist
		}
		loesung /= x.length; 
		return loesung; 
	}

}
