class Solution {
    public double myPow(double x, int n) {
        return bin_exp(x, (long) n);
    }
    public double bin_exp(double x, long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1.0/bin_exp(x, -n);
        }
        else{
            if(n%2==0){
                return bin_exp(x*x, n/2);
            }
            else{
                return x*bin_exp(x*x, (n-1)/2);
            }
        }
    }
}