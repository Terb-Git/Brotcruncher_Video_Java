package MethodeRückw3;

public class Easygoing3 {
	
	public static int methode (int a, int b) {
		 int c = 5;
		 int summe = a+b+c;
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
		 int x = 10;
		 int y = 12;
		 int result = methode(x,y);
		 
		 System.out.println(result);
		 
		 System.out.println(geil(x,y));
	 }
}
