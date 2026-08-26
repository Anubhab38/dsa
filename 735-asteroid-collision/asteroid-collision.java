class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ap=new Stack<>();
        int n=asteroids.length;

        for(int i=0; i<n; i++){
            int x=asteroids[i];

            while(!ap.isEmpty() && x<0 && ap.peek()>0){
                if(Math.abs(x) > Math.abs(ap.peek())){
                    ap.pop();
                }
                else if(Math.abs(x)==Math.abs(ap.peek())){
                    ap.pop();
                    x=0;
                    break;
                }
                else{
                    x=0;
                    break;
                }
            }
            if(x!=0){
                ap.push(x);
            }

        }
        int[] ans = new int[ap.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = ap.get(i);
        }
        return ans;
    }
}