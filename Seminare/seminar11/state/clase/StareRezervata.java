package state.clase;

public class StareRezervata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		
		if(masa.getStare() instanceof StareLibera) // se poate rezerva doar daca masa este in stare libera
		{
			masa.setStare(this);
			System.out.println("Masa " + masa.getNumar() + " este rezervata in acest moment!");
		} else {
			System.out.println("Masa nu poate fi rezervata!");
		}
		
	}

}
