package strategy.clase;

public class PlataCard implements ModPlata{

	@Override
	public void plateste(String numeClient, float sumaPlata) {
		System.out.println("Clientul "+ numeClient + " a realizat plata cu cardul pentru suma de " + sumaPlata);
	}
}
