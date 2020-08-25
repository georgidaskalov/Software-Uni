package OOP.polyMorphismEx.vehicles.vol2;

public class Bus extends Vehicle {
    private static final double AIR_CONDITIONER_CONSUMPTION = 1.4;

    public Bus(double fuel, double fuelConsumption, double tankCapacity) {
        super(fuel, fuelConsumption, tankCapacity);
    }

    @Override
    public String toString() {
        return "Bus" + super.toString();
    }

    @Override
    public String drive(double distance) {
        return "Bus" + super.drive(distance);
    }

    public String driveWithPassengers(double distance) {
        return super.driveWithIncreasedConsumption(distance , 1.4);
    }

}
