package OOP.polyMorphismEx.vehicles.vehicles;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_CONSUMPTION = 1.6;
    public Truck(double fuel, double fuelConsumption) {
        super(fuel, fuelConsumption + AIR_CONDITIONER_CONSUMPTION);
    }

    @Override
    public String drive(double distance){
        return "Truck" + super.drive(distance);
    }
    @Override
    public void refuel(double quantity) {
        super.refuel(quantity * 0.95);
    }
    @Override
    public String toString(){
        return "Truck" + super.toString();
    }
}
