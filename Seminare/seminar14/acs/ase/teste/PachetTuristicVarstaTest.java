package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.PachetTuristic;
import acs.ase.dubluri.FakePersoana;

public class PachetTuristicVarstaTest {

	@Test
	void testTanarNuPoateRezerva() {
		FakePersoana persoana = new FakePersoana();
		persoana.setVarsta(16);
		PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);
		
		assertFalse(pachet.poateRezerva());
	}

	@Test
	void testAdultPoateRezerva() {
		FakePersoana persoana = new FakePersoana();
		persoana.setVarsta(41);
		PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);
		
		assertTrue(pachet.poateRezerva());
	}

}
