package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone
{
	protected List<Animal> animaux;
	
	protected Zone()
	{
		animaux = new ArrayList<>();
	}

	public void addAnimal(Animal animal)
	{
		animaux.add(animal);
	}

	public void afficherListeAnimaux()
	{
		for (Animal animal : animaux)
		{
			System.out.println(animal.getNom());
		}
	}

	public int compterAnimaux()
	{
		return animaux.size();
	}

	public abstract double calculerKgsNourritureParJour();
}
