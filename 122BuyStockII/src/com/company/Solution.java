package com.company;

class Solution {
    public int maxProfit(int[] prices) {
        int t0 = 0;
        int t1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++){
            int temp = t0;
            int sell = t1 + prices[i];
            t0 = Math.max(t0, sell);

            int buy = temp - prices[i];
            t1 = Math.max(t1, buy);
        }
        return t0;
    }
}