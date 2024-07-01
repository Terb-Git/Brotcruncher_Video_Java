
public class Rechteck extends GoeFigur {
	private int l;
	private int b;
	
	public Rechteck(int l, int b) {
		super(10,20);//Übergabe an GoeFigur x und y
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
	
}
