package com.example.interviewpreparation;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * @author kojusujan1111@gmail.com 09/11/21
 */

public class BestTImeTOBuyStock {
    public int smallestPriceDayIndex;
    public int smallestPrice;
    public int largestPriceDayIndex;

    public int maxProfit(int[] prices) {
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[this.smallestPriceDayIndex]) smallestPriceDayIndex = i;
        }
        smallestPrice = prices[smallestPriceDayIndex];
        if (smallestPriceDayIndex == prices.length - 1) return 0;
        for (int i = smallestPriceDayIndex + 1; i < prices.length; i++) {
            if (prices[i] > smallestPrice) {
                largestPriceDayIndex = i;
                smallestPrice = prices[i];
            }
        }
        return prices[largestPriceDayIndex] - prices[smallestPriceDayIndex];
    }

    public int maxProfitUsingSlidingWindow(int[] prices) {
        int left = 0, right = 1, max = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int diff = prices[right] - prices[left];
                max = Math.max(Math.abs(diff), max);
            } else {
                left = right;
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        BestTImeTOBuyStock bestTImeTOBuyStock = new BestTImeTOBuyStock();
        int[] num = {3, 2, 1, 4, 5, 6, 2};
        System.out.println(bestTImeTOBuyStock.maxProfitUsingSlidingWindow(num));
    }
}
