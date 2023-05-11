package command.clase;

public class CommandPlecareInCursa implements ICommand {
	
	private int numarLinie;
	private Automobil automobil;

	public CommandPlecareInCursa(int numarLinie, Automobil automobil) {
		super();
		this.numarLinie = numarLinie;
		this.automobil = automobil;
	}

	@Override
	public void executa() {
		automobil.plecareInCurs(this.numarLinie);
	}
}
