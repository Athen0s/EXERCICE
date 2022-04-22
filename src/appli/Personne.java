package appli;

import java.util.Date;

public class Personne
{
	// ENUMS
	public enum Sexe
	{
		M, F
	}

	// ATTRIBUTS
	private Sexe sexe; // Sexe
	private String nom; // Nom
	private String prenom; // Prenom
	private Date date; // Date d'anniversaire
	private int taille; // Taille

	// CONSTRUCTEURS
	protected Personne(Sexe sexe, String nom, String prenom, Date date, int taille)
	{
		this.sexe = sexe;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.taille = taille;
	}

	// GETTERS
	public Sexe getSexe()
	{
		return this.sexe;
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getPrenom()
	{
		return this.prenom;
	}

	public Date getDate()
	{
		return this.date;
	}

	public int getTaille()
	{
		return this.taille;
	}

	// SETTERS
	public void setSexe(Sexe sexe)
	{
		this.sexe = sexe;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setTaille(int taille)
	{
		this.taille = taille;
	}
}
