package Test_Code;

public class BreakFor {

	public static void main(String[] args) {
		for(int i = 0; i <  10; i++) {
			 if (i == 5){
					System.out.println();
					break; //Break unterbricht nicht den Durchgang sondern die ganze Schleife
					}
			System.out.println(i);
		}

	}

}
