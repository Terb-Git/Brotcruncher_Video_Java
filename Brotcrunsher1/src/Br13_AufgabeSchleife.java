import java.util.Scanner;

public class Br13_AufgabeSchleife {
	
	public static void main(String[] args) {
		int zahl, ergebnis;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Gibt eine Zahl ein, die höher als 1000 ist:");
		zahl = s.nextInt();
		
		ergebnis=zahl/1000;
		System.out.println("In "+zahl+" passt 1000 --> "+ergebnis+" mal rein!");
			}
		}
	