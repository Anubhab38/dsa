class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ap[]= new int[spells.length];

        for(int i=0; i<spells.length; i++){
            int left=0;
            int right=potions.length-1;

            while(left<=right){
                int mid=left+(right-left)/2;
                long req=(long) spells[i]*potions[mid];
                if(req>=success){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            ap[i]=potions.length-left;
            
        }
        return ap;

    }
}