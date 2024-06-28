import java.util.Scanner;
//Berechnung Quersumme
public class Br14_Lösung {

	public static void main(String[] args) {
		int zahl, ergebnis;
		ergebnis = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Geben Sie eine Zahl ein:");
		zahl =s.nextInt();
		while(true) {
			if(zahl<=0) {
				break;
			}
			ergebnis+=zahl%10;//zahl durch 10 teilen und Rest 
			zahl/=10; //
		}
		System.out.println("Quersumme: "+ergebnis);

	}
}