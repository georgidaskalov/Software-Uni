package OOP.polyMorphismEx.wildFarm;

public abstract class Food {
    private int quantity;

    Food(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract String getType();
}
