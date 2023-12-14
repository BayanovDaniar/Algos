package Leetcode.SlidingWindow.BestTimetoBuyandSellStock121;

public class Solution {

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int left = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] - prices[left] > profit){
                profit = prices[i] - prices[left];
            }else if(prices[i] - prices[left] < 0){
                left = i;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
