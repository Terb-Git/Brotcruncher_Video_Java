package MethodeRückw3;

public class Easygoing3 {
	
	public static int methode (int x, int y) {
		 int c = 100;
		 int summe = x+y+c;
		 return summe;
	 }
	public static boolean geil (int x, int y) {
		if (x>y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	 public static void main (String[] args) {
		 int x = 15;
		 int y = 12;
		 int result = methode(22,12);
		 
		 System.out.println(result);
		 
		 System.out.println(geil(x,y));
	 }
}
