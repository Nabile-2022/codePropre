package ex3;

public abstract class Animal
{
	private String nom, type, comportement;
	
	public Animal(String nom, String type, String comportement)
	{
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	public String getNom()
	{
		return nom;
	}

	public String getType()
	{
		return type;
	}

	public String getComportement()
	{
		return comportement;
	}
	
	public abstract void addToZoo(Zoo zoo);
}
