package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ex3.MultisetArrayList;
import ex3.MultisetSet;
import ex3.MultisetLinkedList;
import ex3.MultisetStack;

public class MultisetSetAdapter<T> implements Iterable<T> {
    private Set<T> set;

    public MultisetSetAdapter(MultisetArrayList<T> multiset) {
        set = new HashSet<>(multiset.getElements());
    }

    public MultisetSetAdapter(MultisetSet<T> multiset) {
        set = new HashSet<>(multiset.getElements());
    }

    public MultisetSetAdapter(MultisetLinkedList<T> multiset) {
        set = new HashSet<>(multiset.getElements());
    }

    public MultisetSetAdapter(MultisetStack<T> multiset) {
        set = new HashSet<>(multiset.getElements());
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    // Para testes
    public static void main(String[] args) {
        MultisetArrayList<Integer> multisetArrayList = new MultisetArrayList<>();
        multisetArrayList.add(1);
        multisetArrayList.add(2);
        multisetArrayList.add(2);
        multisetArrayList.add(3);

        MultisetSetAdapter<Integer> adapter = new MultisetSetAdapter<>(multisetArrayList);
        System.out.println(adapter);  // Output: [1, 2, 3]
    }
}
