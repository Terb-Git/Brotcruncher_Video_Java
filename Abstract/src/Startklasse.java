
public class Startklasse {
	
	public static void main(String[] args) {
		
		Rechteck r = new Rechteck(15, 6);//Objekt erstellt
		System.out.println("Rechteck:");
		System.out.println("Umfang: " +r.umfangBerechnen());
		System.out.println("Fläche: "+r.flaechenBerechnen());
		r.gibKoordinatenAus();
		System.out.println("");
		Kreis k = new Kreis(5);
		
		System.out.println("Kreis:");
		System.out.println("Umfang: " +k.umfangBerechnen());
		System.out.println("Fläche: "+k.flaechenBerechnen());
		k.gibKoordinatenAus();
		
	}

}
