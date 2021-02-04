package com.company;

class Solution {
    public int lengthOfLIS(int[] nums){
        if (nums.length == 0){
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxNum = 1;
        for (int i = 1; i < dp.length; i++){
            int maxVal = 0;
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    maxVal = Math.max(maxVal, dp[j]);
                }
            }
            dp[i] = maxVal + 1;
            maxNum = Math.max(maxNum, dp[i]);
        }
        return maxNum;
    }
}