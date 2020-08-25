package Generixexercise.customList;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayList<E extends Comparable<E>> {
    private static final int INITIAL_CAPACITY = 4;
    private Object[] elements;
    private int size;

    public ArrayList() {
        this.elements = new Object[INITIAL_CAPACITY];
    }

    public void add(E element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }
        this.elements[this.size++] = element;
    }

    public E get(int index) {
        ensureIndex(index);
        return this.getAt(index);
    }


    private void ensureIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds for " + index
                    + " Arraylist size of: " + this.size);
        }
    }

    public boolean contains(Object element) {
        return this.indexOf(element) >= 0;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.size; i++) {
            E at = this.getAt(i);

            if (at.equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public void swap(int firstInt, int second) {
        ensureIndex(firstInt);
        ensureIndex(second);
        Object temp = this.elements[firstInt];
        this.elements[firstInt] = this.elements[second];
        this.elements[second] = temp;
    }

    public int countGreaterThen(E element) {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.get(i).compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    @SuppressWarnings("unchecked")
    public E getMax() {
        return Arrays.stream(this.elements)
                .limit(this.size)
                .map(e -> (E) e)
                .max(Comparator.comparing(e -> e))
                .orElse(null);
    }

    @SuppressWarnings("unchecked")
    public E getMin() {
        return Arrays.stream(this.elements)
                .limit(this.size)
                .map(e -> (E) e)
                .min(Comparator.comparing(e -> e))
                .orElse(null);
    }

    public E remove(int index) {
        if (this.size == 0) {
            return null;
        } else {


            E at = this.getAt(index);
            this.elements[index] = null;
            shift(index);
            this.size--;

            if (this.size == this.elements.length / 2) {
                this.elements = shrink();
            }

            return at;
        }
    }

    private Object[] shrink() {
            return Arrays.copyOf(this.elements, this.elements.length /2);
    }

    private void shift(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.size - 1] = null;
    }

    @SuppressWarnings("unchecked")
    private E getAt(int index) {
        return (E) this.elements[index];
    }

    private Object[] grow() {
        return Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.elements[i].toString());

        }

    }

}
