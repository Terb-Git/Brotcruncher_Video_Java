package Test_Code;

import java.util.Random;

public class While_random {

	public static void main(String[] args) {
		
		Random random = new Random();
		
	while(true) { //Endlosschleife	
		int i = random.nextInt(10);
		
		if (i == 6) {
			break;
		}
		System.out.println("Schade leider keine 6: "+ i);
	}

	}
}