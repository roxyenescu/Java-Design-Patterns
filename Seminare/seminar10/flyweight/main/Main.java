package flyweight.main;

import flyweight.clase.FabricaClienti;
import flyweight.clase.IClient;
import flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		FabricaClienti fabrica = new FabricaClienti();
		
		Rezervare rezervare1 = new Rezervare(1, 1, 3, "13:00");
		Rezervare rezervare2 = new Rezervare(2, 2, 1, "13:25");
		Rezervare rezervare3 = new Rezervare(3, 1, 2, "17:30");
		Rezervare rezervare4 = new Rezervare(4, 3, 4, "18:05");
		
		IClient client1 = fabrica.getClient("Marian");
		client1.descriereDetaliiRezervare(rezervare1);
		
		IClient client = fabrica.getClient("Adelina");
		client.descriereDetaliiRezervare(rezervare2);
		
		fabrica.getClient("Marian").descriereDetaliiRezervare(rezervare3);
		fabrica.getClient("Adelina").descriereDetaliiRezervare(rezervare4);

	}

}
