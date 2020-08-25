package advanced.DefiningClassesLab;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this(brand);
        this.model = model;
        this.horsePower = horsePower;
    }

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }


    public String getInfo(){
        return String.format("The car is: %s %s - %d HP.",this.getBrand(),this.getModel(),this.getHorsePower());
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getHorsePower() {
        return this.horsePower;
    }

}
