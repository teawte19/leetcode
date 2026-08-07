class Solution {
    public int rob(int[] nums) {
        int beforePrev =0;
        int prev =0;
        for(int money:nums){
            int rob= beforePrev + money;
            int skip = prev;
            int current = Math.max(rob, skip);
            beforePrev = prev;
            prev = current;
        }
        return prev;
    }
}