package proxy.main;

import proxy.clase.IRestaurant;
import proxy.clase.ProxyRestaurant;
import proxy.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		
		IRestaurant restaurant = new Restaurant("Britania");
		restaurant.rezervaMasa(2);
		
		IRestaurant proxy = new ProxyRestaurant(restaurant);
		proxy.rezervaMasa(2);
		proxy.rezervaMasa(4);

	}

}
