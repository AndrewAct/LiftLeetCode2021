package com.company;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) return nums;
        int[] arr = new int[len -k + 1];
        int index = 0;
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++){
            while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                dq.removeLast();
            }
            dq.offerLast(nums[i]);
        }
        arr[index++] = dq.peekFirst();

        for (int i = k; i < len; i++){
            if (nums[i-k] == dq.peekFirst()){
                dq.removeFirst();
            }
            while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                dq.removeLast();
            }
            dq.offerLast(nums[i]);
            arr[index++] = dq.peekFirst();
        }
        return arr;
    }
}