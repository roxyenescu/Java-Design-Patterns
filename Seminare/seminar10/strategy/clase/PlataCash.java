package strategy.clase;

public class PlataCash implements ModPlata {

	@Override
	public void plateste(String numeClient, float sumaPlata) {
		System.out.println("Clientul "+ numeClient + " a realizat plata cash pentru suma de " + sumaPlata);
	}
}
