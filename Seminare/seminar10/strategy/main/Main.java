package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Roxana");
		client.realizeazaPlata(78);
		client.setModPlata(new PlataCard());
		client.realizeazaPlata(1500);
		client.setModPlata(new PlataCash());
		client.realizeazaPlata(100);

	}

}
