package OOP.Encapsulation.pizzaCalories;


import OOP.Encapsulation.pizzaCalories.utils.TypeUtils;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200 ){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!TypeUtils.BAKING_TYPES.containsKey(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setFlourType(String flourType) {
        if (!TypeUtils.DOUGH_TYPES.containsKey(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    public double calculateCalories() {
        return this.weight * 2 * TypeUtils.DOUGH_TYPES.get(this.flourType) *
                TypeUtils.BAKING_TYPES.get(this.bakingTechnique);
    }

    //•	White – 1.5;
    //•	Wholegrain – 1.0;
    //•	Crispy – 0.9;
    //•	Chewy – 1.1;
    //•	Homemade – 1.0

}
