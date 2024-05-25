package ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultisetArrayListTest {

    @Test
    public void testAdd() {
        MultisetArrayList<Integer> multiset = new MultisetArrayList<>();
        multiset.add(1);
        multiset.add(2);
        assertEquals("[1, 2]", multiset.toString());
    }

    @Test
    public void testEquals() {
        MultisetArrayList<Integer> multiset1 = new MultisetArrayList<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetArrayList<Integer> multiset2 = new MultisetArrayList<>();
        multiset2.add(1);
        multiset2.add(2);

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        MultisetArrayList<Integer> multiset1 = new MultisetArrayList<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetArrayList<Integer> multiset2 = new MultisetArrayList<>();
        multiset2.add(3);
        multiset2.add(4);

        multiset1.addAll(multiset2);
        assertEquals("[1, 2, 3, 4]", multiset1.toString());
    }
}
