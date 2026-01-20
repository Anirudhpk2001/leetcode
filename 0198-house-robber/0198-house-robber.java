class Solution {
    int[] dp;

    private int maxStolen(int[] nums,int index)
    {
        if(index >= nums.length)
        {
            return 0;
        }

        if(dp[index] != -1)
        {
            return dp[index];
        }

        return dp[index] = Math.max(maxStolen(nums,index+1) , nums[index]+maxStolen(nums,index+2));
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);

        return maxStolen(nums,0);
    }
}