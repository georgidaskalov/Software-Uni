package OOP.polyMorphismEx.wildFarm;

import OOP.polyMorphismEx.wildFarm.Eat;
import OOP.polyMorphismEx.wildFarm.Food;
import OOP.polyMorphismEx.wildFarm.ProduceSound;

import java.text.DecimalFormat;

public abstract class Animal implements Eat , ProduceSound {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }


    @Override
    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public String getType() {
        return animalType;
    }

    protected void incrementFood(int quantity){
        this.foodEaten += quantity;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d]",this.animalName,
                new DecimalFormat("##.##").format(this.animalWeight),
                this.foodEaten);
    }
}



