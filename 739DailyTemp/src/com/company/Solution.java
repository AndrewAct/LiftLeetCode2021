package com.company;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] dp = new int[n];
        for (int i = n-1; i>= 0; i--){
            for (int j = i+1; j < dp.length; j++){
                if (T[j] > T[i]){
                    dp[i] = j-i;
                    break;
                }
            }
        }
        return dp;

    }
}