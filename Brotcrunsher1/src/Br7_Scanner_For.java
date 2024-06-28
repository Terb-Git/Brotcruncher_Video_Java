import java.util.Scanner;

public class Br7_Scanner_For {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int x;
		System.out.println("Welche Zahl soll ausgegeben werden?");
		x = s.nextInt();
		
		for (int i=0; i<=x; i++) {
			System.out.print(i + " ");
		}
	}
}
