package Muli.Threads5_3;

public class Main {

	public static void main(String[] args) {
		
		CustomThread t1 = new CustomThread("Fred 1");
		CustomThread t2 = new CustomThread("Fred 2");
		CustomThread t3 = new CustomThread("Fred 3");
		CustomThread t4 = new CustomThread("Fred 4");
		
		System.out.println(new java.util.Date());
		System.out.println(" ");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
