package OOP.InheritenceExercise.Animals;

public class Dog extends Animal {
    private static String sound = "Woof!";

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound(){
        return "Woof!";
    }
}
