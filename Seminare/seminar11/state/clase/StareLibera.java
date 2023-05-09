package state.clase;

public class StareLibera implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		
		if(!(masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNumar() + " este eliberata!");
		} else {
			System.out.println("Masa este deja libera!");
		}
	}

}
