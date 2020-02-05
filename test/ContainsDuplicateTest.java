import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void test1() {
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void test2() {
        assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void test3() {
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
