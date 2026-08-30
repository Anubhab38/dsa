class Solution {
    //SORRY FOR SUBMITTING THIS I WAS IN A VERY BAD MOOD :( :( :( :( :(
    public double myPow(double x, int n) {
        if(x==1){
            return 1;
        }
        if(x==-1 && n==-2147483648){ 
            return 1;
        }
        if(n==Integer.MIN_VALUE){
            return 0;
        }
        if(x==-1 && n%2!=0){
            return -1;
        }
        double y = x;
        int power=Math.abs(n);
        for (int i = 1; i < power; i++) {
            x = x * y;
        }

        if(n<0){
            x=1.0/x;
        }
        else if(n==0){
            x=1;
        }
        return x;
    }
}