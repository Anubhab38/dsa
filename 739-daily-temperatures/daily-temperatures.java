class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ap[]=new int[n];

        Stack<Integer> temp=new Stack<>();

        for(int i=0; i<n; i++){
            while(!temp.isEmpty() && temperatures[temp.peek()]<temperatures[i]){
                ap[temp.peek()]=i-temp.pop();
            }
            temp.push(i);
        }
        return ap;
        
    }
}