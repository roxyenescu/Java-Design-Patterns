package facade.clase;

//PROBLEMA 6 RESTAURANT

public class Restaurant { // clasa FACADE
	
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;
	
	
	
	public Restaurant() {
		meseRestaurant = new MeseRestaurant();
		meseRestaurant.adaugareMasa(new Masa(true, true, 5));
		meseRestaurant.adaugareMasa(new Masa(false, false, 3));
		meseRestaurant.adaugareMasa(new Masa(true, false, 6));
		
		ospatar = new Ospatar();
		ospatar.debaraseazaMasa(5);
		ospatar.debaraseazaMasa(3);
	}
	
	public String verificareDisponibilitateMasa(int nrMasa) {
		if(meseRestaurant.esteMasaLibera(nrMasa)) {
			if(ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa)) {
				return "Masa " + nrMasa + " este libera si puteti lua loc !";
			} else {
				return "Masa " + nrMasa + "  este libera. Asteptati sa fie debarasata !";
			}
		} else {
			return "Masa " + nrMasa + " nu este disponibila momentan !";
		}
	}



}
