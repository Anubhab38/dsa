class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=nums[0];
        int min=nums[0];
        int max_sum=nums[0];
        int min_sum=0;
        int fsum=Math.abs(nums[0]);

        for(int i=1; i<nums.length; i++){
            int tsum=nums[i];

            sum=Math.max(sum+nums[i], tsum);
            min=Math.min(min+nums[i], tsum);
            
            min_sum=Math.min(min_sum, min);
            max_sum=Math.max(max_sum, sum);

            fsum=Math.max(fsum, Math.max(Math.abs(min_sum), Math.abs(max_sum)));
        }
        return fsum;
    }
}