package Array2D_und_foreachAusgabe;

public class Array2d {

	public static void main(String[] args) {

		String [][] name = new String [2][2];
		name [0][0] = "Franz";
		name [0][1] = "Bauer";
		name [1][0] = "Hanna";
		name [1][1] = "Motto";
		
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
			
		}
		

	}

}
