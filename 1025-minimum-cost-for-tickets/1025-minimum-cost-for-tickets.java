class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int last_day=days[days.length-1];
        int dp[]=new int[last_day+1];
        HashSet<Integer> set=new HashSet<>();
        for(int d:days)
        {
            set.add(d);
        }
        dp[0]=0;
        for(int i=1 ; i<last_day+1;i++)
        {
            if(!set.contains(i))
            {
                dp[i]=dp[i-1];
                continue;
            }
            else
            {
                int one_day=costs[0]+dp[Math.max(i-1,0)];
                int one_week=costs[1]+dp[Math.max(i-7,0)];
                int one_month=costs[2]+dp[Math.max(i-30,0)];

                dp[i] = Math.min(one_day,Math.min(one_week,one_month));
            }
        }


        return dp[last_day];
    }
}