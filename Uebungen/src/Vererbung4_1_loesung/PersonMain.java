package Vererbung4_1_loesung;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.vorstellen();
		p = new Student();	// Student ist auch eine Person, also kann p auch ein Student zugewiesen werden
		p.vorstellen();
		p = new Schueler();// Schüler ist auch eine Person, also kann p auch ein Schüler zugewiesen werden
		p.vorstellen();

	}

}
