package com.company;

class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, sum);
        return sum;
    }

    public void dfs(int[] nums, int start, int initial){
        if (start >= nums.length) return;
        for (int i = start; i < nums.length; i++){
            int curSum = initial^nums[i]; // bitwise XOR operator
            sum += curSum;
            dfs(nums, i+1, curSum);
        }
    }
}