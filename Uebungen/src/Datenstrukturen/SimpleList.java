package Datenstrukturen;

import java.util.LinkedList;
import java.util.List;

public class SimpleList {

	public static void main(String[] args) {
		List <String> playlist = new LinkedList <String>();
			
		playlist.add("Hello again");
		playlist.add("Just do it");
		playlist.add("Letter");
		//playlist.remove("Letter"); = löschen
		//playlist.contains(Letter"); = Prüfen, ob vorhanden
		
		System.out.println(playlist);
	}
	

}
