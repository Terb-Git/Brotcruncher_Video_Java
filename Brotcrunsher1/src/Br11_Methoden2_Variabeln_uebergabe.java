
public class Br11_Methoden2_Variabeln_uebergabe {

	public static void main(String[] args) {
		int x; 
		int y; 
		x = 5;
		y = 5;
		
		addiereXy(x, y);//Aufruf Methode mit Übergabe der Varaibeln
	}
	
	public static void addiereXy(int z1, int z2) { //(int z1, int z2) = Übergabewert x und y --> Z1 = 5 und z2 =5
													// WICHTIG: Bei der Übergabe der Varaiblen auf Daten Type aufpassen (int z1, int z2)
		System.out.println("Zahl1 = "+z1);
		System.out.println("Zahl2 = "+z2);
		System.out.println("Zusammengezählt lt. das Ergebnis = "+ (z1+z2));
	}
	

}
