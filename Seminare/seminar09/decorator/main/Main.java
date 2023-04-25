package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorNotaDePlataLaMultiAni;
import decorator.clase.DecoratorNotaDePlataPasteFericit;
import decorator.clase.INotaDePlata;
import decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		
		INotaDePlata notaDePlata1 = new NotaDePlata("2023-04-25");
		INotaDePlata notaDePlata2 = new NotaDePlata("2023-04-26");
		
		notaDePlata1.printeazaNotaDePlata(250);
		notaDePlata2.printeazaNotaDePlata(400);
		System.out.println();
		
		Decorator notaDePlataPasteFericit = new DecoratorNotaDePlataPasteFericit(notaDePlata2);
		notaDePlataPasteFericit.printeazaNotaDePlata(400);
		notaDePlataPasteFericit.printeazaFelicitare();
		System.out.println();
		
		// decorare multipla
		Decorator notaDePlataLaMultiAni = new DecoratorNotaDePlataLaMultiAni(notaDePlataPasteFericit); 
		notaDePlataLaMultiAni.printeazaNotaDePlata(250);
		notaDePlataLaMultiAni.printeazaFelicitare();
		System.out.println();
		
		
		

	}

}
