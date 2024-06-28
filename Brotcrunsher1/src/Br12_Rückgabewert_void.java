
public class Br12_Rückgabewert_void {
	
	public static void main(String[] args) {
		int x = 9;
		int y = 13;
		int z = add(x, y);//  z = Rückgabewert (Zeile 22) aus Methode add(x, y) 
		System.out.println(z);
		
		//x = x + 7; //Überschreiben der Variable x
		//System.out.println(x);
		
		String s;
		s = "Ich bin ein String";
		System.out.println(s);
	}

	//public static void add(int x, int y) //Achtung void gibt hier keinen Wert zurück. void kann durch Rückgabe_Datenype ersetzt werden z. B. int
	
	public static int add(int a, int b) {//void durch Rückgabe_Datenype int ersetzt	
	int z = a + b;
		return z;//Rückgabewert aus z an Main --> und gleichzeitig Methoden-Ende
		//System.out.println("Da das Methodenende durch return erreicht, wird dieses hier nie ausgedruckt");
		
	}

}
