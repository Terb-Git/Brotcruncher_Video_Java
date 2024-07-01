
public class Startklasse {
	
	public static void main(String[] args) {
		
		Rechteck r = new Rechteck(10, 20);//Objekt erstellt
		
		System.out.println("Umfang: " +r.umfangBerechnen());
		System.out.println("Fläche: "+r.flaechenBerechnen());
		r.gibKoordinatenAus();
		
		Kreis k = new Kreis(5);
		
		System.out.println("Umfang: " +k.umfangBerechnen());
		System.out.println("Fläche: "+k.flaechenBerechnen());
		k.gibKoordinatenAus();
		
	}

}
