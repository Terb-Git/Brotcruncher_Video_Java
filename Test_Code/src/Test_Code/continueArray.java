package Test_Code;

public class continueArray {
	public static void main(String[] args) {
		String[] strings = new String[5]; //Array erstellen
		strings[0] = "Du";
		strings[2] = "bist";
		strings[4] = "Hammer";
		
		for (String string : strings) {
			if (string == null) {//If schleife filtert die null daziwschen raus, da Array Felder 0 2 4 nur ausgelesen wird
				continue;//wenn string = null dann continue
			}
			System.out.println(string);
		}
	}

}
