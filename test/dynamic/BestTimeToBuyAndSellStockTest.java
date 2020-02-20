package dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void test1() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, profit);
    }

    @Test
    public void test2() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit(new int[]{1,2,3,4,5});
        assertEquals(4, profit);
    }

    @Test
    public void test3() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0, profit);
    }

    @Test
    public void test4() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 2, 5, 1, 6, 4});
        assertEquals(5, profit);
    }

    @Test
    public void test5() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit(new int[]{1});
        assertEquals(0, profit);
    }

    @Test
    public void test6() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit(new int[]{});
        assertEquals(0, profit);
    }

}
