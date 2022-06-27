package ex3;

public class MammifereHerbivore extends Animal
{

	public MammifereHerbivore(String nom, String type, String comportement)
	{
		super(nom, type, comportement);
	}

	@Override
	public void addToZoo(Zoo zoo)
	{
		zoo.getSavaneAfricaine().addAnimal(this);
	}
	
}
