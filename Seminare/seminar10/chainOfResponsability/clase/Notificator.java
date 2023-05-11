package chainOfResponsability.clase;

public abstract class Notificator {
	
	private Notificator succesor = null;
	
	public abstract void notificaClient(Client client, String mesaj);

	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}

	public Notificator getSuccesor() {
		return succesor;
	}

}
