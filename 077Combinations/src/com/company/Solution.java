package com.company;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(res, new ArrayList<Integer>(), 1, n, k);
        return res;
    }

    private static void backTrack(List<List<Integer>> res, List<Integer> newList, int start, int n, int k){
        if (k== 0) {
            res.add(new ArrayList<Integer>(newList));
            return;
        }
        for (int i = start; i <= n; i++){
            newList.add(i);
            backTrack(res, newList,i+1, n, k-1);
            newList.remove(newList.size()-1);
        }
    }
}