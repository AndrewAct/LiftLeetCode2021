class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n+1];
        for (int x = 1; x <=n; ++x){
            int min_val = x;
            int y = 1;
            int sq = 1;
            do {
                min_val = Math.min(min_val, 1 + arr[x-sq]);
                y++;
                sq = y*y;
            } while (sq <= x);
            arr[x] = min_val;
        }
        return arr[n];
    }
}