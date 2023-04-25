package decorator.clase;

public class NotaDePlata implements INotaDePlata {
	
	private String dataEmiterii;

	public NotaDePlata(String dataEmiterii) {
		super();
		this.dataEmiterii = dataEmiterii;
	}



	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		System.out.println("Nota dvs de plata din " + this.dataEmiterii + " este in valoare de " + totalPlata + " lei.");
		
	}

}
