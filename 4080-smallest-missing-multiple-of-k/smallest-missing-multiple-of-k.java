class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> ap=new HashSet<>();

        for(int i=0; i<nums.length; i++){
            ap.add(nums[i]);
        }
        for(int i=1; i<Integer.MAX_VALUE; i++){
            int m = k*i;

            if(!ap.contains(m)){
                return m;
            }
        }
        return -1;
    }
}