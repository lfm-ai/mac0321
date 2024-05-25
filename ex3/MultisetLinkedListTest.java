package ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultisetLinkedListTest {

    @Test
    public void testAdd() {
        MultisetLinkedList<Integer> multiset = new MultisetLinkedList<>();
        multiset.add(1);
        multiset.add(2);
        assertEquals("[1, 2]", multiset.toString());
    }

    @Test
    public void testEquals() {
        MultisetLinkedList<Integer> multiset1 = new MultisetLinkedList<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetLinkedList<Integer> multiset2 = new MultisetLinkedList<>();
        multiset2.add(1);
        multiset2.add(2);

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        MultisetLinkedList<Integer> multiset1 = new MultisetLinkedList<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetLinkedList<Integer> multiset2 = new MultisetLinkedList<>();
        multiset2.add(3);
        multiset2.add(4);

        multiset1.addAll(multiset2);
        assertEquals("[1, 2, 3, 4]", multiset1.toString());
    }
}
