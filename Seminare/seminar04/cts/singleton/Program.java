package cts.singleton;

public class Program {

	public static void main(String[] args) {
		
//		Rector rector1 = Rector.getInstance("Vasile", 2, 50);
//		Rector rector2 = Rector.getInstance("Ion", 1, 40);
//		System.out.println(rector1);
//		System.out.println(rector2);
//		
//		Decan decan1 = Decan.getInstance();
//		Decan decan2 = Decan.getInstance();
//		decan2.setNume("Mircea");
//		System.out.println(decan1.getNume());
//		System.out.println(decan2.getNume());
		
		Firma firma1 = Firma.getFirma("SC FIRMA SRL");
		Firma firma2 = Firma.getFirma("SC ALTA FIRMA SRL");
		Firma firma3 = Firma.getFirma("SC FIRMA SRL");
		
		firma1.setNrAngajati(10);
		firma2.setNrAngajati(15);
		firma3.setNrAngajati(30);
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());

	}

}
