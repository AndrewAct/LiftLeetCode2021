package com.company;

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int result = 0;
        if (len == 0){
            result = 0;
        }
        if (len == 1) result = nums[0];
        if (len != 0 && len != 1){
            int v1 = nums[0], v2 = Math.max(v1, nums[1]);
            for (int i = 2; i < len; i++){
                int temp = v2;
                v2 = Math.max(v2, v1 + nums[i]);
                v1 = temp;
            }
            result = v2;
        }
        return result;
    }
}