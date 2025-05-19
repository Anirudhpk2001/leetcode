class Solution {
    int[] dp;
    private int helper(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int minCount=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            int result=1+helper(n-(i*i));

            minCount=Math.min(minCount,result);
        }

        return dp[n]=minCount;

    }
    public int numSquares(int n) {
        
        dp=new int[10001];
        Arrays.fill(dp,-1);
        return helper(n);


    }
}