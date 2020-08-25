package IteratorsAndComparators.EqualityLogic;


import java.util.Comparator;

public class ComparatorPersons implements Comparator<Person> {
    @Override
    public int compare(Person f, Person s) {
        return f.getAge() - s.getAge();
    }
}
