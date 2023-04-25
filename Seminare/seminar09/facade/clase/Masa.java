package facade.clase;

public class Masa {
	
	private Boolean masaLibera;
	private Boolean areServetele;
	private int nrMasa;
	
	public Masa(Boolean masaLibera, Boolean areServetele, int nrMasa) {
		super();
		this.masaLibera = masaLibera;
		this.areServetele = areServetele;
		this.nrMasa = nrMasa;
	}
	
	public Boolean getMasaLibera() {
		return masaLibera;
	}
	
	public void setMasaLibera(Boolean masaLibera) {
		this.masaLibera = masaLibera;
	}
	
	public Boolean getAreServetele() {
		return areServetele;
	}
	
	public void setAreServetele(Boolean areServetele) {
		this.areServetele = areServetele;
	}
	
	public int getNrMasa() {
		return nrMasa;
	}
	
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	

}
