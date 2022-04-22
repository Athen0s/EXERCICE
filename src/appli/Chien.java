package appli;

public class Chien extends Animal
{
	// CONSTANTES
	private static final int NB_PATTES = 4; // Nombre de pattes
	private static final String SON = "Wouaf"; // Son emis

	// CONSTRUCTEURS
	public Chien(int age, String nom, char sexe)
	{
		super(age, nom, sexe, NB_PATTES, SON);
	}
}
