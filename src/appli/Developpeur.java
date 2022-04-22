package appli;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Developpeur extends Personne
{
	// ATTRIBUTS
	private Manager manager; // Manager attitre
	private List<Skills> skills; // Liste des skills

	// CONSTRUCTEURS
	public Developpeur(Sexe sexe, String nom, String prenom, Date date, int taille)
	{
		this(sexe, nom, prenom, date, taille, null);
	}

	public Developpeur(Sexe sexe, String nom, String prenom, Date date, int taille, Manager manager)
	{
		super(sexe, nom, prenom, date, taille);
		this.manager = manager;
		if (manager != null)
		{
			this.manager.addMembre(this);
		}
		this.skills = new ArrayList<Skills>();
	}

	// METHODES
	/**
	 * Etabli la liste des skills du developpeur
	 * @return La liste des skills du developpeur sous forme d'une chaine de
	 *         caracteres (String)
	 */
	public String listSkills()
	{
		String result = "";
		for (int i = 0; i < this.skills.size(); i++)
		{
			result = result + this.skills.get(i) + "\n";
		}
		return result;
	}

	/**
	 * Calcul l'age du developpeur en fonction de sa date d'anniversaire et de la
	 * date du jour
	 * @return L'age du developpeur (int)
	 */
	public int getAge()
	{
		LocalDate today = LocalDate.now();
		Period result = Period.between(this.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today);
		return result.getYears();
	}

	/**
	 * Ajoute le skill en parametre au developpeur
	 * @param skill : SKill a ajouter (Skills)
	 */
	public void addSkills(Skills skill)
	{
		this.skills.add(skill);
	}

	// GETTERS
	public Manager getManager()
	{
		return this.manager;
	}

	public List<Skills> getSkills()
	{
		return this.skills;
	}

	// SETTERS
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}

	public void setSkills(ArrayList<Skills> skills)
	{
		this.skills = skills;
	}
}
