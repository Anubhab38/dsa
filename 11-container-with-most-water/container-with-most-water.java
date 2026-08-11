class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int area=1;
        int maxArea=0;

        while(i<j){
            int l=(-1)*(i-j);
            int b=Math.min(height[i], height[j]);
            area=l*b;

            maxArea=Math.max(maxArea, area);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}