package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.IPersoana;
import acs.ase.clase.PachetTuristic;
import acs.ase.dubluri.StubPersoana;
import acs.ase.dubluri.StubPersoanaVarstnica;

public class PachetTuristicDiscountTest {

	@Test
	void testAplicaDiscountPersoaneTinere() {
		IPersoana persoana = new StubPersoana();
		PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);
		
		pachet.aplicaDiscountVarstnici(20);
		assertEquals(10.0,(double)pachet.getPret());
	}
	

	@Test
	void testAplicaDiscountPersoaneVarstnice() {
		IPersoana persoana = new StubPersoanaVarstnica();
		PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);
		pachet.aplicaDiscountVarstnici(20);
		assertEquals(8.0,(double)pachet.getPret());
	}

}
