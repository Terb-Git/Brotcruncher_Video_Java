import java.util.Scanner;

public class Br14_Aufgabe_breakcontinue_quersumme_scanner {

	public static void main(String[] args) {
		
		int z;
				
		Scanner s= new Scanner(System.in);
					
		System.out.println("Bitte Zahl1 eingeben:");
		z = s.nextInt();//eingebene Zhal in z einlesen
		
		System.out.println("Quersumme = " + quersumme(z));
		
	}
		
		private static int quersumme (int z) {// eingelesene Zahl z an methode übergeben
			
		while(true) {//prüft ob wahr, wenn(if) z<=9 return den wert z und gibt in Main z aus
			if(z<=9) { 
				return z;
			}
			return z%10 + quersumme(z/10);	
			/* Erklärung: Eingabe 155
			 * 155 %Modulo 10 = 15,5 Rest 5
			 * da z=15 Nicht <= 9 ist geht die Schleife weiter  
			 * 15% 10 = 1,5 Rest 5
			 * jetzt ist z = 1,5 also kleiner z<=9
			 * nun zur Quersumme
			 * z=1 + 1(von 1,5) / 10 = 0,1 + 1 =1,1 also 1
			 * quersumme = 5+5+1,1 =11,1 = 11 
			 *  
			 *  Lösung: 
			 *  155:10 = 15,5 rest 5
			 *  15:10 = 1,5 Rest 5
			 *  1 (z) + Querswumme (1:10= 0,1) = 1,1
			 *  5 + 5 + 1,1 = 11
			 */
			
			
			}
		
			
		}
	}
	


