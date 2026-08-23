class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> ap=new HashMap<>();
        int sum=0;
        int max_val=0;
        for(int i=0; i<nums.length; i++){
            ap.put(nums[i], ap.getOrDefault(nums[i],0)+1);
        }

        for(int value:ap.values()){
            max_val=Math.max(value, max_val);
        }

        for(int values:ap.values()){
            if(values==max_val){
                sum=sum+values;
            }
        }

        return sum;
    }
}