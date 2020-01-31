public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        boolean bought = false;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                bought = true;
            } else if (i < prices.length - 1 && prices[i + 1] < prices[i]) {
                profit += prices[i] - min;
                min = Integer.MAX_VALUE;
                bought = false;
            }
        }
        if (bought) {
            profit += prices[prices.length - 1] - min;
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }

}
