package OOP.polyMorphismEx.vehicles.vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuel;
    private double fuelConsumption;
    private DecimalFormat formatter;

    public Vehicle(double fuel, double fuelConsumption){
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.formatter = new DecimalFormat("##.##");
    }

    public String drive(double distance){
        double fuelNeeded = distance * fuelConsumption;
        if (fuelNeeded > this.fuel){
            return " needs refueling";
        }else {
            this.fuel -= fuelNeeded;
            return String.format(" travelled "+ formatter.format(distance) +" km",distance);
        }
    }

    public void refuel(double quantity){
        this.fuel += quantity;
    }
    @Override
    public String toString(){
        return String.format(": %.2f",this.fuel);
    }

}
