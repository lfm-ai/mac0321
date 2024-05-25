package ex3;

import java.util.Stack;

public class MultisetStack<T> {
    private Stack<T> elements;

    public MultisetStack() {
        elements = new Stack<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultisetStack<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MultisetStack<T> m) {
        elements.addAll(m.elements);
    }

    public Stack<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
