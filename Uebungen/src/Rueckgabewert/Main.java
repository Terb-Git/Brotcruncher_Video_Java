package Rueckgabewert;

public class Main {

	public static void main(String[] args) {
		
		Taschenrechner taschenrechner = new Taschenrechner();
		
		
		//25 + 3*14 -256
		
		int produkt = taschenrechner.mal(3, 14);
		int minus = taschenrechner.minus(produkt, 256);
		int summe = taschenrechner.addieren(minus,25);
		
		System.out.println(summe);
		
	}

}
