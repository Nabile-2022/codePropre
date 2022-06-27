package ex3;

public class Zoo
{

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	public Zoo(String nom)
	{
		this.nom = nom;
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore = new ZoneCarnivore();
		fermeReptile = new FermeReptile();
		aquarium = new Aquarium();
	}

	public SavaneAfricaine getSavaneAfricaine()
	{
		return savaneAfricaine;
	}

	public ZoneCarnivore getZoneCarnivore()
	{
		return zoneCarnivore;
	}

	public FermeReptile getFermeReptile()
	{
		return fermeReptile;
	}

	public Aquarium getAquarium()
	{
		return aquarium;
	}

	public void addAnimal(Animal animal)
	{
		animal.addToZoo(this);
	}

	public void afficherListeAnimaux()
	{
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom()
	{
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}
}
