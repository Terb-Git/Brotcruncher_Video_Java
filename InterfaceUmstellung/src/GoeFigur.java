
public abstract class GoeFigur {//abstract gibt die beiden abstracten Methoden 
								//an die extends Klassen zwingend weiter.
								// dort müssen diese initialisiert wewrden
	
	 int x;//im Beispiel protected int x und protected y
	 int y;
	
	public GoeFigur(int x, int y) {//Konstruktor - Anfangs-Fehler "public void" void = kein rückgabewert ist falsch!
		this.x = x;
		this.y = y;
		}
	
	public abstract double umfangBerechnen();//Abstracte Methoden --> müssen in den extends Klassen initialisiert werden !!!
	public abstract double flaechenBerechnen();
	
	public void gibKoordinatenAus() {
		
		System.out.println("X: " +x+" - Y: "+y);//EIgene Methode ohne Abstracten Charakter - nur in Goe sichtbar
	}

}
