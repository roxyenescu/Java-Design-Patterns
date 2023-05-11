package factory_method.main;

import java.util.ArrayList;
import java.util.List;

import factory_method.clase.Factory;
import factory_method.clase.FactoryAsistent;
import factory_method.clase.FactoryInfirmier;
import factory_method.clase.FactoryMedic;
import factory_method.clase.Infirmier;
import factory_method.clase.PersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory fabricaAsistenti = new FactoryAsistent();
		Factory fabricaMedici = new FactoryMedic();
		Factory fabricaInfirmieri = new FactoryInfirmier();
		
		Infirmier infirmier = (Infirmier) fabricaInfirmieri.createPersonal("Ion");
		infirmier.setAniVechime(15);
		
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(fabricaAsistenti.createPersonal("Popescu"));
		listaPersonal.add(fabricaAsistenti.createPersonal("Ionescu"));
		listaPersonal.add(fabricaMedici.createPersonal("Marinescu"));
		listaPersonal.add(infirmier);
		
		for(PersonalSpital personal : listaPersonal) {
			personal.descriere();
		}

	}

}
