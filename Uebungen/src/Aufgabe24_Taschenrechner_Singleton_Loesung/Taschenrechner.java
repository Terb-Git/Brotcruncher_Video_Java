package Aufgabe24_Taschenrechner_Singleton_Loesung;

public class Taschenrechner {
	private Taschenrechner() {} //Ab hier beginnt der Singleton
	private static Taschenrechner instance = null;
	public static Taschenrechner getInstance() {
		if (instance == null) instance = new Taschenrechner();
		return instance;
	}//Ende Singleton = Gleicher Singleton Code wie im Buch
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int mult(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		try {
			return x / y;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Taschenrechner t = Taschenrechner.getInstance();
		int z = t.div(12,3);
		System.out.println("Ergebnis: " + z);
	}
}

/*Listing 2.43 zeigt dies an einem konkreten Beispiel.
1 public class DBConnection {
2 private DBConnection() { ... }
3 private static DBConnection instance = null;
4 public static DBConnection getInstance() {
5 if (instance == null) instance = new DBConnection();
6 return instance;
7 }
8
9 public void execute(String sql) {...}
10 }
*/
/*Der private Konstruktor ist hier in Zeile 2 zu sehen, die private statische Variable in Zeile 3
und der öffentliche Zugriffspunkt darauf in Zeile 4. Hierzu wird im Abschn. 3.2 noch eine
Ergänzung zur Zugriffssicherheit beschrieben. Für dasVerständnis des Design Patterns spielt
diese jedoch keine Rolle. Ab Zeile 8 folgen dann beliebige weitere Business-Methoden der
Klasse.
*/