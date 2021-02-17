package com.company;

class Solution {
    public int maxProduct(int[] nums) {
        int max_end = nums[0];
        int min_now = nums[0], max_now = nums[0];
        for (int i = 1; i < nums.length; i++){
            int temp = max_now;
            max_now = Math.max(nums[i], Math.max(nums[i]*max_now, nums[i]*min_now));
            min_now = Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*min_now));
            max_end = Math.max(max_end, max_now);


        }
        return max_end;
    }
}