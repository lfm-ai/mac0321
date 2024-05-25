package ex3;

import java.util.ArrayList;

public class MultisetArrayList<T> {
    private ArrayList<T> elements;

    public MultisetArrayList() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultisetArrayList<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MultisetArrayList<T> m) {
        elements.addAll(m.elements);
    }

    public ArrayList<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
