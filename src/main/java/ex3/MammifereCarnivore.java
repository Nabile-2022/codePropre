package ex3;

public class MammifereCarnivore extends Animal
{

	public MammifereCarnivore(String nom, String type, String comportement)
	{
		super(nom, type, comportement);
	}

	@Override
	public void addToZoo(Zoo zoo)
	{
		zoo.getZoneCarnivore().addAnimal(this);
	}

}
