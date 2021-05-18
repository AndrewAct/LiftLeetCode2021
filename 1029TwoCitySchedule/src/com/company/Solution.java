package com.company;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
        int[] refund = new int[n*2];
        int minCost = 0, index = 0;
        for (int[] cost: costs){
            refund[index] = cost[1] - cost[0];
            index++;
            minCost += cost[0];
        }
        Arrays.sort(refund);
        for (int i = 0; i < n; i++){
            minCost += refund[i];
        }
        return minCost;
    }
}