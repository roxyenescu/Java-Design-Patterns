package observer.clase;

public class Client implements Observer {
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptioneazaNotificare(String mesajNotificare) {
		System.out.println(this.nume + " ai primit o notificare: " + mesajNotificare);
	}
}
