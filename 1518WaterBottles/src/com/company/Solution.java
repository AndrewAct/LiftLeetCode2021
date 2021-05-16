package com.company;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emp = numBottles;
        int res = numBottles;
        while (emp/numExchange != 0) {
            res += emp/numExchange;
            emp = (emp/numExchange) + (emp% numExchange);
        }
        return res;
    }
}
