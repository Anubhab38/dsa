class Solution {
    public int digitsum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
    public int digitprod(int n){
        int prod=1;
        while(n>0){
            int digit=n%10;
            prod=prod*digit;
            n=n/10;
        }
        return prod;
    }
    public boolean checkDivisibility(int n) {
        int x=digitsum(n);
        int y=digitprod(n);

        if(n%(x+y)==0){    
            return true;
        }
        return false;
    }
}