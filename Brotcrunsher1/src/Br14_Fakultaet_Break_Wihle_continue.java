import java.util.Scanner;

public class Br14_Fakultaet_Break_Wihle_continue {
	public static void main(String[] args) {
		
		int zahl;
		int fakultaet = 1;//Fakultät = fakultät von 3 = 3*2*1 = 6 
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Geben Sie eine Zahl/Fakultät ein:");
		zahl =s.nextInt();
		
		while(true) {
			if(zahl<=1) {
				break; // Unterbreche die Schleife wenn zahl<=1 - sonst endlosschleife. 
						//Mit continue wäre das eine Endlosschleife, da diese immer wieder zu wihle springt
			}
		fakultaet*=zahl;
		//fakultaet = fakultaet * zahl
		zahl--;
		}
		System.out.println("Ergebnis der Fakultät ist: "+fakultaet);
	}
}
