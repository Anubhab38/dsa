class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int max_profit=0;

        while(j<prices.length){
            if(prices[i]<prices[j]){
                int profit=prices[j]-prices[i];

                max_profit=Math.max(profit, max_profit);
            }
            else{
                i=j;
            }
            j++;
        }

        if(max_profit!=Integer.MAX_VALUE){
            return max_profit;
        }else{
            return 0;
        }
    }
}