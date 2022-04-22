package appli;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager extends Personne
{
	// ATTRIBUTS
	private List<Developpeur> listeMembres; // Liste des développeur à manager

	// CONSTRUCTEURS
	public Manager(Sexe sexe, String nom, String prenom, Date date, int taille)
	{
		super(sexe, nom, prenom, date, taille);
		this.listeMembres = new ArrayList<Developpeur>();
	}

	// METHODES
	/**
	 * Ajoute le developpeur en parametre a la liste des membres du mananger
	 * @param developpeur : Membre a ajouter (Developpeur)
	 */
	public void addMembre(Developpeur developpeur)
	{
		this.listeMembres.add(developpeur);
		developpeur.setManager(this);
	}

	// Retourne la liste des developpeurs d'un manager sous forme d'une chaine de
	// caracteres
	/**
	 * Etabli la liste des developpeurs d'un manager sous forme d'une chaine de
	 * caracteres
	 * @return La liste des developpeurs d'un manager sous forme d'une chaine de
	 *         caracteres (String)
	 */
	public String listMembres()
	{
		return this.listeMembres.toString();
	}

	// GETTERS
	public List<Developpeur> getListeMembres()
	{
		return this.listeMembres;
	}

	// SETTERS
	public void setListeMembres(ArrayList<Developpeur> listeMembres)
	{
		this.listeMembres = listeMembres;
	}
}
