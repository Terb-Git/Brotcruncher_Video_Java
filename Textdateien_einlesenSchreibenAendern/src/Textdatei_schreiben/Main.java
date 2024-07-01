package Textdatei_schreiben;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
//https://youtu.be/mM_7OYeEB28?si=vq89NwHQFOaG5sh5
	public static void main(String[] args) {
		File datei = new File("c:/Test/test.txt");//File sorgt dafür, dass txt datei zum arbeiten zur Verfügung gemacht wird
											// Nun gibt es diese test.txt nicht
		//Deshalb muss test.txt erst erstellt werden
		//System.out.println(datei.isFile());//Prüfung, ob Datei test.txt evtl. da ist --> false
		
		try {
			FileWriter writer = new FileWriter (datei, true);//Durch das neue writer Objekt der FileWriter Klasse wird Datei erstellt.
			
			/* true sorgt dafür, dass in der Datei hinter dem bestehenden Text, die neue Zeile 3 eingefügt wird  
			writer.write("Line 3"); dafür die unteren zeilen 21-23 auskommentieren
			*/
			writer.write("Hello File \n");//Dann sagen wir dem writer Objekt, nimm dir diesen String  Hello FIle und schreibe diesen ind ie Dateitest.txt
			writer.write("Line 1\n");
			writer.write("Line 2\n");
			writer.flush();//Sorgt dafür dass das was sich der writer speichert, sprich der Text Hello FIle, Line 1 .... in die Datei geschrieben wird
			writer.close(); //Schließt das writer Objekt -Prof. SStil
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Datei konnte nicht bearbeitet werden");
		}
		
		

	}

}
