package decorator.clase;

public class DecoratorNotaDePlataPasteFericit extends Decorator {

	public DecoratorNotaDePlataPasteFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Paste fericit!");
		
	}
	
	public void printeazaNotaDePlata(double totalDePlata) {
		super.printeazaNotaDePlata(totalDePlata);
		System.out.println("Paste fericit!");
	}

}
