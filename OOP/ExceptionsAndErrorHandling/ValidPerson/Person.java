package OOP.ExceptionsAndErrorHandling.ValidPerson;

public class Person {
    private String firstName;
    private String lastName;
    private int age ;


    public Person(String firstName , String lastName, int age) throws PersonCreationException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }
    private boolean myStringIsNullOrEmpty(String str){
        return str == null || str.trim().isEmpty();
    }

    public void setFirstName(String firstName) throws PersonCreationException {
        validateString(firstName);
        this.firstName = firstName;
    }

    private void validateString(String firstName) throws PersonCreationException {
        if (myStringIsNullOrEmpty(firstName)){
            throw new PersonCreationException("Invalid input" );
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
}
