package ex4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

import ex3.MultisetArrayList;
import ex3.MultisetSet;
import ex3.MultisetLinkedList;
import ex3.MultisetStack;

public class MultisetSetAdapterTest {

    @Test
    public void testArrayListAdapter() {
        MultisetArrayList<Integer> multiset = new MultisetArrayList<>();
        multiset.add(1);
        multiset.add(2);
        multiset.add(2);
        multiset.add(3);

        MultisetSetAdapter<Integer> adapter = new MultisetSetAdapter<>(multiset);
        Set<Integer> actualSet = new HashSet<>();
        for (Integer i : adapter) {
            actualSet.add(i);
        }

        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, actualSet);
    }

    @Test
    public void testSetAdapter() {
        MultisetSet<Integer> multiset = new MultisetSet<>();
        multiset.add(1);
        multiset.add(2);
        multiset.add(2);
        multiset.add(3);

        MultisetSetAdapter<Integer> adapter = new MultisetSetAdapter<>(multiset);
        Set<Integer> actualSet = new HashSet<>();
        for (Integer i : adapter) {
            actualSet.add(i);
        }

        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, actualSet);
    }

    @Test
    public void testLinkedListAdapter() {
        MultisetLinkedList<Integer> multiset = new MultisetLinkedList<>();
        multiset.add(1);
        multiset.add(2);
        multiset.add(2);
        multiset.add(3);

        MultisetSetAdapter<Integer> adapter = new MultisetSetAdapter<>(multiset);
        Set<Integer> actualSet = new HashSet<>();
        for (Integer i : adapter) {
            actualSet.add(i);
        }

        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, actualSet);
    }

    @Test
    public void testStackAdapter() {
        MultisetStack<Integer> multiset = new MultisetStack<>();
        multiset.add(1);
        multiset.add(2);
        multiset.add(2);
        multiset.add(3);

        MultisetSetAdapter<Integer> adapter = new MultisetSetAdapter<>(multiset);
        Set<Integer> actualSet = new HashSet<>();
        for (Integer i : adapter) {
            actualSet.add(i);
        }

        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, actualSet);
    }
}
