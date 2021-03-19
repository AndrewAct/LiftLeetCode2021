package com.company;

class Solution {
    int index = 0;
    public int scoreOfParentheses(String S) {
        int score = 0;
        while(index<S.length()){
            if(S.charAt(index)=='('){
                index++;
                score+=scoreOfParentheses(S);
            }
            else if(S.charAt(index)==')'){
                index++;
                score= score==0 ? 1 : 2*score;
                return score;
            }
        }
        return score;
    }
}