package Array2D_und_foreachAusgabe;

public class ArrayString {
	public static void main(String[] args) {
		String [] adresse = new String [4];
		
		adresse[0] = "Name: Hanna";
		adresse[1] = "Strase: Holzweg 12";
		adresse[2] = "69696 Betthausen";
		adresse[3] = "Aussehen: Latino, Blond";
	
		for (int i = 0; i < adresse.length; i++) {
			System.out.println(" "+adresse[i]);
		}
}
}