package appli;

public class Chat extends Animal
{
	// CONSTANTES
	private static final int NB_PATTES = 4; // Nombre de pattes
	private static final String SON = "Miaou"; // Son emis

	// CONSTRUCTEURS
	public Chat(int age, String nom, char sexe)
	{
		super(age, nom, sexe, NB_PATTES, SON);
	}
}
