class Solution {
    int[] dp;
    private int NumberOfWays(int n)
    {
        if(n <=2 )
        {
            return n;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }

  

        return dp[n] = NumberOfWays(n-1) + NumberOfWays(n-2);
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);

        return NumberOfWays(n);
    }
}