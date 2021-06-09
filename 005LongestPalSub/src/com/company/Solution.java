package com.company;

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 1) return "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); ++i){
            for (int j = i; j >= 0; --j){
                boolean flag = (s.charAt(i) == s.charAt(j));
                if (i== j) dp[i][j] = true;
                else if ((i-j)== 1) dp[i][j] = flag;
                else if (flag && dp[i-1][j+1]) dp[i][j] = true;

                if (dp[i][j] && (i - j) > (right - left)) {
                    right = i;
                    left = j;
                }
            }
        }

        return s.substring(left, right+1);
    }

}