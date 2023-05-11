package chainOfResponsability.main;

import chainOfResponsability.clase.Client;
import chainOfResponsability.clase.Notificator;
import chainOfResponsability.clase.NotificatorMail;
import chainOfResponsability.clase.NotificatorManager;
import chainOfResponsability.clase.NotificatorTelefon;

public class Main {

	public static void main(String[] args) {
		
		Notificator notificatorEmail = new NotificatorMail();
		Notificator notificatorSMS = new NotificatorTelefon();
		Notificator notificatorManager = new NotificatorManager();
		
		notificatorEmail.setSuccesor(notificatorSMS);
		notificatorSMS.setSuccesor(notificatorManager);
		
		Client client1 = new Client("Roxana", "adelinafatu@yahoo.com", null);
		Client client2 = new Client("Roxana", null, "0732916701");
		Client client3 = new Client("Roxana", "adelinafatu@yahoo.com", "0732916701");
		Client client4 = new Client("Roxana", null, null);
		
		notificatorEmail.notificaClient(client1, "Ro Alert: Vant puternic");
		notificatorEmail.notificaClient(client2, "Ro Alert: Vant puternic");
		notificatorEmail.notificaClient(client3, "Ro Alert: Vant puternic");
		notificatorEmail.notificaClient(client4, "Ro Alert: Vant puternic");

	}

}
