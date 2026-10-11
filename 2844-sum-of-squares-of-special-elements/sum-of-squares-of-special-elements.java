class Solution {
    public int sumOfSquares(int[] nums) {
        int ap=0;
        int n=nums.length;
        
        for(int i=0; i<(n+1); i++){
            if(n%(i+1)==0){
                ap=ap+nums[i]*nums[i];
            }
        }
        return ap;
    }
}