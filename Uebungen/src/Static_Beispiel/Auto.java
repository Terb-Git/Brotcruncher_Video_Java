package Static_Beispiel;

public class Auto {
	String autoFarbe;
	int pferdestaerke;
		
	static int navi;
	
	public Auto(String farbe, int ps) { //Konstruktor
		autoFarbe=farbe;
		pferdestaerke=ps;
		
		
	}
	public void updateNavi(int navigationssystem) {
		navi = navigationssystem;
	}
	public int getNavi() {
		return navi;
		}
	public void power (int speed) {
		pferdestaerke = speed;
	}
	public int getPferdestaerke() {
		return pferdestaerke;
	}
	public void aussehen(String farbe) {
		autoFarbe = farbe;
	}
	public String getautoFarbe() {
		return autoFarbe;
	}
}
