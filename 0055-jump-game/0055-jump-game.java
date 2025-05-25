class Solution {
    int[] dp;
    private boolean solve(int nums[],int index)
    {
        if(index>=nums.length)
        {
            return false;
        }
        if(index==nums.length-1)
        {
            return true;
        }
        if(dp[index]>-1)
        {
            return dp[index]==1 ? true : false; 
        }
        boolean result=false;
        for(int i=1;i<=nums[index];i++)
        {
            result= result || solve(nums,index+i);
            
        }

        if(result==true)
        {
            dp[index]=1;
        }
        else
        {
            dp[index]=0;
        }
        return result;
    }
    public boolean canJump(int[] nums) {
        dp=new int[nums.length+1];

        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
}