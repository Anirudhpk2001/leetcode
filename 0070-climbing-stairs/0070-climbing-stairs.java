class Solution {
    int dp[];
    private int solve(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
           return 1;
        }
        if(dp[n]>-1)
        {
            return dp[n];
        }

        return dp[n]=solve(n-2)+solve(n-1);
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
}