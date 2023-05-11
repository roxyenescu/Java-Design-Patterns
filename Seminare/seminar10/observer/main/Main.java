package observer.main;

import observer.clase.Client;
import observer.clase.Observer;
import observer.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant("Bonita");
		
		Observer client1 = new Client("Adelina");
		Observer client2 = new Client("Mihaela");
		Observer client3 = new Client("Diana");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.notificaOfertaDePret();
		restaurant.stergeObserver(client1);
		restaurant.adaugaObserver(client3);
		restaurant.notificaSchimbareMeniu();

	}

}
