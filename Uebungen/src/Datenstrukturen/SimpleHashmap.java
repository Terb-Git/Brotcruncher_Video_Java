package Datenstrukturen;

import java.util.HashMap;// Gut für LoginDaten: Name und Passwort

public class SimpleHashmap {

	public static void main(String[] args) {
		HashMap<String, String> hashmapname = new HashMap<String, String>();
		
				hashmapname.put("Jan", "Don");
		System.out.println(hashmapname);
		System.out.println(hashmapname.get("Jan"));

		//hashmapname.remove("Jan"); -->Löschen
		//hashmapname.get("Jan"); --> Gibt DOn aus
		

	}

}
		//Anderes Beispiel
		//Hashtable<int, Kunde> kunden = new Hashtable<int, Kunde>();
		//kunden.put(4711, new Kunde(“Müller“));
		//Kunde k = kunden.get(4711);

		