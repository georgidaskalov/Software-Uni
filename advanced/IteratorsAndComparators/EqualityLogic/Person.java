package IteratorsAndComparators.EqualityLogic;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode(){
        return (this.name.hashCode() + Integer.hashCode(age))* 73;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other){
            return true;
        }
        if (other.getClass().getSimpleName().equals(Person.class.getSimpleName())){
            Person second = (Person) other;
            return this.name.equals(second.name) && this.age == second.age;

        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.name);
        if (result == 0){
            result = this.age - o.age;
        }
        return result;

    }
}
