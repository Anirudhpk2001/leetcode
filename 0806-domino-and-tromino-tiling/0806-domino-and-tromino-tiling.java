class Solution {
    int dp[];
    int m;
    private int solve(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }

        if(n==3)
        {
            return 5;
        }
        
        if(dp[n]>-1)
        {
            return dp[n];
        }
        return dp[n]=((2*solve(n-1)%m) + solve(n-3)%m)%m;
    }
    public int numTilings(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        m=1000000007;
        return solve(n);
    }
}