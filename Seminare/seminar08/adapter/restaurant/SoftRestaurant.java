package adapter.restaurant;

public class SoftRestaurant implements ISoftRestaurant {
	
	private String numeBucatar;
	
	public SoftRestaurant(String numeBucatar) {
		super();
		this.numeBucatar = numeBucatar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		System.out.println("Restaurantul condus de " + this.numeBucatar + " are o suma de plata de " + totalSuma);
	}
}
