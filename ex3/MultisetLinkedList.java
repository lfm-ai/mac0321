package ex3;

import java.util.LinkedList;

public class MultisetLinkedList<T> {
    private LinkedList<T> elements;

    public MultisetLinkedList() {
        elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultisetLinkedList<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MultisetLinkedList<T> m) {
        elements.addAll(m.elements);
    }

    public LinkedList<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
