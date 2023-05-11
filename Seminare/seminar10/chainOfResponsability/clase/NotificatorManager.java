package chainOfResponsability.clase;

public class NotificatorManager extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		System.out.println("Clientul " + client.getNume() + " nu poate fi notificat");
	}
}
