package factory_method.clase;

public class Anestezist implements PersonalSpital {
	
	private String nume;
	
	public Anestezist (String nume) {
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Anestezist: " + this.nume);
		
	}

}
