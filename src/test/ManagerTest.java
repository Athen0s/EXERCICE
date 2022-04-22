package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import appli.Developpeur;
import appli.Manager;
import appli.Personne;
import appli.Util;

class ManagerTest
{

	@Test
	// Test de addMembre(Developpeur developpeur)
	void testAddMembre()
	{
		Manager man = new Manager(Personne.Sexe.F, "DEBIF", "Sam", Util.makeDate(1972, 9, 7), 168);
		Developpeur dev = new Developpeur(Personne.Sexe.M, "MARCHAND", "Pierre", Util.makeDate(1989, 2, 14), 180);
		man.addMembre(dev);
		List<Developpeur> test = new ArrayList<Developpeur>();
		test.add(dev);
		assertEquals(test, man.getListeMembres());
	}
}
