
public class Br18_Printf {

	public static void main(String[] args) {
		int x = 1;
		int y = 6;
		int z = 100;
		//System.out.printf("Hallo", x);//Printf erwartet 2 Argumente String und Variable
		// System.out.printf("Hallo %d mal Nudeln mit %d Suppeklöchen", x, y);// %d sind Platzhalter für die Variablen in der Reheinfolge der angebegeben Variabeln x und y 
		//System.out.printf("Hallo %d mal Nudeln mit %d Suppeklöschen in %d Teller", x, y, z);
		// Ausgabe: Hallo 1 mal Nudeln mit 6 Suppeklöchen in 100 Teller
		
		
		//Variante mit Methode in dem man den Text "Hallo %d mal Nudeln mit %d Suppeklöschen in %d Teller" in einen String abspeichert
		String s = String.format("Hallo %d mal Nudeln mit %d Suppeklöschen in %d Teller", x, y, z);// in den String s wird durch die String.format methode wird einfach eine Zeichenkette gespeichert
		System.out.println(s);
		// Ausgabe: Hallo 1 mal Nudeln mit 6 Suppeklöchen in 100 Teller
	}
}
