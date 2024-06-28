
public class Br4_If {
	public static void main(String[] args) {
		
		int alter;
		alter = -1;
		
		if (alter >= 18) { 
			
			System.out.println("Du bist volljährig");
		}
		else if (alter >= 0){
			System.out.println("Du bist NICHT volljährig");
		}
		else {
			System.out.println("Du bist noch nicht geboren");
		}
	}
}
