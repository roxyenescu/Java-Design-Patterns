package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
	
	private List<Integer> meseDebarasate;
	
	public Ospatar() {
		meseDebarasate = new ArrayList<Integer>();
	}
	
	public Boolean esteMasaDebarasata(int nrMasa) {
		return meseDebarasate.contains(nrMasa);
	}
	
	public void debaraseazaMasa(int nrMasa) {
		this.meseDebarasate.add(nrMasa);
	}

}
