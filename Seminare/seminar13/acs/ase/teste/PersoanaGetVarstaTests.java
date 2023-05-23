package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.MyException;
import acs.ase.clase.Persoana;

public class PersoanaGetVarstaTests {

	@Test // test de CORECTITUDINE
	public void testGetVarstaRight() { 
		Persoana p = new Persoana("Tiberiu", "5020118340456"); // nascut pe 18 ian 2002 , baiat
		assertEquals(21, p.getVarsta());
	}
	
	@Test // BOUNDERY = test de LIMITE (limita superioara)
	public void testGetVarstaBoundaryNouNascut() {
		Persoana p = new Persoana("Tiberiu", "5230521340456"); // nascut pe 23 mai 2023 (azi), baiat
		assertEquals(0, p.getVarsta());
	}
	
	@Test // limita inferioara
	public void testGetVarstaBoundaryAnul2000() {
		Persoana p = new Persoana("Tiberiu", "5000101340456");
		assertEquals(23, p.getVarsta());
	}
	
	@Test // limita inferioara
	public void testGetVarstaBoundaryAnul1900() {
		Persoana p = new Persoana("Tiberiu", "1000101340456");
		assertEquals(123, p.getVarsta());
	}
	
	@Test // limita inferioara
	public void testGetVarstaBoundaryAnul1999() {
		Persoana p = new Persoana("Ana", "299123101340456");
		assertEquals(23, p.getVarsta());
	}
	
	@Test(expected = MyException.class)
	public void testGetVarstaException() {
		Persoana p = new Persoana("Tiberiu", "5230525340456"); // nascut la 25 mai 2023 (maine)
		p.getVarsta();
	}
	
	@Test(timeout = 100) // testez timpul de executie pt 100 milisecunde
	public void testGetVarstaPerformance() { 
		Persoana p = new Persoana("Tiberiu", "5020118340456");
		p.getVarsta(); 
	}

}






