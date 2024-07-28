package VectorenTutorial;

import java.util.Vector;

public class StringArrayinVector {
	//Lösung zu Aufgabe 21
	
	
	
	public static void main(String[] args) {
		String [] adresse = new String [5];
		adresse [0] = "Hans";
		adresse [1] = "Heimweg 1";
		adresse [2] = "12345 Iregndwo";
		adresse [3] = "01900";
		adresse [4] = "Email";		
		
		Vector<String> v = new Vector<String>(); //String Array in Vectoren kopieren 
			
		for (String s : adresse) {
			v.add(s);
			System.out.println(v);
	}
		for (String s : v) { 					
			System.out.println(s);
		}
	}
}