class Solution {
    public boolean divisorGame(int N) {
        boolean[] test = new boolean[N+1];
        if (N <= 1){
            return false;
        }
        for (int i = 1; i <= N; i++){
            for (int x = 1; x < i; x++){
                if (i%x == 0 & !test[i-x]){
                    test[i] = true;
                    break;
                }
            }
        }

        return test[N];
    }
}