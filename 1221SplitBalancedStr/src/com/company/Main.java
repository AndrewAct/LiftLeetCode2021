package com.company;

class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') num += 1;
            else num -= 1;
            if (num == 0) res++;
        }
        return res;
    }
}