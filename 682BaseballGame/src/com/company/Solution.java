package com.company;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        int total = 0;
        int temp;

        for (int i =0; i< ops.length; i++){
            if (ops[i].equals("C")) total -= s.pop();
            else if (ops[i].equals("D")) {
                temp = 2*s.peek();
                s.push(temp);
                total += temp;
            }
            else if (ops[i].equals("+")){
                temp = s.pop();
                int sum = temp + s.peek();
                s.push(temp);
                s.push(sum);
                total += sum;
            }
            else {
                temp = Integer.parseInt(ops[i]);
                s.push(temp);
                total += temp;
            }
        }
        return total;
    }
}