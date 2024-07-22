package Vererbung4_1_Aufgabe17_Interface;

public class Main {

	public static void main(String[] args) {
		Student study = new Student ("Hans", "Albers", "studieren");
		Angestellter arbeiter = new Angestellter ("Ali", "MOHAMA", "schaffen");
		Schueler schueler = new Schueler("Anton", "Schueler", "chillen");
		
		
		
		System.out.println("\n Vorname: \n" + study.vorname +"\n Nachname: \n" + study.nachname);
		System.out.println("");
		study.studieren ();
		study.vorstellen();
		System.out.println("\n Vorname: \n" + arbeiter.vorname +"\n Nachname: \n" + arbeiter.nachname);
		arbeiter.schaffen ();
		arbeiter.vorstellen();
		System.out.println("");
		System.out.println("\n Vorname: \n" + schueler.vorname +"\n Nachname: \n" + schueler.nachname);
		study.lesen();
		schueler.lesen();
		
		}

}
