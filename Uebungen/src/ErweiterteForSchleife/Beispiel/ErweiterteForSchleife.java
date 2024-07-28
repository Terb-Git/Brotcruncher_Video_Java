package ErweiterteForSchleife.Beispiel;

public class ErweiterteForSchleife {

	public static void main(String[] args) {
			 
			   int[] numbers = {1,2,3,4,5,6,7,8,9,10};
			   int result = 0;
			 
			   System.out.println("\nAusgabe des Arrays mit der normalen for-Schleife");
			 
			   for (int i = 0; i < numbers.length; ++i)
			   {
			      System.out.println("Der Zahlenwert ist: " + numbers[i]);
			   }
			 
			 
			   System.out.println("\nAusgabe des Arrays mit der erweiterten for-Schleife");
			 
			   for (int item : numbers) 
			   {
			      System.out.println("Der Zahlenwert ist: " + item);
			   }
			 
			   System.out.println("\nSumme Array-Elemente mit erweiterter for-Schleife");
			 
			   for (int i : numbers) 
			   {
			      result += i;
			   }
			   System.out.println("Die Summe ist: " + result);
			 
			 }

	}


