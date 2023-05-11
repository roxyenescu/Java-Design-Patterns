package flyweight.clase;

import java.util.HashMap;

public class FabricaClienti {

	private HashMap<String, IClient> clienti;
	
	public FabricaClienti() {
		this.clienti = new HashMap<>();
	}
	
	public IClient getClient(String numeClient) {
		if(this.clienti.get(numeClient) != null) {
			return this.clienti.get(numeClient);
		}
		else {
			IClient client = new Client(numeClient, "Nespecificat", "Nespecificat");
			this.clienti.put(numeClient, client);
			return client;
		}
	}
}
