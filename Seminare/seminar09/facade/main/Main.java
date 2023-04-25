package facade.main;

import facade.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		System.out.println(restaurant.verificareDisponibilitateMasa(5));
		System.out.println(restaurant.verificareDisponibilitateMasa(3));
		System.out.println(restaurant.verificareDisponibilitateMasa(6));

	}

}
