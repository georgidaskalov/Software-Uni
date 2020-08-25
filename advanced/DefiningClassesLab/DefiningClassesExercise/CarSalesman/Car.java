package DefiningClassesExercise.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String colour;

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
        this.weight = -1;
        this.colour = "n/a";
    }
    public Car(String model , Engine engine, int weight){
        this(model,engine);
        this.weight  = weight;
    }
    public Car(String model , Engine engine, String colour){
        this(model,engine);
        this.colour  = colour;
    }
    public Car(String model , Engine engine, int weight,String colour){
        this(model,engine,weight);
        this.colour  = colour;
    }

//    FordFocus:
//    V4-33:
//    Power: 140
//    Displacement: 28
//    Efficiency: B
//    Weight: 1300
//    Color: Silver


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(this.model + ":");
        sb.append(System.lineSeparator())
            .append(this.engine.toString())
                .append(System.lineSeparator())
                .append("Weight: ")
                .append(this.weight == -1 ? "n/a" : String.valueOf(this.weight))
                .append(System.lineSeparator())
                .append("Color: ")
                .append(this.colour);



        return sb.toString();
    }

}
