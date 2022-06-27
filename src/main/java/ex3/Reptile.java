package ex3;

public class Reptile extends Animal
{

	public Reptile(String nom, String type, String comportement)
	{
		super(nom, type, comportement);
	}

	@Override
	public void addToZoo(Zoo zoo)
	{
		zoo.getFermeReptile().addAnimal(this);
	}

}
