package IteratorsAndComparators.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode() + Integer.hashCode(age)) * 73;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other.getClass().getSimpleName().equals(Person.class.getSimpleName())) {
            Person second = (Person) other;
            return this.name.equals(second.name) && this.age == second.age;

        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.town;
    }

    @Override
    public int compareTo(Person o) {

        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.age - o.age;
        }
        if (result == 0){
            result = this.town.compareTo(o.town);
        }
        return result;

    }
}
