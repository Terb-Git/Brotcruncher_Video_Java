package Vererbung_4_1_getset;

public class Main {

	public static void main(String[] args) {
		Student study = new Student("Hans","Werner","studieren");
		Student study1 = new Student("Emil", "Donate", "studieren");
		study.vorstellen();
		study.studieren();
		study1.vorstellen();
		study1.studieren();
		Angestellter jobler = new Angestellter ("Macho", "Man", "schaffe");
		jobler.vorstellen();
		jobler.schaffen();
		
		Person p = new Person("Hugo", "Egon");
		p.vorstellen();
		p = new Student("No","body","studieren");// Student ist auch eine Person, also kann p auch ein Student zugewiesen werden
		p.vorstellen();
		}

}
