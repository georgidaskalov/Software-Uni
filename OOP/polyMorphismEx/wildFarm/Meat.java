package OOP.polyMorphismEx.wildFarm;

public class Meat extends Food {

   public Meat(int quantity) {
        super(quantity);
    }

    @Override
    public String getType() {
        return "Meat";
    }
}
