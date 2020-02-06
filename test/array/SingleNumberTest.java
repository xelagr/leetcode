package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    @Test
    public void test1() {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{2,2,1}));
    }

    @Test
    public void test2() {
        assertEquals(4, new SingleNumber().singleNumber(new int[]{4,1,2,1,2}));
    }
}
