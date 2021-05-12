package com.company;

class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for (int num: A) heap.add(num);
        while (K-- > 0) heap.add(-heap.poll()); // Add the smallest num after sorting
        int sum = 0;
        while (!heap.isEmpty()){
            sum += heap.poll();
        }

        return sum;
    }
}