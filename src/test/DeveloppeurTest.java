package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import appli.Developpeur;
import appli.Personne;
import appli.Skills;
import appli.Util;

class DeveloppeurTest
{
	@Test
	// Test de listSkills() avec presence de plusieurs skills
	void testListSkillsWithSkills()
	{
		Developpeur dev = new Developpeur(Personne.Sexe.M, "MARCHAND", "Pierre", Util.makeDate(1989, 2, 14), 180);
		dev.addSkills(Skills.JAVA);
		dev.addSkills(Skills.PHP);
		String test = "JAVA\nPHP\n";
		assertEquals(test, dev.listSkills());
	}

	@Test
	// Test de listSkills() sans skills dans la liste
	void testListSkillsWithtoutSkills()
	{
		Developpeur dev = new Developpeur(Personne.Sexe.M, "MARCHAND", "Pierre", Util.makeDate(1989, 2, 14), 180);
		assertEquals("", dev.listSkills());
	}

	@Test
	// Test de getAge(). La valeur de ce test depend du moment ou ce test est
	// execute (utilisation de la date du jour)
	void testGetAge()
	{
		Developpeur dev = new Developpeur(Personne.Sexe.M, "MARCHAND", "Pierre", Util.makeDate(1989, 2, 14), 180);
		assertEquals(33, dev.getAge());
	}

	@Test
	// Test de addSkills(Skills skill)
	void testAddSkills()
	{
		Developpeur dev = new Developpeur(Personne.Sexe.M, "MARCHAND", "Pierre", Util.makeDate(1989, 2, 14), 180);
		dev.addSkills(Skills.ANGULAR);
		dev.addSkills(Skills.JENKINS);
		List<Skills> test = new ArrayList<Skills>();
		test.add(Skills.ANGULAR);
		test.add(Skills.JENKINS);
		assertEquals(test, dev.getSkills());
	}
}
