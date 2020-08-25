package Generixexercise.GenericSwapMethodIntegers;

public class GenericSwapInteger<T> {
    private T value;

    public GenericSwapInteger(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value
                .getClass()
                .getName()
                + ": " + value;

    }
}
