package ex3;

public class ZooApplication
{

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new MammifereHerbivore("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new MammifereHerbivore("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new MammifereHerbivore("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new MammifereCarnivore("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Poisson("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Poisson("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Reptile("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new Reptile("Python", "SERPENT", "CARNIVORE"));
		
		zoo.afficherListeAnimaux();
	}

}
