import java.util.Scanner;

public class Br8_Array_Scanner_Zaahleinlasen_undArrayBerechnung {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
	
		int[] x = new int[3]; //Array mit 3 Feldern -- int [] x = Varaiblen Name
		
		System.out.println("Bitte erste Zahl eingeben: ");
		x[0] = s.nextInt();//Scanner Klasse funktion Zahl einlesen
		
		System.out.println("Bitte erste Zahl eingeben: ");
		x[1] = s.nextInt();//Scanner Klasse funktion Zahl einlesen
		
		x[2] = x[0] + x[1];//Berrechnung mit Array Feldern
		
		System.out.println("Die Summe aus: " + x[0] + " und " + x[1] + " ist " +x[2] );
		

	}

}
/* Anderes Beispiel mit Variabeln referenzierung.
 * 
 * int[] liste = new int [3];
    liste[0] = 3;
    liste[1] = 2;
    liste[2] = 4;
    System.out.println("Ergebnis ist: " +liste[1]); //Ergebnis ist 2

    char[] zeichen = new char[5];
    zeichen[0] = 'c';
    zeichen[1] = 'z';
    System.out.println("Ergebnis ist: "+zeichen[2]);//Ergebnis = 0
 * 
 * 
 * 
 * 
 */ 
