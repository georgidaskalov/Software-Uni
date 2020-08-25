package Generixexercise.GenericCountDouble;

public class Box<T extends Comparable> implements Comparable<Box<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value
                .getClass()
                .getName()
                + ": " + value;
    }
    @Override
    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.value);
    }
    public T getValue(){
        return this.value;
    }

}
