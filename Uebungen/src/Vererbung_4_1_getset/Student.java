package Vererbung_4_1_getset;

public class Student extends Person{
	
	String studieren;
	
	public Student (String vorname, String nachname, String studieren) {
		super(vorname, nachname);
		this.studieren = studieren;
	}
	
	public void studieren () {
		System.out.println("studiere studiere.......");
	}
	
}
