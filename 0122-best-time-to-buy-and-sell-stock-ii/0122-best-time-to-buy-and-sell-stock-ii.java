class Solution {
    public int maxProfit(int[] prices) {
        
        int curr_val=prices[0];
        int pres_val=0;
        int prev_val=0;
        int max_profit=0;

        for(int i=1;i<prices.length;i++)
        {
            prev_val=prices[i-1];
            pres_val=prices[i];

            if(pres_val<prev_val)
            {
                max_profit+=prev_val-curr_val;
                curr_val=pres_val;
            }
            else if(pres_val>=prev_val)
            {
                if(i==prices.length-1)
                {
                    max_profit+=pres_val-curr_val;
                }
            }
        }

        return max_profit;
    }
}