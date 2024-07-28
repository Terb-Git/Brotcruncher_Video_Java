package Ueb13_Taschenrechner_Lösung;

public class Loesung13 {

	public static class Taschenrechner {
		public static int add(int x, int y) {
			return x + y;
		}

		public static int sub(int x, int y) {
			return x - y;
		}

		public static int mult(int x, int y) {
			return x * y;
		}

		public static int div(int x, int y) {
			return x / y;
		}

		public static void main(String[] args) {
			int z = add(3, 4);
			System.out.println("Ergebnis: " + z);
		}
	}
}