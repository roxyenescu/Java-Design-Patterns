package decorator.clase;

// PROBLEMA 7 RESTAURANT 

public abstract class Decorator implements INotaDePlata{
	
	private INotaDePlata notaDePlata;

	public Decorator(INotaDePlata notaDePlata) {
		this.notaDePlata = notaDePlata;
	}

	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		this.notaDePlata.printeazaNotaDePlata(totalPlata);
		
	}
	
	public abstract void printeazaFelicitare();

}
