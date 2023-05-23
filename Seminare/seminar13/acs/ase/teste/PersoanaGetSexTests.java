package acs.ase.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.MyException;
import acs.ase.clase.Persoana;

public class PersoanaGetSexTests {

	@Test
	public void testGetRightSexMasculin() { // in numele testului punem metoda pe care o testez
											// numele testului spune explicit ce testeaza
		Persoana p = new Persoana("Tiberiu", "5020118340456"); 
		assertEquals("M", p.getSex());
	}
	
	@Test
	public void testGetRightSexFeminin() {
		Persoana p = new Persoana("Maria", "6000406460071");
		assertEquals("F", p.getSex());
	}
	
	@Test
	public void testGetBoundarySexMasculin() { 
		Persoana p = new Persoana("Tiberiu", "1020118340456"); 
		assertEquals("M", p.getSex());
	}
	
	@Test
	public void testGetCrossCheckSex() { // Cross Check - testez metoda mea prin intermediul altei metode
		Persoana p = new Persoana("Tiberiu", "1020118340456"); 
		assertEquals(verificaParitate(p.CNP), p.getSex());
	}
	
	public String verificaParitate(String CNP) {
		int n = Integer.parseInt(CNP.charAt(0) + "");
		if(n % 2 != 0) return "M";
		return "F";
	}
	

	@Test(expected = MyException.class) // ii dam fisierul class
	public void testGetSexError() { // verificarea de eroare
		Persoana p = new Persoana("Tiberiu", "9020118340456");
		p.getSex(); // ne asteptam sa ne arunce o exceptie de tipul MyException
	}
	
	@Test(timeout = 100) // testez timpul de executie pt 100 milisecunde
	public void testGetSexPerformance() { 
		Persoana p = new Persoana("Tiberiu", "5020118340456");
		p.getSex(); 
	}
	
	
}









