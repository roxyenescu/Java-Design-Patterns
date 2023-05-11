package chainOfResponsability.clase;

public class NotificatorTelefon extends Notificator {

	@Override
	public void notificaClient(Client client, String mesaj) {
		if(client.getTelefon() != null) {
			System.out.println("Clientul " + client.getNume() + " a primit un SMS: " + mesaj);
		}
		else {
			if(super.getSuccesor() != null) {
				super.getSuccesor().notificaClient(client, mesaj);
			}
			else {
				System.out.println("Clientul " + client.getNume() + " nu poate fi notificat");
			}
		}
	}
}
