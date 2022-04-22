package appli;

public class Animal
{
	// ATTRIBUTS
	private int age; // Age
	private String nom; // Nom
	private char sexe; // Sexe
	private final int nbPattes; // Nombre de pattes
	private final String son; // Son emis

	// CONSTRUCTEURS
	protected Animal(int age, String nom, char sexe, int nbPattes, String son)
	{
		this.age = age;
		this.nom = nom;
		this.sexe = sexe;
		this.nbPattes = nbPattes;
		this.son = son;
	}

	// GETTERS
	public int getAge()
	{
		return this.age;
	}

	public String getNom()
	{
		return this.nom;
	}

	public char getSexe()
	{
		return this.sexe;
	}

	public int getNbPattes()
	{
		return this.nbPattes;
	}

	public String getSon()
	{
		return this.son;
	}

	// SETTERS
	public void setAge(int age)
	{
		this.age = age;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setSexe(char sexe)
	{
		this.sexe = sexe;
	}
}
