package OOP.polyMorphismEx.wildFarm;

public class Vegetable extends Food {
    public Vegetable(int quantity) {
        super(quantity);
    }

    @Override
    public String getType() {
        return "Vegetable";
    }
}
