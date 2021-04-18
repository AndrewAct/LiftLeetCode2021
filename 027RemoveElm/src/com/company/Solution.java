package com.company;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        int len = nums.length;
        for (int i =0; i< len; i++){
            if (nums[i] != val){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}