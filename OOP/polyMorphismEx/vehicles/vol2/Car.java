package OOP.polyMorphismEx.vehicles.vol2;


public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;
    public Car(double fuel, double fuelConsumption , double tankCap) {
        super(fuel, fuelConsumption + AIR_CONDITIONER_CONSUMPTION , tankCap);
     }

     @Override
     public String drive(double distance){
        return "Car" + super.drive(distance);
     }

     @Override
    public String toString(){
        return "Car" + super.toString();
     }

}
