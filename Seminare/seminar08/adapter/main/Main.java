package adapter.main;

import adapter.bar.ISoftBar;
import adapter.bar.SoftBar;
import adapter.restaurant.AdapterClaseRestaurant;
import adapter.restaurant.AdapterObiecteRestaurant;
import adapter.restaurant.ISoftRestaurant;
import adapter.restaurant.SoftRestaurant;

public class Main {
	
	public static void imprimare(ISoftRestaurant restaurant, double notaPlata) {
		restaurant.printeazaNota(notaPlata);
	}

	public static void main(String[] args) {
		
		ISoftBar bar = new SoftBar("Alcadibo");
		//bar.printeazaNotaBautura(241.99);
		
		ISoftRestaurant restaurant = new SoftRestaurant("Mihai");
		//bucatarie.printeazaNota(300);
		
		//imprimare(bar, 241.99);
		imprimare(restaurant, 300);
		
		AdapterClaseRestaurant adapterClase = new AdapterClaseRestaurant("Adelina");
		imprimare(adapterClase, 513.99);
		
		AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
		imprimare(adapterObiecte, 241.99);

	}

}
