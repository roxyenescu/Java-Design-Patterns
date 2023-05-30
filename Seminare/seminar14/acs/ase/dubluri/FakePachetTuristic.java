package acs.ase.dubluri;

import acs.ase.clase.IPachetTuristic;
import acs.ase.clase.IPersoana;

public class FakePachetTuristic implements IPachetTuristic {
	
	private Double pret;
	private String destinatie;
	
	@Override
	public Double getPret() {
		// TODO Auto-generated method stub
		return this.pret;
	}

	@Override
	public IPersoana getClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClient(IPersoana client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDestinatie() {
		// TODO Auto-generated method stub
		return this.destinatie;
	}

	@Override
	public void setDestinatie(String destinatie) {
		// TODO Auto-generated method stub
		this.destinatie=destinatie;
	}

	@Override
	public void setPret(Double pret) {
		// TODO Auto-generated method stub
		this.pret = pret;
	}

}
