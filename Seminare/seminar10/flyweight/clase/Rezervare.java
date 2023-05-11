package flyweight.clase;

public class Rezervare {
	
	private int id;
	private int numarMasa;
	private int numarPersoane;
	private String oraRezervare;
	
	public Rezervare(int id, int numarMasa, int numarPersoane, String oraRezervare) {
		super();
		this.id = id;
		this.numarMasa = numarMasa;
		this.numarPersoane = numarPersoane;
		this.oraRezervare = oraRezervare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumarMasa() {
		return numarMasa;
	}

	public void setNumarMasa(int numarMasa) {
		this.numarMasa = numarMasa;
	}

	public int getNumarPersoane() {
		return numarPersoane;
	}

	public void setNumarPersoane(int numarPersoane) {
		this.numarPersoane = numarPersoane;
	}

	public String getOraRezervare() {
		return oraRezervare;
	}

	public void setOraRezervare(String oraRezervare) {
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [id=" + id + ", numarMasa=" + numarMasa + ", numarPersoane=" + numarPersoane
				+ ", oraRezervare=" + oraRezervare + "]";
	}

}
