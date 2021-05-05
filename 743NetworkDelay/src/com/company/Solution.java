package com.company;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int maxVal = 100*100;
        int[] distance = new int[n+1];
        for (int i = 1; i < distance.length; i++){
            distance[i] = maxVal;
        }
        distance[k] = 0;
        for (int j = 1; j <n; j++){
            for (int p = 0; p < times.length; p++) {
                int u = times[p][0], v = times[p][1], w = times[p][2];
                if (distance[v] > distance[u]+ w) {
                    distance[v] = distance[u]+ w;
                }
            }
        }

        int res = 0;
        for (int i = 1; i < distance.length; i++) {
            res = Math.max(res, distance[i]);
        }
        if (res == maxVal) return -1;
        else return res;

    }
}
