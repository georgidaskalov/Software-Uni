package OOP.InheritenceExercise.Animals;

public class Tomcat extends Cat {
    private static final Gender GENDER = Gender.MALE;
    public Tomcat(String name, int age ) {
        super(name, age, GENDER.toString());
    }
    @Override
    public String produceSound(){
        return "MEOW";
    }
}
