class Solution {
    public int maxProduct(int[] nums) {
        int min_prod=nums[0];
        int max_prod=nums[0];
        int ans=nums[0];

        for(int i=1; i<nums.length; i++){
            int p1=nums[i];
            int p2=nums[i]*min_prod;
            int p3=nums[i]*max_prod;

            min_prod=Math.min(p1, Math.min(p2, p3));
            max_prod=Math.max(p1, Math.max(p2, p3));

            ans=Math.max(ans, Math.max(max_prod, min_prod));
        }
        return ans;
    }
}