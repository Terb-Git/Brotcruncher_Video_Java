package Ueb53.Javadoc;

/**
 * 
 * 
 * @author thors
 * 
 * 
 */

public class PersonMain {

	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args Dies ist ein Parameter
	 */
	public static void main(String[] args) {
		
			Person p = new Person();
			Adresse a = new Adresse();
			a.setStrasse("Mitterweg 1");
			a.setPlz("12345");
			a.setOrt("Irgendwo");
			p.setVorname("Heinz");
			p.setName("Müller");
			p.setAdresse(a);
			System.out.println(" * " + p.getVorname());
			
			System.out.println(" * " + p.getName());
			System.out.println("------------");
			a.print();
			
		}
	}

