package com.company;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length-1, idx = nums.length- k;
        while (left < right) {
            int pivot = select(nums, left, right);
            if (pivot < idx) left = pivot + 1;
            else if (pivot > idx) right = pivot - 1;
            else return nums[pivot];
        }
        return nums[left];
    }

    public int select(int[] nums, int left, int right){
        int pivot = left;
        int temp;
        while (left < right) {
            while (left <= right && nums[left] <= nums[pivot]) left++;
            while (left <= right && nums[right] > nums[pivot]) right--;
            if (left >= right) break;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        temp = nums[right];
        nums[right] = nums[pivot];
        nums[pivot] = temp;
        return right;
    }
}