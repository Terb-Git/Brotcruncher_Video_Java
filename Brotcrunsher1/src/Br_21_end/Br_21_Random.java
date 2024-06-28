package Br_21_end;

import java.util.Random;

public class Br_21_Random {

	public static void main(String[] args) {
		Random wurfel = new Random();
		int y = wurfel.nextInt(6)+1;//Normalerweise, wird wie beim Array die angegebene Zahl minus 1 ausgegeben. d. h. bei 6 wird 0-5 angeben.
									// bei +1 wird somit 1-6 random ausgegegebn. z.B. mensch ärgere dich nciht. 
		System.out.println(y);
		

	}

}
