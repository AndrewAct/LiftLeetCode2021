package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> newStr = new ArrayList<String>();
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == '+' && s.charAt(i-1) == '+'){
                newStr.add(s.substring(0, i-1)+ "--" + s.substring(i+1, s.length()));
            }
        }
        return newStr;
    }
}