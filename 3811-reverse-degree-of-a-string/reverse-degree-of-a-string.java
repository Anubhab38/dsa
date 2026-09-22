class Solution {
    public int reverseDegree(String s) {
        int x=s.length();
        int ap=0;

        for(int i=0; i<x; i++){
            char z=s.charAt(i);

            int val=26-(z-'a');
            int pos=i+1;

            ap=ap+(val*pos);
        }
        return ap;
    }
}