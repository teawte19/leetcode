class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int win = 0;
        for (int i=  0; i < k; i++){
            win += nums[i];
        }
        int maxSum = win;
        for (int i = k; i<nums.length; i++){
            win = win - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, win); 
        }
        return (double) maxSum/k;
    }
}
