package state.clase;

public class StareOcupata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		
		if(!(masa.getStare() instanceof StareOcupata)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNumar() + " este ocupata in acest moment!");
		} else {
			System.out.println("Masa nu poate fi ocupata!");
		}
		
	}

}
