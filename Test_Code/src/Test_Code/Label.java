package Test_Code;

public class Label {

	public static void main(String[] args) {
		
		
loop: while(true) {
			for (int i = 0; i <10; i++) {
				if (i == 6) {
					break loop;//Normalerweise bricht dieses Break nur die innerste Schleife ab, eben if
							   //somit entsteht eine Endlos schleife, da nur die innere Schleife abgebrochen wird
								// Label z. B: loop vor die Äußere While Schleife und hinter break, bricht nun beide schleifen ab
				}
				System.out.println(i);
			}
			
		}

	}

}
