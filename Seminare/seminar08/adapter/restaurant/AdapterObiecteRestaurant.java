package adapter.restaurant;

import adapter.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant {
	
	private ISoftBar bar;
	
	public AdapterObiecteRestaurant(ISoftBar bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		this.bar.printeazaNotaBautura(totalSuma);
	}
}
