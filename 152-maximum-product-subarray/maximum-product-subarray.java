class Solution {
    public int maxProduct(int[] nums) {
        int l=1;
        int r=1;
        int maxProduct = nums[0];
        for (int i=0; i<nums.length; i++){
            if(l==0) l=1;
            if(r==0) r=1;
            l *= nums[i];
            r *= nums[nums.length-1 - i];
            maxProduct = Math.max(maxProduct, Math.max(l,r));
        }
        return maxProduct;
    }
}