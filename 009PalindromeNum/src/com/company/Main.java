package com.company;

class Solution {
    public boolean isPalindrome(int x) {
        // int rev = 0, y = x;
        // while (y > 0) {
        //     rev = rev * 10 + y % 10;
        //     y /= 10;
        // }
        // return rev == x;
        String st = Integer.toString(x);
        boolean flag = true;
        int n = st.length();
        for (int i = 0; i<n; i++){
            if (st.charAt(i)!= st.charAt(n-i-1)) {
                flag = false;
                break;
            } else flag = true;
        }
        return flag;

    }
}