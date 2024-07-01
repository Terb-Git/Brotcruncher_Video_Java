package Beispieluebung;

public class Greeter  {
	String who;
	String what;

	public Greeter (String who){	
	this.who = who;
	}

	public void say(String what) {
	System.out.println(who + " say " + what);
}
}
