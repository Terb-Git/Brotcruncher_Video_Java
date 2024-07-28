package Aufgabe23_Telefonnumer_Hashtable;

public class Telefonnummer {
	
	private String land, vorwahl, nummer, durchwahl;
	
	public Telefonnummer(String l, String v, String n, String d) {
		land = l;
		vorwahl = v;
		nummer = n;
		durchwahl = d;
	}
	
	public String toString() {
		return "+" + land + " " + vorwahl + "/" + nummer + "-" + durchwahl;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getVorwahl() {
		return vorwahl;
	}

	public void setVorwahl(String vorwahl) {
		this.vorwahl = vorwahl;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getDurchwahl() {
		return durchwahl;
	}

	public void setDurchwahl(String durchwahl) {
		this.durchwahl = durchwahl;
	

	}

}
