package OOP.InheritenceExercise.Animals;

public class Kitten extends Cat {
    private static final Gender GENDER = Gender.FEMALE;
    public Kitten(String name, int age ) {
        super(name, age, GENDER.toString());
    }

    @Override
    public String produceSound(){
        return "Meow";
    }
}
