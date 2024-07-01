
public class Rechteck implements GoeFigur {
	
	private int x;//ehemals aus GoeFigur
	private int y;
	
	private int l;
	private int b;
	
	public Rechteck(int l, int b) {
		// super(10,20);
		x = 50;
		y = 60;
		this.l = l;// 15 kommt aus Startklasse Rechteck r = new Rechteck(15, 6);
		this.b = b;// 6 kommt aus Startklasse Rechteck r = new Rechteck(15, 6);
	}

	@Override
	public double umfangBerechnen() {
		return 2 * l + 2 * b;//2 * 15 + 2 * 6
	}

	@Override
	public double flaechenBerechnen() {
		return l * b;
	}

	@Override
	public void gibKoordinatenAus() {
		System.out.println("X: " +x+" - Y: "+y);
	}
	
}
