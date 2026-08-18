class Solution {
    public int search(int[] nums, int target) {
        // HashSet<Integer> ap=new HashSet<>();
        HashMap<Integer, Integer> ap=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            ap.put(nums[i], i);
        }
        if(ap.containsKey(target)){
            return ap.get(target);
        }
        return -1;
    }
}