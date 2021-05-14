package com.company;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0;
        int j = 0;
        int len = s.length;
        for (int num: g){
            while (j < len && s[j] < num) {
                j++;
            }
            if (j < len){
                j++;
                res++;
            }
        }
        return res;
    }
}