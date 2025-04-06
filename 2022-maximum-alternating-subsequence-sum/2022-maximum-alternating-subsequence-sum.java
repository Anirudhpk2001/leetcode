class Solution {

    private long solve(int[] nums,long dp[][],int index,int flag)
    {
        if(index>=nums.length)
        {
            return 0;
        }

        if(dp[index][flag]>-1)
        {
            return dp[index][flag];
        }
        long skip =solve(nums,dp,index+1,flag);
        int val=nums[index];
        if(flag==0)
        {
            val=-val;
        }

        long take=solve(nums,dp,index+1,1-flag) + val;


        return dp[index][flag]=Math.max(take,skip);
    }
    public long maxAlternatingSum(int[] nums) {
        long dp[][] =new long[nums.length][2];

        for(long[] d:dp)
        {
            Arrays.fill(d,-1);
        }
        

        return solve(nums,dp,0,1);

    }
}