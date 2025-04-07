class Solution {
    int dp[][];
    int n;


    public int solve(int index,int p,int[] nums)
    {
        if(index>=n)
        {
            return 0;
        }

        if(dp[index][p+1]!=-1)
        {
            return dp[index][p+1];
        }
        int take=0;
        if(p==-1 || nums[index]>nums[p])
        {
             take=1+solve(index+1,index,nums);
        }
        int skip=solve(index+1,p,nums);

        return dp[index][p+1]=Math.max(take,skip);
        
    }
    public int lengthOfLIS(int[] nums) {
        n = nums.length;
        dp = new int[n][n + 1];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }

        return solve(0,-1,nums);
    }
}