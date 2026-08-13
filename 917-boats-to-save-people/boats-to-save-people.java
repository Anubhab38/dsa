class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;

        int i=0;
        int j=people.length-1;

        while(i<=j){
            if(people[i]+people[j]<=limit){
                boats=boats+1;
                i++;
                j--;
            }
            else{
                boats=boats+1;
                j--;
            }
        }
        return boats;
    }
}