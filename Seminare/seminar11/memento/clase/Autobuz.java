package memento.clase;

public class Autobuz {
	
	private String numeSofer; // se schimba
	private float consumMediu; // se schimba
	private String model;
	private int anFabricatie;
	private int nrLocuri;
	
	public Autobuz(String numeSofer, float consumMediu, String model, int anFabricatie, int nrLocuri) {
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.nrLocuri = nrLocuri;
	}
	
	
	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}


	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}


	public void restaurareAutobuz(MementoAutobuz memento) {
		// modificam atributele din this pe baza acelui memento
		this.numeSofer = memento.getNumeSofer();
		this.consumMediu = memento.getConsumMediu();
	}
	
	public MementoAutobuz creareMemento() {
		MementoAutobuz memento = new MementoAutobuz(this.numeSofer, this.consumMediu);
		return memento;
	}


	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", consumMediu=" + consumMediu + ", model=" + model
				+ ", anFabricatie=" + anFabricatie + ", nrLocuri=" + nrLocuri + "]";
	}
	
	
	
	
	

}
