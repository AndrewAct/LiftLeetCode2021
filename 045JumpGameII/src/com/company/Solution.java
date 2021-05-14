package com.company;

class Solution {
    public int jump(int[] nums) {
        int steps = 0;
        int close = 0;
        int far = 0;
        for (int i = 0; i < nums.length; i++){
            if (i > close) {
                steps++;
                close = far;
            }
            far = Math.max(nums[i]+i, far);
        }
        return steps;
    }
}