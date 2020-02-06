package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void test1() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(7, profit);
    }

    @Test
    public void test2() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit2(new int[]{1,2,3,4,5});
        assertEquals(4, profit);
    }

    @Test
    public void test3() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit2(new int[]{7,6,4,3,1});
        assertEquals(0, profit);
    }

    @Test
    public void test4() {
        final int profit = new BestTimeToBuyAndSellStock().maxProfit2(new int[]{1, 7, 2, 3, 6, 7, 6, 7});
        assertEquals(12, profit);
    }


}
