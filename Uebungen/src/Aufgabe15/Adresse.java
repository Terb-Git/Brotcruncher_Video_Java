package Aufgabe15;

public class Adresse {
	private String strasse, plz, ort, telefon, mail;
		
	public String getStrasse() {
		return strasse;	
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getPlz() {
		return plz;	
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;	
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getTelefon() {
		return telefon;	
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMail() {
		return mail;	
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void print() {
		System.out.println("Strasse: " + strasse);
		System.out.println("PLZ und Ort: " + plz + " " + ort);
		System.out.println("Telefon: " + telefon);
		System.out.println("Mail: " + mail);
	}

	public static void main(String[] args) {
		Adresse a = new Adresse ();
		a.setStrasse("Holzweg");
		a.print();
	}

}
