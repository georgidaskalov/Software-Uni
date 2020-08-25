package OOP.polyMorphismEx.wildFarm;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, double animalWeight,  String livingRegion) {
        super(animalName, animalType, animalWeight,  livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public String toString() {
        return "Zebra" +super.toString();
    }

}
