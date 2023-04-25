package decorator.clase;

public class DecoratorNotaDePlataLaMultiAni extends Decorator {

	public DecoratorNotaDePlataLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}
	
	public void printeazaNotaDePlata(double totalDePlata) {
		super.printeazaNotaDePlata(totalDePlata);
		System.out.println("La multi ani!");
	}
	
	@Override
	public void printeazaFelicitare() {
		System.out.println("La multi ani!");
	}
	
	

}
