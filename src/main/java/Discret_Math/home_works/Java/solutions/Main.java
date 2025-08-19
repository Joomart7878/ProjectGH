package Discret_Math.home_works.Java.solutions;

public class Main {
    public static void main(String[] args) {
        Buy_And_Sell_Stocks stock = new Buy_And_Sell_Stocks();

        int[] values = {66, 44, 33, 221, 343, 33, 32};

        int result = stock.maxProfit(values);

        System.out.println(result);
    }
}
