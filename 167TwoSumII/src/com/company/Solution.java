package com.company;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int left = 0, right = numbers.length-1;
        int sum = 0;
        while (left < right) {
            sum  = numbers[left] + numbers[right];
            if (sum < target) left++;
            else if (sum > target) right--;
            else return new int[]{left+1, right+1};
        }
        return null;
    }
}