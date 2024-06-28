package Br_21_end;
// Bedinungsoperator auch ?-Operator genannt

public class Br23_Operator_Fragezeichen {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		//int z= x<y ? x:y; //Findet den kelineren von x und y und speichert diesen in z
		int z= x<y ? 10:49; // x = 3 < y = 4 also True somit wird die 10 ausgegeben.
		System.out.println(z);
	}
}
