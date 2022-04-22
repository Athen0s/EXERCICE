package appli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Programme
{
	public static void main(String[] args)
	{
		// TOPIC01 - EXO1
		System.out.println("TOPIC01 - EXO1");

		// - CREATION DE 2 MANAGERS
		Manager man1 = new Manager(Personne.Sexe.F, "DEBIF", "Sam", Util.makeDate(1972, 9, 7), 168);
		Manager man2 = new Manager(Personne.Sexe.F, "DUMONT", "Raumane", Util.makeDate(1983, 4, 4), 168);

		// - CREATION DE 4 DEVELOPPEURS + AJOUT DE "SAM" EN TANT QUE MANAGER A "PIERRE"
		// ET "PAUL"
		Developpeur dev1 = new Developpeur(Personne.Sexe.M, "MARCHAND", "Pierre", Util.makeDate(1989, 2, 14), 180,
				man1);
		Developpeur dev2 = new Developpeur(Personne.Sexe.M, "DURANT", "Paul", Util.makeDate(1991, 7, 18), 178, man1);
		Developpeur dev3 = new Developpeur(Personne.Sexe.M, "ADIT", "Jacques", Util.makeDate(1980, 12, 24), 180);
		Developpeur dev4 = new Developpeur(Personne.Sexe.F, "PACOT", "Julie", Util.makeDate(1976, 8, 9), 180);

		// - AJOUT D'AU MOINS 2 COMPETENCES AUX 4 DEVELOPPEURS
		dev1.addSkills(Skills.ANGULAR);
		dev1.addSkills(Skills.DELIVERY);
		dev2.addSkills(Skills.GCP);
		dev2.addSkills(Skills.JAVA);
		dev2.addSkills(Skills.JENKINS);
		dev3.addSkills(Skills.PHP);
		dev3.addSkills(Skills.REACT);
		dev4.addSkills(Skills.SELENIUM);
		dev4.addSkills(Skills.JAVA);

		// - LISTE DES MEMBRES QUI ONT LA COMPETENCE "JAVA" + MANAGER A CONTACTER
		System.out.println("Liste des membres qui ont la compétence \"Java\" et leur manager :");
		// Creation d'une liste de developpeurs
		List<Developpeur> listeDev = new ArrayList<Developpeur>();
		listeDev.add(dev1);
		listeDev.add(dev2);
		listeDev.add(dev3);
		listeDev.add(dev4);
		// Recherche des membres qui ont la compétence "Java" et de leur Manager
		for (Developpeur developpeur : listeDev)
		{
			for (Skills skills : developpeur.getSkills())
			{
				if (skills == Skills.JAVA)
				{
					if (developpeur.getManager() != null)
					{
						System.out.println(developpeur.getNom() + " " + developpeur.getPrenom() + ", "
								+ developpeur.getAge() + " ans. Manager à contacter : "
								+ developpeur.getManager().getNom() + " " + developpeur.getManager().getPrenom());
					} else
					{
						System.out.println(developpeur.getNom() + " " + developpeur.getPrenom() + ", "
								+ developpeur.getAge() + " ans. Manager à contacter : Pas de manager attribué");
					}
				}
			}
		}
		System.out.println("");

		// - LISTE DES PERSONNES QUI MESURENT PLUS DE 160CM
		System.out.println("Liste des membres qui mesurent plus de 1,60m :");
		// Creation d'une liste de personnes
		List<Personne> listePersonne = new ArrayList<Personne>();
		listePersonne.add(dev1);
		listePersonne.add(dev2);
		listePersonne.add(dev3);
		listePersonne.add(dev4);
		listePersonne.add(man1);
		listePersonne.add(man2);
		// Recherche des personnes qui mesurent plus de 160
		for (Personne personne : listePersonne)
		{
			if (personne.getTaille() > 160)
			{
				System.out.println(personne.getNom() + " " + personne.getPrenom());
			}
		}
		System.out.println("");

		// TOPIC02 - EXO1
		System.out.println("TOPIC02 - EXO1");
		// Creation du tableau
		int[] monTableau =
		{ 6, 5, 9, 0 };
		// Recherche de l'index de la valeur entrée par l'utilisateur
		System.out.print("Entrez un entier pour vérifier son index dans le tableau [6,5,9,0] : ");
		try (Scanner scanner = new Scanner(System.in))
		{
			Integer valRecherchee = null;
			while (valRecherchee == null)
			{
				try
				{
					valRecherchee = scanner.nextInt();
				} catch (InputMismatchException e)
				{
					System.out.println("Valeur entree incorrecte");
					scanner.next();
					System.out.print("Entrer une nouvelle valeur : ");
				}
			}
			boolean check = false;
			for (int i = 0; i < monTableau.length; i++)
			{
				if (monTableau[i] == valRecherchee)
				{
					check = true;
					System.out.println("L'index de la valeur choisie dans le tableau est : " + i);
				}
			}
			// Gestion du cas ou la valeur entree n'existe pas dans le tableau
			if (!check)
			{
				System.out.println("Valeur non présente dans le tableau");
			}
			System.out.println("");
		}

		// TOPIC02 - EXO2
		System.out.println("TOPIC02 - EXO2");
		// Creation de la liste dans le desordre
		List<String> maListe = new ArrayList<String>();
		maListe.add("Toto");
		maListe.add("Tata");
		maListe.add("Titi");
		maListe.add("Tutu");
		maListe.add("Tete");
		// Affichage de la liste avant le tri
		System.out.println("Affichage de la liste avant le tri : ");
		System.out.println(maListe.toString());
		// Tri
		Collections.sort(maListe);
		// Affichage de la liste apres le tri
		System.out.println("Affichage de la liste après le tri : ");
		System.out.println(maListe.toString());
		System.out.println("");

		// TOPIC02 - EXO3
		System.out.println("TOPIC02 - EXO3");
		// - CREATION D'UN CHIEN ET D'UN CHAT
		Chien chien1 = new Chien(4, "Milou", 'M');
		Chat chat1 = new Chat(10, "Speedy", 'F');
		// - AFFICHAGE, POUR TOUT ANIMAL CREE, DE LA FORME
		// "NOM"-"AGE"-"SEXE"-"AGE*NBPATTES + SEXE"-"SON"
		// Creation d'une liste des animaux
		List<Animal> mesAnimaux = new ArrayList<Animal>();
		mesAnimaux.add(chien1);
		mesAnimaux.add(chat1);
		// - Affichage
		for (int i = 0; i < mesAnimaux.size(); i++)
		{
			System.out.println(mesAnimaux.get(i).getNom() + " - " + mesAnimaux.get(i).getAge() + " - "
					+ mesAnimaux.get(i).getSexe() + " - " + mesAnimaux.get(i).getAge() * mesAnimaux.get(i).getNbPattes()
					+ mesAnimaux.get(i).getSexe() + " - " + mesAnimaux.get(i).getSon());
		}
	}
}