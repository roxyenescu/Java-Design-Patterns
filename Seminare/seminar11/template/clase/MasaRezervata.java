package template.clase;

public class MasaRezervata extends MasaRestaurant {
	
	private String oraRezervare;

	public MasaRezervata(int numarMasa, String oraRezervare) {
		super(numarMasa);
		this.oraRezervare = oraRezervare;
	}

	@Override
	protected void curataMasa() {
		System.out.println("Se curata masa " + getNumarMasa() + " pentru rezervarea de la ora " + this.oraRezervare);
		
	}

	@Override
	protected void aseazaServetele() {
		System.out.println("Se aseaza servetelele pe masa " + getNumarMasa() + " pentru rezervarea de la ora " + this.oraRezervare);
		
	}

	@Override
	protected void aseazaTacamuri() {
		System.out.println("Se aseaza tacamuri pe masa " + getNumarMasa() + " pentru rezervarea de la ora " + this.oraRezervare);
		
	}

	@Override
	protected void invitaPersoane() {
		System.out.println("Va asteptam la masa " + getNumarMasa() + " pentru rezervarea de la ora " + this.oraRezervare);
		
	}
	
	

}
