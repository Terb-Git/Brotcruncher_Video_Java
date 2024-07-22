package Loesung15;

public class Adresse {
private String strasse, plz, ort, telefon, email;
	
	public void print() {
		System.out.println("Adresse: ");
		System.out.println(" - " + strasse);
		System.out.println(" - " + plz + " " + ort);
		System.out.println(" - " + telefon);
		System.out.println(" - " + email);
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}


