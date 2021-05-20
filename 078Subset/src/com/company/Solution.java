package com.company;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] nums, int idx, List<Integer> path, List<List<Integer>> res){
        res.add(path);
        for (int i = idx; i < nums.length; i++){
            List<Integer> newList = new ArrayList<>(path);
            newList.add(nums[i]);
            dfs(nums, i+1, newList, res);
        }
    }
}