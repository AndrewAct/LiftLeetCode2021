package com.company;

class Solution {
    public int arrangeCoins(int n) {
        long count = 0;
        int res = 0;
        for (int i = 1; i <= n; i++){
            count += i;
            if (count == n) {
                res = i;
                break;
            }
            else if (count > n) {
                res = (i-1);
                break;
            }
        }
        return res;
    }
}