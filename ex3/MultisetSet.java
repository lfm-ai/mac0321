package ex3;

import java.util.HashSet;

public class MultisetSet<T> {
    private HashSet<T> elements;  // Mantém privado

    public MultisetSet() {
        elements = new HashSet<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultisetSet<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MultisetSet<T> m) {
        elements.addAll(m.elements);
    }

    public HashSet<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
