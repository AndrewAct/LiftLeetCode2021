package com.company;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] dp = new int[n];
        int[] index = new int[len];
        int[] val = new int[len];
        Arrays.fill(val, 1);

        int min = 1;
        for (int i = 0; i < n; i++){
            dp[i] = min;
            min = Integer.MAX_VALUE;

            for (int j = 0; j < len; j++){
                if (val[j] == dp[i]) val[j] = dp[index[j]++] * primes[j];
                min = Math.min(min, val[j]);
            }
        }

        return dp[n-1];
    }
}