package TextdateiEinlesen;

import java.io.File;//Import File Klasse
import java.io.FileNotFoundException;
import java.util.Scanner;
//https://youtu.be/xQ_Kiv0j2_A?si=YTm8C4M7wpVOG8Zi
public class Texteinlesen_main {

	public static void main(String[] args) {
		File datei = new File("C:/Test/text.txt");//Neues Objekt datei von der File-Klasse//
											//Java kann mit Text.txt Dateien nichts anfangen.		
											//Durch die File Klasse kann ein Text Dokument in Java bekannt gemacht und gespeichert werden
		//System.out.println(datei.isFile());//Überprüfung, ob ein File erzeugt werden konnte.
		Scanner scan = null;//Scanner muss bevor er einliest auf null setzen!!!!
		try {//Try Catch muss, da evtl. die Datei nciht vorhanden sein könnte
			scan = new Scanner(datei);//In die Klammer der Scaner Klasse steht immer das was wir einlesen möchten
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not Found");
		}
		//System.out.println(scan.nextLine());//Ausgabe des 1. Absatzes
		while(scan.hasNext()) {//prüft in der text.txt datei, ob noch text von oben links 1.Zeile(Zeiger = scan = null) vorhanden ist. Somit ist die Bedinung true
								//Nun scan.hasNext Zeile für Zeile bis zum Ende durch bzw. bis Bedinung false ist.
			System.out.println(scan.nextLine());// Gib jede Zeile aus
		}
	}

}
