package com.company;

class Solution {
    public int lastStoneWeightII(int[] stones) {
        int S = 0;
        for (int i: stones) S+= i;
        int S2 = 0;
        int len = stones.length;

        boolean[][] dp = new boolean[S/2+1][len+1];

        for (int i = 0; i <= len; i++) dp[0][i] = true;

        for (int i = 1; i<= len; i++) {
            for (int j = 1; j <= S/2; j++) {
                if(dp[j][i-1] || (j>=stones[i-1] &&dp[j-stones[i-1]][i-1])){
                    dp[j][i] = true;
                    S2 = Math.max(j, S2);
                }
            }
        }
        return S - 2*S2;
    }
}