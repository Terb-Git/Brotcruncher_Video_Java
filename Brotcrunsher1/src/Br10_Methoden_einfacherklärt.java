
public class Br10_Methoden_einfacherklärt {

	public static void main(String[] args) {
		
		System.out.println("Bin in der Main");
		Irgendwas1();
		System.out.println("Bin wieder zurück in der MAin");
	}
	
	public static void Irgendwas1() {// WICHTIG: beim 1. Methoden aufruf wird diese Methode nur bis Zeile 13 abgearbeitet. Beim 2ten Aufruf wird nur Zeile 14 aufgerufen
		System.out.println("Bin in Irgendwas 1");
		Irgendwas2();
		System.out.println("Bin das 2te mal in Irgendwas1");
	}
	
	public static void Irgendwas2() {
		System.out.println("Bin in Irgendwas 2");
	}
}
	
	
	
	
	
	
	
	
	/* Methoden Verschachtelt mit gleichen Varaqibelen Namen
	 * public static void main(String[] args) {
	 
		int x;
		x = 3;
		
		SchreibeWurst();
		System.out.println("Fertig " +" x= "+x);
		
		}
	public static void SchreibeBrot() {
		int x;
		x = 15;
		System.out.println("Ausgabe Methode SchreibeBrot: Brot "+ " x= "+x);
		
	}
	
	public static void SchreibeWurst() {
		int x = 200;
		System.out.println("Wurst" +" x= "+x);
		SchreibeBrot();
	}

}
*/