import java.util.Scanner;

public class Br19_Switch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int antwort;
		System.out.println("Wie viele Monde hat denn die Erde?");
		antwort = s.nextInt();
		
		switch (antwort) { //Switch und case ist eine Alternative zu if-Schleife
		case 0:
			System.out.println("Leider zu wenig");
			break;
		case 1: 
			System.out.println("Das ist richtig");
			break;
		case 2:
			System.out.println("Das sind leider zu viele");
			break;
		default:
			System.out.println("Falsch");
			break;
		}
		
	}

}
