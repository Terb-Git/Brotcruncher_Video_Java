package Aufgabe23_Telefonnumer_Hashtable;

import java.util.Hashtable;

public class TelefonnummerDemo {

	public static void main(String[] args) {
		Hashtable<String, Telefonnummer> telefonNummern = new Hashtable<String, Telefonnummer>();
		Telefonnummer t1 = new Telefonnummer("49", "160", "12345", "0");
		Telefonnummer t2 = new Telefonnummer("49", "171", "34562", "1");
		telefonNummern.put("Stefan", t1);
		telefonNummern.put("Marion", t2);
		
		Telefonnummer stefansNummer = telefonNummern.get("Stefan");
		System.out.println(stefansNummer.toString());
		System.out.println(t2);

	}

}
