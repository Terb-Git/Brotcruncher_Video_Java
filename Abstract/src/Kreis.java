
public class Kreis implements GoeFigur {//statt estends heißt das nun implements

	private int x;//ehemals aus GoeFigur
	private int y;
	private int radius;
	
	public Kreis(int radius) {
		// super(10, 20);//Existiert nun nicht mehr, es gibt ja keine Konsturktor mehr in der GoeFigur class
		x = 10;
		y = 20;
		this.radius = radius;
		
	}

	@Override// Bedeutet sobald sich was in der GoeFigur an dieser Methode ändert, wird dies hier auch berücksichtigt.
	public double umfangBerechnen() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double flaechenBerechnen() {
		return Math.PI * radius * radius;
		//radius wert kommt aus Startklasse
		//Kreis k = new Kreis(5);
	}

	@Override
	public void gibKoordinatenAus() {
		System.out.println("X: " +x+" - Y: "+y);
		
	}
}
