package Br_21_end;
//Beliebig viele Parameter mit (int...x) 
public class Br25_Parameter_int {

	public static void main(String[] args) {
		int x, y, z , z1;
		x = 3;
		y = 5;
		z = 9;
		z1 = rechnen(x, y, z, 1,2,3,4,5,6);
				System.out.println(z1);
	}
	
	public static int rechnen(int...x) {// (int...x) <-- Bleibt --> Übergabe von Zeile 10 (x, y, z,.....) <-- kann belieb geändert werden
		int d = 0;
		for (int i = 0; i <x.length; i++) {// Gehe in jedes Array Feld x.length = länge des Arrays
			//i Deklaration in der Schleife mit int
			d = d + x[i];// Gehe in jedes Array Feld und addiere den darinbefindlichen Wert zu d dazu
		}
		return d;
	}

}
