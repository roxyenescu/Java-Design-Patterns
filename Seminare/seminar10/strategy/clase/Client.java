package strategy.clase;

public class Client {
	
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new PlataCash(); //mod de plata default
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void realizeazaPlata(float sumaPlata) {
		modPlata.plateste(this.nume, sumaPlata);
	}

}
