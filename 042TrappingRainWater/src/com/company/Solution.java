package com.company;

class Solution {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int vol = 0;
        while (left < right){
            if (leftMax < rightMax) {
                vol += leftMax - height[left];
                leftMax = Math.max(leftMax, height[++left]);
            }
            else {
                vol += rightMax - height[right];
                rightMax = Math.max(rightMax, height[--right]);
            }
        }
        return vol;
    }
}