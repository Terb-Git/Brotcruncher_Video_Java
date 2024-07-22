package Multithread.Ueb5_2;

public class Main {

	public static void main(String[] args) {
		//MyDateshow date = new MyDateshow ();
		//date.run();
		Thread t = new Thread(new MyDateshow());
		t.start();
	}

}
