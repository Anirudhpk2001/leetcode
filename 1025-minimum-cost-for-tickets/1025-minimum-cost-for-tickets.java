class Solution {
    int dp[];
    private int solve(int[] days, int[] costs, int index)
    {
        if(index>=days.length)
        {
            return 0;
        }

        if(dp[index]!=-1)
        {
            return dp[index];
        }

        int one_day=costs[0]+solve(days,costs,index+1);

        int i=index;

        while(i<days.length && days[i]<days[index]+7)
        {
            i++;
        }
        int one_week=costs[1]+solve(days,costs,i);

         i=index;
        while(i<days.length && days[i]<days[index]+30)
        {
            i++;
        }
        int one_month=costs[2]+solve(days,costs,i);
       
        return dp[index]=Math.min(one_day,Math.min(one_week,one_month));
        
        

    }
    public int mincostTickets(int[] days, int[] costs) {
        dp=new int[days.length];
        Arrays.fill(dp,-1);
        return solve(days, costs,0);
    }
}