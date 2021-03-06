package fr.diginamic.personne.essais;

import fr.diginamic.adressepostale.entities.AdressePostale;
import fr.diginamic.personne.entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse01 = new AdressePostale(12, "35000", "des fleurs", "Rennes");
		AdressePostale adresse02 = new AdressePostale(14, "44000", "bof", "Nantes");

		Personne personne01 = new Personne("Aubree", "Antoine");
		personne01.setAdressePostale(adresse01);

		Personne personne02 = new Personne("L'asticot", "Coco", adresse02);

		System.out.println(personne01);
		System.out.println(personne02);

		personne01.displayNameToUppercase();
		personne02.displayNameToUppercase();
	}

}
