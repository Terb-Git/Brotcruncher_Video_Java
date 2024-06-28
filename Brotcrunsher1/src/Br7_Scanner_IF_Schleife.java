import java.util.Scanner;

public class Br7_Scanner_IF_Schleife {
	
	public static void main(String[] args) {
		
		int i;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Wie alt bist du?");
		i = s.nextInt();
		
		if(i>=18) {
			System.out.println("Du bist volljährig");
		}else {
			System.out.println("Du bist noch nicht Volljährig");
		}
	}
}
