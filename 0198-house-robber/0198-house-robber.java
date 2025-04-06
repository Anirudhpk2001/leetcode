class Solution {

    private int solve(int[] nums, int index,int[] dp)
    {   
        if(index>=nums.length)
        {
            return 0;
        }
        if(dp[index]>-1)
        {
            return dp[index];
        }

        int steal=nums[index]+solve(nums,index+2,dp);
        int skip=solve(nums,index+1,dp);

        
        return dp[index]=Math.max(steal,skip);


        
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        

        return solve(nums,0,dp);
    }
}