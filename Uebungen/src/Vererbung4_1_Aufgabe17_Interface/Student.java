package Vererbung4_1_Aufgabe17_Interface;

public class Student extends Person implements Lernend{
	
	String studieren;
	
	public Student (String vorname, String nachname, String studieren) {
		super(vorname, nachname);
		this.studieren = studieren;
	}
	public void studieren () {
		System.out.println("studiere studiere.......");
	}
	 public void lesen() {
		 System.out.println("Student: Ich lese....");
	 }
}
