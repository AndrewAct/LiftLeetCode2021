class NumArray {
    private int[] arr;

    public NumArray(int[] nums) {
        // if (nums == null || nums.length == 0){
        //     arr = new int[0];
        // }
        arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            arr[i+1] = arr[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        //if (j - i >= arr.length) return 0;
        //if (i==0) return arr[j];
        return arr[j+1] - arr[i];

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */