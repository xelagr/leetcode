package dynamic;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0, profit = 0;
        for (int price : prices) {
            if (price < buy) {
                buy = sell = price;
            }
            if (price > sell) {
                sell = price;
            }
            if (sell - buy > profit) {
                profit = sell - buy;
            }
        }
        return profit;
    }
}
