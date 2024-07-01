
public interface GoeFigur {
	
	//WICHTIG: Alle Methoden sind IMMER abstract, Es dürfen nur Methoden ins Interface
								
	 //int x; <-- Instanz-Variabeln darf es in einem Interface nicht geben
	 //int y;
	
	/*public GoeFigur(int x, int y) { <-- Konstruktor darf es in einem Interface nicht geben
		this.x = x;
		his.y = y;
		}*/
	
	public double umfangBerechnen(); //Vorher public abstract double - abstract hat nichts im Interface verloren
	public double flaechenBerechnen();
	
	public void gibKoordinatenAus(); 
			//System.out.println("X: " +x+" - Y: "+y);//Fertig Methode passt nicht in ein Interface
	}


