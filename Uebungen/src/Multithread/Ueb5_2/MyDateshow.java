package Multithread.Ueb5_2;

public class MyDateshow implements Runnable{

	@Override
	public void run() {
		while (true) {
		
		System.out.println(new java.util.Date());
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	//Thread t= new Thread ();
}


