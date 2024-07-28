package Array2D_und_foreachAusgabe;

public class ArrayForEach {

	public static void main(String[] args) {
		
		String [] name = new String [4];
		
		name [0] = "Franz";
		name [1] = "Bauer";
		name [2] = "Hanna";
		name [3] = "Motto";
		
		for (int i = 0; i < name.length; i++) { // Normale For Schleife
			System.out.println(" "+name[i]);
		}
		
		for (String vname : name) { //ForEach Schleife
			System.out.println(vname);
		}
	}
}
