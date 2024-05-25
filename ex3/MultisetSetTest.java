package ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultisetSetTest {

    @Test
    public void testAdd() {
        MultisetSet<Integer> multiset = new MultisetSet<>();
        multiset.add(1);
        multiset.add(2);
        assertEquals("[1, 2]", multiset.toString());  // Note that Set does not preserve order
    }

    @Test
    public void testEquals() {
        MultisetSet<Integer> multiset1 = new MultisetSet<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetSet<Integer> multiset2 = new MultisetSet<>();
        multiset2.add(1);
        multiset2.add(2);

        assertTrue(multiset1.equals(multiset2));
    }

    @Test
    public void testAddAll() {
        MultisetSet<Integer> multiset1 = new MultisetSet<>();
        multiset1.add(1);
        multiset1.add(2);

        MultisetSet<Integer> multiset2 = new MultisetSet<>();
        multiset2.add(3);
        multiset2.add(4);

        multiset1.addAll(multiset2);
        assertEquals("[1, 2, 3, 4]", multiset1.toString());  // Order may vary
    }
}
