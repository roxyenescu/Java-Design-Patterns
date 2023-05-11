package simple_factory_clase;

public class Asistent implements PersonalSpital {
	
	private String nume;

	public Asistent(String nume) {
		super();
		this.nume = nume;
	}
	
	public void descriere() {
		System.out.println("Asistentul: " + this.nume);
	}

}
