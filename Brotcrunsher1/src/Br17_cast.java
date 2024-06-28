
public class Br17_cast {

	//Cast ist eine Methode um den Variablentype z. B. int in long zuwechsel/speichern nennt man cast. 
	
	public static void main(String[] args) {
		//int x = 5;
		//long y = x;//dieser cast funktioniert, Erklärung: x von int passt aufjeden Fall in einen größeren Speicherbereich long rein, aber nicht anderst herum.
		
		//Cast Operator
		long x = 5;
		//int y = x; //geht so nicht
		int y = (int) x; //Cast operator Datentype in Klammern (int) x;
		System.out.println(x + " " + y);
		

	}

}
