package Discret_Math.home_works.Java.solutions;

public class Buy_And_Sell_Stocks {
    public int maxProfit(int[] prices) {
        int lowes_price_so_far = prices[0];
        int highest_profit = 0;
        for (int todays_price : prices){
            highest_profit = Math.max(highest_profit, todays_price - lowes_price_so_far);
            lowes_price_so_far = Math.min(lowes_price_so_far, todays_price);
        }
        return highest_profit;
    }
}
