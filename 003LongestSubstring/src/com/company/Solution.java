package com.company;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        Set<Character> st = new HashSet<>();
        int res = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!st.contains(s.charAt(right))){
                st.add(s.charAt(right));
                right++;
                res = Math.max(st.size(), res);
            }
            else {
                st.remove(s.charAt(left));
                left++;
            }
        }
        return Math.max(st.size(), res);

    }
}