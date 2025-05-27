class Solution {
    int dp[][];
    private int solve(int[] satisfaction,int index,int time)
    {
        if(index>=satisfaction.length)
        {
            return 0;
        }

        if(dp[index][time]!=-1)
        {
            return dp[index][time];
        }
        int include = satisfaction[index]*time + solve(satisfaction,index+1,time+1);
        int dont_include = solve(satisfaction,index+1,time);

        return dp[index][time]=Math.max(include,Math.max(dont_include,0));
    }
    public int maxSatisfaction(int[] satisfaction) {
        dp=new int[satisfaction.length+1][satisfaction.length+1];

        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }

        Arrays.sort(satisfaction);

        return solve(satisfaction,0,1);
    }
}