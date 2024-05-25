package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultisetStackTest {

    @Test
    public void testAdd() {
        MultisetStack<Integer> multiset = new MultisetStack<>();
        multiset.add(1);
        multiset.add(2);
        assertEquals("[1, 2]", multiset.toString());
    }

    @Test
    public void testEquals() {
        MultisetStack<Integer> multiset1 = new MultisetStack<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetStack<Integer> multiset2 = new MultisetStack<>();
        multiset2.add(1);
        multiset2.add(2);

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        MultisetStack<Integer> multiset1 = new MultisetStack<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetStack<Integer> multiset2 = new MultisetStack<>();
        multiset2.add(3);
        multiset2.add(4);

        multiset1.addAll(multiset2);
        assertEquals("[1, 2, 3, 4]", multiset1.toString());
    }
}
