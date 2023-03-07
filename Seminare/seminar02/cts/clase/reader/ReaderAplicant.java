package cts.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;

public abstract class ReaderAplicant {

	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;	// o metoda abstracta nu poate fi statica
	
	public void readAplicant(Aplicant aplicant, Scanner scanner) {
		aplicant.setNume(scanner.next());
		aplicant.setPrenume(scanner.next());
		aplicant.setVarsta(scanner.nextInt());
		aplicant.setPunctaj(scanner.nextInt());
		
		int numarProiecte = scanner.nextInt();
		String[] denumiriProiecte = new String[numarProiecte];
		for (int i = 0; i < numarProiecte; i++) {
			denumiriProiecte[i] = scanner.next();
		}
		aplicant.setNr_proiecte(numarProiecte, denumiriProiecte);
	}
	
}
