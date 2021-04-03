package com.company;

class Solution {
    public int getKthMagicNumber(int k) {
        int [] result = new int[k];
        result[0] = 1;
        int num3 = 0;
        int num5 = 0;
        int num7 = 0;
        for (int i = 1; i < k; i++) {
            int resultN = Math.min(Math.min(result[num3] * 3, result[num5] * 5), result[num7] * 7);
            if (resultN % 3 == 0) {
                num3++;
            }
            if (resultN % 5 == 0) {
                num5++;
            }
            if (resultN % 7 == 0) {
                num7++;
            }
            result[i] = resultN;
        }
        return result[k - 1];
    }
}