package com.company;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        Arrays.sort(strs);
        String first = strs[0];
        //int len = first.length();
        int n = strs.length - 1;
        String last = strs[n];
        int c = 0;
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) c++;
            else break;
        }
        return c == 0 ? "": first.substring(0,c);
    }
}