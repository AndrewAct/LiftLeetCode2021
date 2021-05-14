package com.company;

class Solution {
    public boolean canJump(int[] nums) {
        int jumpable = 0;
        int len = nums.length;
        for (int i = 0; i < len && i <= jumpable; i++){
            jumpable = Math.max(i+ nums[i], jumpable);
            if (jumpable >= len - 1) return true;
        }
        return false;
    }
}