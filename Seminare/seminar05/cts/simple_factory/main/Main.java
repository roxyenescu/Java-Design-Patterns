// PROBLEMA 2 - SPITAL
package cts.simple_factory.main;

import java.util.ArrayList;
import java.util.List;

import cts.simple_factory_clase.Asistent;
import cts.simple_factory_clase.Factory;
import cts.simple_factory_clase.PersonalSpital;
import cts.simple_factory_clase.TipPersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.ASISTENT, "Popescu Ion");
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.MEDIC, "Ionescu Dan ");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.BRANCARDIER, "Manescu Ioana");
		
		asistent.descriere();
		medic.descriere();
		brancardier.descriere();
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(asistent);
		listaPersonal.add(medic);
		listaPersonal.add(brancardier);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Maria"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER, "Cristian"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Diana"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ANESTEZIST, "Irina"));
		
		for(PersonalSpital personal: listaPersonal) {
			personal.descriere();
		}
		
		
	}

}
