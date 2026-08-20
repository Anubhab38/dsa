class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int final_ans=nums[0];

        for(int i=1; i<nums.length; i++){
            ans=ans+nums[i];

            ans=Math.max(ans, nums[i]);

            final_ans=Math.max(ans, final_ans);
        }
        return final_ans;
    }
}