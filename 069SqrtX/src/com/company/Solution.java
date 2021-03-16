package com.company;

class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int left = 1;
        int right = x/2;
        while (left < right){
            int mid = (left + (right - left)/2) + 1;
            int res = x/mid;
            if (res == mid) return res;
            if (res > mid) left = mid;
            if (res < mid) right = mid - 1;
        }
        return left;
    }
}