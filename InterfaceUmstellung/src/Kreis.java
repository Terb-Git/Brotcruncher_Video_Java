
public class Kreis extends GoeFigur {

	private int radius;
	
	public Kreis(int radius) {
		super(10, 20);//Übergabe Goe X und y
		this.radius = radius;
	}

	@Override// Bedeutet sobald sich was in der GoeFigur an dieser Methode ändert, wird dies hier auch berücksichtigt.
	public double umfangBerechnen() {
		return 2 * Math.PI * radius;//radius wert kommt aus Startklasse
									//Kreis k = new Kreis(5);
				//Math.PI = ist eine vorgefertigte Methode. aufruf mit Math.
	}
	
	@Override
	public double flaechenBerechnen() {
		return Math.PI * radius * radius;
		//radius wert kommt aus Startklasse
		//Kreis k = new Kreis(5);
	}
}
