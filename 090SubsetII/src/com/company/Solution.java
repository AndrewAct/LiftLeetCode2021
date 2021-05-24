package com.company;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(res, new ArrayList(), nums, 0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> newList, int[] nums, int start) {
        res.add(new ArrayList(newList));
        for (int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i-1]) continue;  // No duplicate
            newList.add(nums[i]);
            backTrack(res, newList, nums, i+1);
            newList.remove(newList.size()-1);
        }
    }
}