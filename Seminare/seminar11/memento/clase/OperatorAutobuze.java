package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuze { // cel care se ocupa de memento-uri
	
	private List<MementoAutobuz> listaMemento = new ArrayList<>();
	
	// Metoda pentru adaugare in lista
	public void adaugaMemento(MementoAutobuz memento) {
		this.listaMemento.add(memento);
	}
	
	// Metoda care sa ne returneze/ obtina un memento din lista
	public MementoAutobuz getMemento(int pozitie) {
		return this.listaMemento.get(pozitie);
	}
	

}
