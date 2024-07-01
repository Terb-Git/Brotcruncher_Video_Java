package Methoden;

public class MethodenSimpleClub {
	
	public static void easy (){
	System.out.println("Gudden Tach Ihr Schlawiner!");
	}
	
	public static void max(int a, int b){
		
		if (a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		easy();
		max(10,10);//Wenn beide Werte gleich sind kann "a" nicht größer sein als " b". 
					//Deshalb geht das Programm in den "else"-Teil und gibt den Wert von "b" aus,
					//welcher ja gleichzeitig auch der Wert von "a" ist.
	}
}
