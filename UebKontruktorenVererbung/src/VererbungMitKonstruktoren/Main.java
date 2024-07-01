package VererbungMitKonstruktoren;

public class Main {

	public static void main(String[] args) {
		Hund hundobjekt1 = new Hund("Bello", 15, "SW","bellen");
		Katze katzenobjekt1 = new Katze("Bella",102,"Hellblond","schnurren");
		
		System.out.println("\n Katzenname: \n" +katzenobjekt1.name+ "\n" + "Katzenalter: " + katzenobjekt1.alter);
		katzenobjekt1.schnurren();//Einfach die Methode aufrufen
		katzenobjekt1.sex();
		
		
		System.out.println("\n Hundename: \n" +hundobjekt1.name  + "\n" + "Hundealter: " + hundobjekt1.alter);
		hundobjekt1.bellen();
		hundobjekt1.sex();
	}
	
}
