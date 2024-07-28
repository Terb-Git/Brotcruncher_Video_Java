package Aufgabe22_Hashtable;

import java.util.Hashtable;

public class Hashtable54 {

	public static void main(String[] args) {

		Hashtable <String, String> kunden = new Hashtable<String, String>();
		
		kunden.put("Udo","0171");
		kunden.put("klaus", "069");
		System.out.println(kunden);
		
		String udosNummer = kunden.get("Udo");
		System.out.println(udosNummer);
		
	}

}
