class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> temp=new HashMap<>();
        List<Integer> ap=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            temp.put(nums[i], temp.getOrDefault(nums[i], 0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(temp.get(nums[i])>nums.length/3 && !(ap.contains(nums[i]))){
                ap.add(nums[i]);
            }
        }
        return ap;
    }
}