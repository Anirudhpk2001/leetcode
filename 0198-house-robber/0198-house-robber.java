class Solution {
    int[] dp;
    private int solve(int[] nums,int index)
    {

        if(index>=nums.length)
        {
            return 0;
        }
        if(dp[index] != -1)
        {
            return dp[index];
        }

        int take = nums[index] + solve(nums,index+2);
        int not_take = solve(nums,index+1);

        return dp[index] = Math.max(take,not_take);

    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
}