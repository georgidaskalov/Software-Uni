package OOP.polyMorphismEx.vehicles.vol2;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuel;
    private double fuelConsumption;
    public DecimalFormat formatter;
    private double tankCapacity;

    public Vehicle(double fuel, double fuelConsumption, double tankCapacity) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.formatter = new DecimalFormat("##.##");
        this.tankCapacity = tankCapacity;
    }


    public void refuel(double quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else {
            if (this.fuel + quantity > this.tankCapacity) {
                throw new IllegalArgumentException("Cannot fit fuel in tank");
            }
            this.fuel += quantity;
        }
    }

    public String drive(double distance) {
        double fuelNeeded = distance * fuelConsumption;
        if (fuelNeeded > this.fuel) {
            return " needs refueling";
        } else {
            this.fuel -= fuelNeeded;
            return String.format(" travelled " + formatter.format(distance) + " km", distance);
        }
    }

    @Override
    public String toString() {
        return String.format(": %.2f", this.fuel);
    }

    public double getFuel() {
        return this.fuel;
    }

    protected String driveWithIncreasedConsumption(double distance, double increment) {
        this.fuelConsumption += increment;

        String result = this.drive(distance);

        this.fuelConsumption -= increment;
        return result;
    }
}
