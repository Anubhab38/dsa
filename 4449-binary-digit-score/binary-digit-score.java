class Solution {
    public int decToBin(int n){
        String x=Integer.toBinaryString(n);
        int count=0;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)=='1'){
                count=count+1;
            }
        }
        return count;
    }
    public int calculateScore(int a, int b) {

        int s1=decToBin(a);
        int s2=decToBin(b);
        int ap=1;

        if(s1>=s2){
            ap=s1*s2;
        }
        else{
            ap=s2/s1;
        }
        return ap;
    }
}