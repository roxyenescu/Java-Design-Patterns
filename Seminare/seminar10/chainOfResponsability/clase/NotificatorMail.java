package chainOfResponsability.clase;

public class NotificatorMail extends Notificator{

	@Override
	public void notificaClient(Client client, String mesaj) {
		if(client.getEmail() != null) {
			System.out.println("Clientul " + client.getNume() + " a primit un mail: " + mesaj);
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
