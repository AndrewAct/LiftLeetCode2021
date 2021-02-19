package com.company;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxNow = nums[0];
        int maxEnd = nums[0];
        for (int i = 1; i < nums.length; i++){
            maxNow = Math.max(maxNow+ nums[i], nums[i]);
            maxEnd = Math.max(maxNow, maxEnd);

        }
        return maxEnd;

    }
}