package simple_factory_clase;

public class Medic implements PersonalSpital {
	
	private String nume;

	public Medic(String nume) {
		super();
		this.nume = nume;
	}
	
	public void descriere() {
		System.out.println("Medicul: " + this.nume);
	}

}
