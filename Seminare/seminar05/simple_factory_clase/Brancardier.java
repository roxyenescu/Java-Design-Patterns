package simple_factory_clase;

public class Brancardier implements PersonalSpital{
	
	private String nume;

	public Brancardier(String nume) {
		super();
		this.nume = nume;
	}
	
	public void descriere() {
		System.out.println("Brancardierul: " + this.nume);
	}

}
