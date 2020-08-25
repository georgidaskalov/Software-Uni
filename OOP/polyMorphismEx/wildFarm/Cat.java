package OOP.polyMorphismEx.wildFarm;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight,
        String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        this.incrementFood(food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Cat");
        builder.append(super.toString());
        builder.insert(builder.indexOf(",") + 1, " " + this.breed + ",");

        return builder.toString();
    }
}
