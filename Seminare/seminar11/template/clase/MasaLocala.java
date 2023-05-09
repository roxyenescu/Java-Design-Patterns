package template.clase;

public class MasaLocala extends MasaRestaurant{

	public MasaLocala(int numarMasa) {
		super(numarMasa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void curataMasa() {
		System.out.println("Se curata masa " + getNumarMasa() + " pentru persoanele de la usa!");
		
	}

	@Override
	protected void aseazaServetele() {
		System.out.println("Se aseaza servetelele pe masa " + getNumarMasa() + "");
		
	}

	@Override
	protected void aseazaTacamuri() {
		System.out.println("Se aseaza tacamuri pe masa " + getNumarMasa() + "");
		
	}

	@Override
	protected void invitaPersoane() {
		System.out.println("Se invita persoanele la masa " + getNumarMasa());
		
	}


	

}
