package com.company;

class Solution {
    public boolean isPerfectSquare(int num) {
        boolean res = false;
        long i = 1;
        long j = num/2;
        long mid;
        while (i <= j){
            mid = (i+j)/2;
            if (mid * mid == num) return true;
            if (mid * mid > num) j = mid - 1;
            else i = mid + 1;
        }
        return i*i == num;

    }
}