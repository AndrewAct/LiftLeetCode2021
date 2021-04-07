package com.company;

class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n==1) C.add(A.remove(A.size()-1));
        else {
            B.add(A.remove(A.size()-1));
            move(n-1, A, B, C );
            C.add(B.remove(B.size() - 1));
        }
    }
}