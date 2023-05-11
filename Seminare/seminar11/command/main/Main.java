package command.main;

import command.clase.Autobuz;
import command.clase.Automobil;
import command.clase.CommandPlecareInCursa;
import command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		ManagerComenzi manager = new ManagerComenzi();
		Automobil autobuz = new Autobuz(1);
		manager.invocaComanda(new CommandPlecareInCursa(106, new Autobuz(2)));
		manager.invocaComanda(new CommandPlecareInCursa(434, autobuz));
		manager.invocaComanda(new CommandPlecareInCursa(336, new Autobuz(3)));
		manager.invocaComanda(new CommandPlecareInCursa(434, autobuz));
		
		manager.executaComanda();
		manager.executaComanda();
		manager.invocaComanda(new CommandPlecareInCursa(106, new Autobuz(4)));
		manager.executaComanda();
		manager.executaComanda();
		manager.executaComanda();

	}

}
