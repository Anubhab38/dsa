class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> ap=new HashMap<>();
        int n=nums.length;

        for(int i=0; i<n; i++){
            ap.put(nums[i], ap.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<n; i++){
            if(ap.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}