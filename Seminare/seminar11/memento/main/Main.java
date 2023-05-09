package memento.main;

import memento.clase.Autobuz;
import memento.clase.OperatorAutobuze;

public class Main {

	public static void main(String[] args) {
		
		Autobuz autobuz = new Autobuz("Vasile", 15, "Mercedes", 2005, 50);
		OperatorAutobuze operator = new OperatorAutobuze();
		operator.adaugaMemento(autobuz.creareMemento());
		System.out.println(autobuz.toString());
		
		autobuz.setNumeSofer("Ion");
		autobuz.setConsumMediu(17);
		System.out.println(autobuz.toString());
		
		autobuz.restaurareAutobuz(operator.getMemento(0)); // 0 pentru ca avem unul singur
		System.out.println(autobuz.toString());

	}

}
