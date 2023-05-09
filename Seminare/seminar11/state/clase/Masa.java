package state.clase;

public class Masa {
	
	int numar;
	Stare stare;
	
	public Masa(int numar) {
		this.numar = numar;
		stare=new StareLibera();
	}
	
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public Stare getStare(){
		return stare;
	}
	
	
	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public void rezervaMasa() {
		Stare rezervata = new StareRezervata(); // creez o stare rezervata
		rezervata.schimbaStare(this);// incerc sa schimb starea mesei
	}

	public void ocupaMasa() {
		Stare ocupata = new StareOcupata();
		ocupata.schimbaStare(this);
	}
	
	public void elibereazaMasa() {
		Stare eliberata = new StareLibera();
		eliberata.schimbaStare(this);
	}
	
	public void ridicaRezervare() {
		Stare ocupata = new StareOcupata();
		ocupata.schimbaStare(this);
	}
	
	public void anuleazaStare() {
		Stare libera = new StareLibera();
		libera.schimbaStare(this);
	}
	
	
	

}
