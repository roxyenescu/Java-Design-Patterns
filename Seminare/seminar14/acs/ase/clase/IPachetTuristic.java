package acs.ase.clase;

public interface IPachetTuristic {
	
	Double getPret();
	IPersoana getClient();
	public boolean poateRezerva();
	public void aplicaDiscountVarstnici(int procent);
	void setClient(IPersoana client);
	public String getDestinatie();
	void setDestinatie(String destinatie);
	void setPret(Double pret);

}
