class Solution {

    private int solve(int[] nums, int index , int end,int dp[])
    {
        if(index>end)
        {
            return 0;
        }
        if(index==end)
        {
            return nums[end];
        }

        if(index<nums.length-1 && dp[index]>-1)
        {
            return dp[index];
        }

        int with=nums[index]+solve(nums,index+2,end,dp);
        int skip=solve(nums,index+1,end,dp);

        return dp[index]=Math.max(with,skip);
    }
    public int rob(int[] nums) {

        int[] dp=new int[nums.length];
        if(nums.length==1)
        {
            return nums[0];
        }

        Arrays.fill(dp,-1);

        int include=solve(nums,0,nums.length-2,dp);
        Arrays.fill(dp,-1);
        int skip=solve(nums,1,nums.length-1,dp);


        return Math.max(include,skip);
        
    }
}