package Br_21_end;

public class Br24_ueberladeneMethode {
	/*
	 * 
	 * Überladen = Bedeutet, es wird BEI GLEICHEM METHODENNAME immer die Methode ausgeführt, bei der die Parameterliste(Variablen) übereinstimmt
	 * 
	 * 
	 */
	public static void main (String[] args) {
			int x, y, z, z1;
			x = 3;
			y = 5;
			
			z = rechnen (x,y);//Methoden aufruf
			z1 = rechnen (x,y, false);// Somit wird an dieser Stelle nicht Zeile 21 da Parameterliste nicht übereinstimmt, sondern Methode in Zeile 27 ausgeführt.
			
			System.out.println(z);
			System.out.println(z1);
			}
		public static int rechnen(int x, int y){
			 int z;
			 z = x + y;
			 return z;//z wird zurückgegeben
			}
		
		public static int rechnen(int x, int y, boolean plus) {//lus Variable = truje oder false übergeben bekommen
			 int z;
			 
			  if (plus) {//Falls plus = True übergeben wird - gehe weiter - bei plus = false gehe zu Zeile34
			  z = rechnen(x,y);// führe die Methode rechnen() aus
			  return z;//Liefere das Z Ergebnis zurück
			  
			}else{//Falls plus = False übergeben wird (Wird es siehe Zeile 16) dann 
			   z = x - y;//rechne das 
			   return z;// Gibt z Ergebnis zurück
			}
		}
	}

