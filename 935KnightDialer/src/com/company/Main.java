package com.company;

import java.util.Arrays;

class Solution {
    public int knightDialer(int N) {

        int M =1000000007;
        int[][] map=new int[][] {
                {4,6},{6,8},{7,9},{4,8},{3,9,0},
                {},{1,7,0},{2,6},{1,3},{2,4}
        };

        int[][] dp=new int[2][10];
        Arrays.fill(dp[0], 1);
        for(int i=0;i<N-1;i++) {
            int cur = (i+1)%2;
            Arrays.fill(dp[cur], 0);
            for(int j=0;j<10;j++)
                for(int newi : map[j]) {
                    dp[cur][newi]+=dp[i&1][j];
                    dp[cur][newi]%= M;
                }
        }

        long ans=0;
        for(int x : dp[~N&1])
            ans+=x;
        return (int)(ans% M);
    }
}
