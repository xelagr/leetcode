package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrimesTest {

    @Test
    public void test1() {
        assertEquals(4, new CountPrimes().countPrimes(10));
    }

    @Test
    public void test2() {
        assertEquals(0, new CountPrimes().countPrimes(0));
    }

    @Test
    public void test3() {
        assertEquals(0, new CountPrimes().countPrimes(1));
    }

    @Test
    public void test4() {
        assertEquals(0, new CountPrimes().countPrimes(2));
    }

    @Test
    public void test5() {
        assertEquals(1, new CountPrimes().countPrimes(3));
    }
}
