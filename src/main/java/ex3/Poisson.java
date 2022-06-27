package ex3;

public class Poisson extends Animal
{

	public Poisson(String nom, String type, String comportement)
	{
		super(nom, type, comportement);
	}

	@Override
	public void addToZoo(Zoo zoo)
	{
		zoo.getAquarium().addAnimal(this);
	}

}
