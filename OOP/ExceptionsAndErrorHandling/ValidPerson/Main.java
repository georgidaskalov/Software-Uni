package OOP.ExceptionsAndErrorHandling.ValidPerson;

public class Main {
    public static void main(String[] args) {

        try {
            Person p = new Person("", "4avdarvo" , 13);
        }catch (PersonCreationException ex){
            System.out.println(ex.getMessage());
        }
    }
}
