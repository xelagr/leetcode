package sortsearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    @Test
    public void test1() {
        assertEquals(4, new FirstBadVersion(4).firstBadVersion(5));
    }

    @Test
    public void test2() {
        assertEquals(2, new FirstBadVersion(2).firstBadVersion(2));
    }

    @Test
    public void test3() {
        assertEquals(1, new FirstBadVersion(1).firstBadVersion(2));
    }

    @Test
    public void test4() {
        assertEquals(1, new FirstBadVersion(1).firstBadVersion(1));
    }

    @Test
    public void test5() {
        assertEquals(2, new FirstBadVersion(2).firstBadVersion(3));
    }

}
