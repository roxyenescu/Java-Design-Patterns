package composite.main;

import composite.clase.Item;
import composite.clase.Produs;
import composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Item meniu = new Sectiune("Meniu restaurant");
		
		//sectiuni
		Item sectiuneBauturi = new Sectiune("Bauturi");
		Item sectiuneStartere = new Sectiune("Startere");
		
		//subsectiuni
		Item subsectiuneCafele = new Sectiune("Cafele");
		Item subsectiuneSucuri = new Sectiune("Sucuri");
		
		//produse
		Item produsFrappe = new Produs("Frappe");
		Item produsCapuccino = new Produs("Capuccino");
		Item produsPepsi = new Produs("Pepsi");
		Item produsFanta = new Produs("Fanta");
		Item produsApa = new Produs("Apa");
		Item produsBruschete = new Produs("Bruschete");
		
		//legaturi
		try {
			subsectiuneCafele.adaugareItem(produsFrappe);
			subsectiuneCafele.adaugareItem(produsFrappe);
			
			subsectiuneSucuri.adaugareItem(produsFanta);
			subsectiuneSucuri.adaugareItem(produsPepsi);
			
			sectiuneBauturi.adaugareItem(subsectiuneCafele);
			sectiuneBauturi.adaugareItem(produsApa);
			sectiuneBauturi.adaugareItem(subsectiuneSucuri);
			sectiuneStartere.adaugareItem(produsBruschete);
			
			meniu.adaugareItem(sectiuneStartere);
			meniu.adaugareItem(sectiuneBauturi);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		meniu.descriere("    ");
	}
}
